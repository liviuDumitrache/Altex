package test.FinantareTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.getBaseUrl;
import static pages.BasePage.sleep;


public class FinantareTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(FinantareTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    @Test

    public void clicFinantare() {
        sleep(1000);
        LOG.info("Pres permite toate");
        signInPage.pressPermiteToate();

        LOG.info("Click 'Finantare' button");
        finantarePage.clickFinantareButton();
        sleep(1000);

        LOG.info("Click on 'Carduri de credit' button");
        finantarePage.clickCarduriDeCredit();
        sleep(1000);

        LOG.info("Verfy if BRD card image is displayed");
        Assert.assertTrue(finantarePage.isBrdCardDisplayed(), "BRD card image is not displayed");
        sleep(1000);

        LOG.info("Verfy if 'Banca Transilvania' card is displayed");
        Assert.assertTrue(finantarePage.isTransilvaniaCardDisplayed(), "'BancaTransilvania' card image is not displayed");
        sleep(1000);

        LOG.info("Vreify if 'ING' vard image is displayed");
        Assert.assertTrue(finantarePage.isIngCardDisplayed(), "'ING' card image is not dysplayed");
        sleep(1000);

        LOG.info("Click 'Vezi regulament' button");
        finantarePage.clickVeziRegulament();
        sleep(1000);

        LOG.info("Verfy if Regulament campanie is displayed in new tab");
        Assert.assertTrue(finantarePage.isRegulamentDisplayed(), "Regulament campanie is not opend in new tab");
        sleep(2000);

    }
}
