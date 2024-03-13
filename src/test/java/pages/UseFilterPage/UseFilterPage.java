package pages.UseFilterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class UseFilterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(UseFilterPage.class);
    public static UseFilterPage instance;

    public static UseFilterPage getInstance() {
        if (instance == null) {
            instance = new UseFilterPage();
        }
        return instance;
    }

    private By hamburgerButton = By.xpath("//span[text()='Produse']/parent::a");
    private By tvAudioFoto = By.xpath("//a[@style='padding-top:8px;padding-bottom:7px;line-height:17px'][text()='TV, Audio-Video, Foto']");
    private By televizoare = By.xpath("//a[@style='line-height:21px;padding-bottom:9px'][text()='Televizoare']");
    private By inStocFilter = By.xpath("//span[@class='flex']/span[text()='In stoc']");
    private By pretFilter1500 = By.xpath("//span[text()='1000 - 1500']");
    private By brandFilter = By.xpath("//span[text()='SAMSUNG']");
    private By stergeFiltre = By.xpath("//a[text()='sterge tot']");
    private By inStocButton = By.xpath("//span[text()='In stoc']/parent::a");
    private By pret1500_2000 = By.xpath("//a/span[text()='1000-1500']");
    private By samsungButton = By.xpath("//a/span[text()='SAMSUNG']");




    public void clickHamburgerButton() {
        LOG.info("Click hamburger button");
        driver.findElement(hamburgerButton).click();
    }

    public void clickTvAudioFotoButton(){
        LOG.info("Click 'TV,Audio-Video,Foto' button");
        driver.findElement(tvAudioFoto).click();
    }

    public void clickTelevizoareButton(){
        LOG.info("Click 'Televizoare' button");
        driver.findElement(televizoare).click();
    }

    public void clickInStocButton(){
        LOG.info("Click in stoc button");
        driver.findElement(inStocFilter).click();
    }


    public void clickPretFilter(){
        LOG.info("Click ptret filter");
        driver.findElement(pretFilter1500).click();
    }

    public void clickBrandFilter(){
        LOG.info("Click SAMSUNG brand filter");
        driver.findElement(brandFilter).click();
    }


    public boolean isInStocButtonDisplayed(){
        LOG.info("Verify if 'In stoc' button is displayed");
        return driver.findElement(inStocButton).isDisplayed();
    }

    public boolean isPret1500_2000ButtonDisplayed(){
        LOG.info("Verify if 1500_2000 button is displayed");
        return driver.findElement(pret1500_2000).isDisplayed();
    }

    public boolean isSamsungButtonDisplayed(){
        LOG.info("Verify if 'SAMSUNG' button is displayed");
        return driver.findElement(samsungButton).isDisplayed();
    }


    public void clickStergeFiltre(){
        LOG.info("Clic sterge tot");
        driver.findElement(stergeFiltre).click();
    }





    }










