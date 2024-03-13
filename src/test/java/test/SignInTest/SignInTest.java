package test.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;


public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() throws InterruptedException {
        String email = "leeviu07@yahoo.com";
        String password = "X4rW*Q*gCH3juqj";


        LOG.info("Verfy if logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Pres permite toate");
        signInPage.pressPermiteToate();



        LOG.info("Click 'Cont' button ");
        signInPage.clickContButton();


        LOG.info("Insert Email ");
        signInPage.insertEmail(email);

        LOG.info("Insert Password");
        signInPage.insertPassword(password);

        Thread.sleep(1000);

        LOG.info("Click 'Autentificare' button");
        signInPage.clickAutentificareButton();

        Thread.sleep(5000);
















    }


}
