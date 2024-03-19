package test.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.getBaseUrl;
import static pages.BasePage.sleep;

public class SearchBarTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String cautareTelefon = "Telefon SAMSUNG Galaxy S23 FE 5G, 256GB";

    @Test

    public void searchBar() {
        sleep(1000);

        LOG.info("Pres permite toate");
        signInPage.pressPermiteToate();

        LOG.info("Click hamburger button");
        useFilterPage.clickHamburgerButton();

        LOG.info("Click on 'Telefoane,tablete' button");
        searchBarPage.clickTelefoaneTablete();
        sleep(1000);

        LOG.info("Click'Telefoane' button");
        searchBarPage.clickTelefoane();

        sleep(1000);

        LOG.info("Click 'SAMSUNG' filter ");
        searchBarPage.clickSamsungFilter();
        sleep(1000);

        LOG.info("Click S24 filter");
        searchBarPage.clicS24Filter();
        sleep(1000);

        LOG.info("Click o 'SAMSUNG S24 Titanium Grey'");
        searchBarPage.clickTelS24Ultra();
        sleep(1000);

        LOG.info("Click 'Adauga in cos'");
        searchBarPage.clickAdaugaInCos();
        sleep(2000);

        LOG.info("Click on vezi detalii cos ");
        searchBarPage.clickVeziDetaliiCos();
        sleep(1000);

        LOG.info("Click on 'Sterge' produs ");
        searchBarPage.clickStergeProdus();
        sleep(1000);

        LOG.info("Verfy if 'Nu ai produse in cos' is displayed");
        Assert.assertTrue(searchBarPage.isNuAiProduseInCosDisplayed(), "Nu ai produse in cos message  is not displayed");

        sleep(3000);
    }

}
