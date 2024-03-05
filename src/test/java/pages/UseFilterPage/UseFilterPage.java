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

    private By hamburgerButton = By.id("MobileMenuTriggerButton");
    private By tvAudioFoto = By.xpath("//a[@style='font-size:15px;line-height:36px'][text()='TV, Audio-Video, Foto']");
    private By televizoare = By.xpath("//li[@class='ml-4']/a[text()='Televizoare']");
    private By filtreaza = By.xpath("//button[.='Filtreaza']");
    private By pretFilter = By.xpath("//div[@class='text-14px'][text()='Pret']");
    private By range1000_1500 = By.xpath("//ul[@class='mb-8']/li[3]//span[@class='checkbox-control inline-block align-top w-5 h-5 p-1 mr-2 border-gray-light border rounded-4px bg-white ']");


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

    public void clickFiltreazaButton(){
        LOG.info("Click 'Filtreaza' button");
        driver.findElement(filtreaza).click();
    }

    public void clickPretFilterButton(){
        LOG.info("Click 'Pret' filter");
        driver.findElement(pretFilter).click();
    }







}


