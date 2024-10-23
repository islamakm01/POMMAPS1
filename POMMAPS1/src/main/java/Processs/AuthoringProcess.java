package Processs;

import PageObject.AuthoringPage;
import Utility.BaseClass;
import org.openqa.selenium.WebDriver;

public class AuthoringProcess extends BaseClass {
    public AuthoringProcess(WebDriver driver) {
        super(driver);
    }
    AuthoringPage ap;
    public static String expectedAuhoringText = "Authoring";
    public static String actualAuhoringText;

    public void clickAppsButton() {
        ap = new AuthoringPage(driver);
        ap.clickApps().click();
    }

    public void clickAuthoringApp() {
        ap.authoring().click();
    }

    public String AuthoringGetText() {
        actualAuhoringText = ap.authoringText().getText();
        return actualAuhoringText;
    }
}
