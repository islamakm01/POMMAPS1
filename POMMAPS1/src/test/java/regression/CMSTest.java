package regression;

import Processs.CMSProcess;
import Processs.LoginProcess;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CMSTest extends SetUp{
    LoginProcess lp;
    CMSProcess cp;

@Test(description = "5720")
    public void searchEnglishTextModuleUsingText() {
    lp = new LoginProcess(driver);
    cp = new CMSProcess(driver);

    // Step 10
    lp.loginValidUser();
    // Step 20
    cp.clickOpenSearchPanel();
    cp.selectEnTextModuleSearchType();
    Assert.assertEquals(CMSProcess.actualEnTextModuleSearchTypeText, CMSProcess.expectedEnTextModuleSearchTypeText);


}


}
