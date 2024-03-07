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
    private By lupa = By.xpath("//button[@type='submit'][@title='Cauta']");
    private By telSamsungA54 =By.xpath("//span[text()='Telefon SAMSUNG Galaxy A34 5G, 128GB, 6GB RAM, Dual SIM, Awesome Lime']");
    private By adaugaInCos = By.xpath("//button/span/span[text()='Adauga in cos']");
    private By veziDetaliiCos = By.xpath("//span[text()='Vezi detalii cos']/parent::span[@class='inline-block  min-w-[140px]']");



    public void enterText (String cautareTelefon ){
        LOG.info("Insert produsul dorit");
        driver.findElement(insertProdus).sendKeys(cautareTelefon);
    }

    public void clickLupa(){
        LOG.info("Click on magnifying glass");
        driver.findElement(lupa).click();
    }


    public void clickTelSamsungA54(){
        LOG.info("Click on SAMSUNG A 54");
        driver.findElement(telSamsungA54).click();
    }

    public void clickAdaugaInCos(){
        LOG.info("Click 'Adauga in cos'");
        driver.findElement(adaugaInCos).click();
    }

    public void clickVeziDetaliiCos(){
        LOG.info("Click on vezi detalii cos");
        driver.findElement(veziDetaliiCos).click();
    }




}