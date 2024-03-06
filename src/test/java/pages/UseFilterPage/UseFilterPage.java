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
    private By pretFilter1500 = By.xpath("//body/div[@id='__next']/div[@class='content-wrapper relative grow flex flex-col justify-between']/div[@class='container']/main[@class='flow-root']/div[@class='lg:flex']/div[1]");
    private By brandFilter = By.xpath("//body/div[@id='__next']/div[@class='content-wrapper relative grow flex flex-col justify-between']/div[@class='container']/main[@class='flow-root']");



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



    }










