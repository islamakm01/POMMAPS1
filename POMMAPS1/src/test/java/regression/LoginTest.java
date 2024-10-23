package regression;
import Processs.LoginProcess;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends SetUp {
    LoginProcess lp;

    @Test
    public void correctUserNamePassword() {
         lp = new LoginProcess(driver);
        lp.loginValidUser();
        Assert.assertEquals(LoginProcess.expectedUsername, LoginProcess.actualUsername);
       //Assert.assertNotEquals("Login with application" ,LoginProcess.signinMessage);
    }

    @Test
    public void verifyURL() {
        Assert.assertEquals(lp.getURL(),LoginProcess.expectedURL);
    }


}
