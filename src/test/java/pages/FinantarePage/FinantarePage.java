package pages.FinantarePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;



public class FinantarePage extends BasePage{
    public static final Logger LOG = LoggerFactory.getLogger(FinantarePage.class);
    public static FinantarePage instance;


    public static FinantarePage getInstance() {
        if (instance == null) {
            instance = new FinantarePage();
        }
        return instance;
    }

    private By finantareButton =By.xpath("//a[text()='Finantare']");
    private By carduri = By.xpath("//a[text()='Carduri de credit']");
    private By brdCard = By.xpath("//img[@alt='BRD']");
    private By transilvaniaCard = By.xpath("//img[@alt='Banca Transilvania']");
    private By ingCard = By.xpath("//img[@alt='ING Credit Card']");
    private By veziRegulament = By.xpath("//a[text()='Vezi regulament']");
    private By regulamentTab = By.xpath("//li[@class='inline']");



    public void clickFinantareButton(){
        LOG.info("Click 'Finantare' button");
        driver.findElement(finantareButton).click();
    }

    public void clickCarduriDeCredit(){
        LOG.info("Click 'Carduri de credit' button");
        driver.findElement(carduri).click();
    }

    public boolean isBrdCardDisplayed(){
        LOG.info("Is BRD card iamage displayed");
        return driver.findElement(brdCard).isDisplayed();
    }

    public boolean isTransilvaniaCardDisplayed(){
        LOG.info("Is 'Banca Transilvania' card displayed");
        return driver.findElement(transilvaniaCard).isDisplayed();
    }

    public boolean isIngCardDisplayed(){
        LOG.info("Is 'ING' card displayed");
        return driver.findElement(ingCard).isDisplayed();
    }

    public void clickVeziRegulament(){
        LOG.info("Click on 'Vezi regulament' button");
        driver.findElement(veziRegulament).click();
    }

    public boolean isRegulamentDisplayed(){
        LOG.info("Is Regulament campanie new tab displayed");
        return driver.findElement(regulamentTab).isDisplayed();
    }




}
