package pages.SearchBarPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SearchBarPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarPage.class);
    public static SearchBarPage instance;

    private SearchBarPage() {
    }

    public static SearchBarPage getInstance() {
        if (instance == null) {
            instance = new SearchBarPage();
        }
        return instance;
    }

    private By insertProdus = By.xpath("//input[@placeholder='Cauta produsul dorit']");
    private By lupa = By.xpath("")



    public void insert(String cautareTelefon ){
        LOG.info("Insert produsul dorit");
        driver.findElement(insertProdus).sendKeys();
    }


}