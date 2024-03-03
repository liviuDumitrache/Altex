package test.UseFilterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;

public class UseFilterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(UseFilterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";


    @Test

    public void clickHambugerButton() {
        LOG.info("Click hamburger button");
        useFilterPage.clickHamburgerButton();
    }

    public void clickTvAudioFotoButton(){
        useFilterPage.clickTvAudioFotoButton();
    }

    public void  clickTelevizoareButton(){
        useFilterPage.clickTelevizoareButton();
    }

    public void clickFiltreazaButton(){
        useFilterPage.clickFiltreazaButton();
    }



}
