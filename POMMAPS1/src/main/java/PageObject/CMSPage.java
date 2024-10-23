package PageObject;

import Utility.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMSPage extends BaseClass {
    public CMSPage(WebDriver driver) {
        super(driver);
    }
    public WebElement element = null;

    public static String openSearchPanel = "Open search panel";
    public static String selectSearchType = "//select[@class ='gwt-ListBox browser-default'][1]";
    public static String enTextModuleFilter = "//option[text()='English Text Modules']";
    public static String addFilters = "add_filter";

    public WebElement getOpenSearchPanel() {
        element = getElementById(openSearchPanel);
        return element;
    }
    public WebElement getSearchType() {
        element = getElementByXpath(selectSearchType);
        return element;
    }

    public WebElement getActualEnTextModuleFilter() {
        element = getElementByXpath(enTextModuleFilter);
        return element;
    }

    public WebElement getAddFiltersButton() {
        element = getElementById(addFilters);
        return element;
    }


}
