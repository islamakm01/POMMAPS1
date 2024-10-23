package PageObject;

import Utility.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
    public WebElement element = null;
    public static String username = "gwt-uid-2";
    public static String password = "//input[@class='gwt-PasswordTextBox']";
    public static String submit = "//button[text()='Submit']";
    public static String accountPanel = "Open account panel";
    public static String usernameXpath = "//div[text()='ylvisc1']";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement userName() {
        element = getElementById(username);
        return element;
    }
    public WebElement password() {
        element = getElementByXpath(password);
        return element;
    }

    public WebElement submit() {
        element = getElementByXpath(submit);
        return element;
    }

    public WebElement getAccountPanel() {
        element = getElementById(accountPanel);
        return element;
    }

    public WebElement getUsername() {
        element = getElementByXpath(usernameXpath);
        return element;
    }

    public WebElement SignInFailed()
    {
        element = getElementByXpath("//div[text()='Sign in failed.']");
        return element;
    }





}
