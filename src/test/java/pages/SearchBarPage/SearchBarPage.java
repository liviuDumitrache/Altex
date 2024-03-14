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

    private By telefoaneTablete = By.xpath("(//a[text()='Telefoane, Tablete'])[2]");
    private By telefoane = By.xpath("//a[text()='Telefoane']");
    private By filtruSamsung = By.xpath("//span[text()='SAMSUNG']");
    private By s24Filter = By.xpath("//span[text()='GALAXY S24 ULTRA']");
    private By telS24Ultra = By.xpath("//span[text()='Telefon SAMSUNG Galaxy S24 Ultra 5G, 256GB, 12GB RAM, Dual SIM, Titanium Gray']");
    private By adaugaInCos = By.xpath("//button/span/span[text()='Adauga in cos']");
    private By veziDetaliiCos = By.xpath("(//span[text()=\"Vezi detalii cos\"])[1]");
    private By stergeProdus = By.xpath("//span[text()='Sterge']");
    private By cosulEsteGol = By.xpath("//h1[text()='Nu ai produse in cos.']");


    public void clickTelefoaneTablete() {
        LOG.info("Click on 'Telefoane,tablete' button");
        driver.findElement(telefoaneTablete).click();
    }

    public void clickTelefoane() {
        LOG.info("Click 'Telefoane' button");
        driver.findElement(telefoane).click();
    }

    public void clickSamsungFilter() {
        LOG.info("Click 'SAMSUNG' filter");
        driver.findElement(filtruSamsung).click();
    }

    public void clicS24Filter() {
        LOG.info("Click S24 filter");
        driver.findElement(s24Filter).click();
    }

    public void clickTelS24Ultra() {
        LOG.info("Click on 'SAMSUNG S24 Titanium Grey'");
        driver.findElement(telS24Ultra).click();
    }

    public void clickAdaugaInCos() {
        LOG.info("Click 'Adauga in cos'");
        driver.findElement(adaugaInCos).click();
    }

    public void clickVeziDetaliiCos() {
        LOG.info("Click on vezi detalii cos");
        driver.findElement(veziDetaliiCos).click();
    }

    public void clickStergeProdus() {
        LOG.info("click on 'Sterge' produs");
        driver.findElement(stergeProdus).click();
    }

    public boolean isNuAiProduseInCosDisplayed() {
        LOG.info("Verfy if 'Nu ai produse in cos' message is dispalyed");
        return driver.findElement(cosulEsteGol).isDisplayed();
    }


}