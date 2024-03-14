package test.UseFilterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.getBaseUrl;
import static pages.BasePage.sleep;

public class UseFilterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(UseFilterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";


    @Test
    public void useFilter() {

        sleep(1000);

        LOG.info("Pres permite toate");
        signInPage.pressPermiteToate();


        LOG.info("Click hamburger button");
        useFilterPage.clickHamburgerButton();

        LOG.info("Click 'TV,Audio-Video,Foto' button");
        useFilterPage.clickTvAudioFotoButton();


        LOG.info("Click 'Televizoare' button");
        useFilterPage.clickTelevizoareButton();

        sleep(1000);

        LOG.info("Click in stoc button");
        useFilterPage.clickInStocButton();

        sleep(1000);


        LOG.info("Click pret filter");
        useFilterPage.clickPretFilter();

        sleep(2000);

        LOG.info("Click SAMSUNG brand filter");
        useFilterPage.clickBrandFilter();

        sleep(5000);

        LOG.info("Check 'In stoc' button");
        Assert.assertTrue(useFilterPage.isInStocButtonDisplayed(), "Button is not displayed");
        sleep(1000);

        LOG.info("Verify if if 1500_2000 button is displayed");
        Assert.assertTrue(useFilterPage.isPret1500_2000ButtonDisplayed(), "Button is not displayed");
        sleep(1000);

        LOG.info(" Verify if 'SAMSUNG' button is displayed");
        Assert.assertTrue(useFilterPage.isSamsungButtonDisplayed(), "SAMSUNG button is not displayed");

        LOG.info("Click sterge filtre");
        useFilterPage.clickStergeFiltre();


    }


}
