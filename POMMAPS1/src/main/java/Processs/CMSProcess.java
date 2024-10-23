package Processs;

import PageObject.CMSPage;
import Utility.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CMSProcess extends BaseClass {
    public CMSProcess(WebDriver driver) {
        super(driver);
    }
    CMSPage cp;

    public static String expectedEnTextModuleSearchTypeText = "English Text Modules";
    public static String actualEnTextModuleSearchTypeText;
    public void clickOpenSearchPanel() {
        cp = new CMSPage(driver);
        cp.getOpenSearchPanel().click();
    }

    public String getEnTextModuleSearchTypeText() {
        actualEnTextModuleSearchTypeText = cp.getActualEnTextModuleFilter().getText();
        System.out.println(actualEnTextModuleSearchTypeText);
        return actualEnTextModuleSearchTypeText;
    }

    public void selectEnTextModuleSearchType() {
        cp.getSearchType();
        Select select = new Select(cp.getSearchType());
        select.selectByValue("3000");
        //cp.getAddFiltersButton().click();
    }
}
