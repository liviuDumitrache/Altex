package test.UseFilterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.getBaseUrl;
import static pages.BasePage.sleep;

public class UseFilterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(UseFilterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";


    @Test
            public void useFilter(){

        sleep(1000);

        LOG.info("Pres permite toate");
        signInPage.pressPermiteToate();


        LOG.info("Click hamburger button");
        useFilterPage.clickHamburgerButton();

        LOG.info("Click 'TV,Audio-Video,Foto' button");
        useFilterPage.clickTvAudioFotoButton();

        LOG.info("Click 'Televizoare' button");
        useFilterPage.clickTelevizoareButton();

        LOG.info("Click in stoc button");
        useFilterPage.clickInStocButton();

        LOG.info("Click pret filter");
        useFilterPage.clickPretFilter();

        LOG.info("Click SAMSUNG brand filter");
        useFilterPage.clickBrandFilter();








    }








}
