package regression;

import Processs.AuthoringProcess;
import Processs.LoginProcess;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthoringTest extends SetUp{
    LoginProcess lp;
    AuthoringProcess ap;

@Test (description = "Go to Auhoring App")
    public void goToAuthoring() {
    lp = new LoginProcess(driver);
    ap = new AuthoringProcess(driver);

    lp.loginValidUser();
    ap.clickAppsButton();
    ap.clickAuthoringApp();
    Assert.assertEquals(ap.AuthoringGetText(), AuthoringProcess.expectedAuhoringText);
}
}
