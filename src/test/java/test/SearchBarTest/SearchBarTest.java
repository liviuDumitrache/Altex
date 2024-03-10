package test.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.BaseTest;
import static pages.BasePage.*;
import static pages.BasePage.getBaseUrl;

public class SearchBarTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String cautareTelefon  = "Telefon SAMSUNG Galaxy A34 5G";

    @Test

    public void searchBar(){
        sleep(1000);

        LOG.info("Pres permite toate");
        signInPage.pressPermiteToate();

        LOG.info("Introdu produsul cautat ");
        searchBarPage.enterText(cautareTelefon);

        LOG.info("Click on magnifying glass");
        searchBarPage.clickLupa();

        sleep(2000);

        LOG.info("Click on SAMSUNG A 34");
        searchBarPage.clickTelSamsungA54();
        sleep(2000);


        LOG.info("Click 'Adauga in cos'");
        searchBarPage.clickAdaugaInCos();

        sleep(3000);

        LOG.info("Click on vezi detalii cos ");
        searchBarPage.clickVeziDetaliiCos();
        sleep(2000);

        LOG.info("Click on 'Sterge' produs ");
        searchBarPage.clickStergeProdus();
        sleep(1000);

        LOG.info("Verfy if 'Nu ai produse in cos' is displayed");
        Assert.assertTrue(searchBarPage.isNuAiProduseInCosDisplayed(),"Nu ai produse in cos message  is not displayed");








    }



}
