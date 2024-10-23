package PageObject;

import Utility.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthoringPage extends BaseClass {
    public AuthoringPage(WebDriver driver) {
        super(driver);
    }
    public WebElement element = null;

    public static String appsButton="appViewMenu";
    public static String authoringApp = "//img[@title ='Authoring']";
    public static String authoring = "//span[@id ='appViewMenu']";


    public WebElement clickApps() {
        element = getElementById(appsButton);
        return element;
    }

    public WebElement authoring() {
        element = getElementByXpath(authoringApp);
        return element;
    }

    public WebElement authoringText() {
        element = getElementByXpath(authoring);
        return element;
    }

}
