package test.NewsletterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewsletterPage.NewsletterPage;
import test.BaseTest;

import static pages.BasePage.getBaseUrl;
import static pages.BasePage.sleep;

public class NewsletterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(NewsletterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String email = "vefidox922@aersm.com";


    @Test

    public void newsletter() {
        LOG.info("Pres permite toate");
        signInPage.pressPermiteToate();

        LOG.info("Click 'Abonare newsletter' button");
        newsletterPage.clickAbonare();
        sleep(2000);

        LOG.info("Input email");
        newsletterPage.inputEmail(email);

        LOG.info("Click 'Aboneaza-te' button");
        newsletterPage.clickAbonezaTeButton();

        LOG.info("Verify if succes message is displayed");
        Assert.assertTrue(newsletterPage.isTe_aiAbonatDisplayed(),"Succes mesage is not displayed");


    }

}
