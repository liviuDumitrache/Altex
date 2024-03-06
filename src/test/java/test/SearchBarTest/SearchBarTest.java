package test.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import test.BaseTest;
import static pages.BasePage.*;
import static pages.BasePage.getBaseUrl;

public class SearchBarTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String cautarTelefon  = "Telefon SAMSUNG Galaxy A34 5G";

    @Test

    public void searchBar(){
        sleep(1000);

        LOG.info("Pres permite toate");
        signInPage.pressPermiteToate();

        LOG.info("Introdu produsul cautat ");
        searchBarPage.insert();






    }



}
