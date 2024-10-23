package Processs;
import PageObject.LoginPage;
import Utility.BaseClass;
import org.openqa.selenium.WebDriver;

public class LoginProcess  extends BaseClass {
    LoginPage lp;

   public static String expectedUsername = "ylvisc1";
   public static String actualUsername;
    public static String signinMessage;
    public static String expectedURL = "https://mapsdvalid.pace.medtronic.com/HubMAPS/app_views/hub_maps_wam.html#w_0_0=32&npx=pr";
    public LoginProcess(WebDriver driver) {
        super(driver);
    }

    public void loginValidUser() {
        lp = new LoginPage(driver);
        lp.userName().sendKeys("ylvisc1");
        lp.password().sendKeys("xrccd59");
        lp.submit().click();
        //signinMessage =  lp.SignInFailed().getText();
        lp.getAccountPanel().click();
        actualUsername = lp.getUsername().getText();
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }
}
