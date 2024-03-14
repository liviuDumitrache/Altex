package pages.NewsletterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class NewsletterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(NewsletterPage.class);
    public static NewsletterPage instance;

    public static NewsletterPage getInstance() {
        if (instance == null) {
            instance = new NewsletterPage();
        }
        return instance;
    }

    private By abonareNewsletter = By.xpath("//a[text()='Abonare newsletter']");
    private By emailField = By.xpath("//div[@class='md:mr-4 md:min-w-280px']//input[@name='email']");
    private By aboneazaTeButton = By.xpath("//span[text()='Aboneaza-te']");


    public void clickAbonare() {
        LOG.info("Click 'Abonare newsletter'button");
        driver.findElement(abonareNewsletter).click();
    }

    public void inputEmail(String email) {
        LOG.info("Input email ");
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickAbonezaTeButton() {
        LOG.info("Click'Aboneaza-te' button");
        driver.findElement(aboneazaTeButton).click();
    }

    public boolean isTe_aiAbonatDisplayed() {
        LOG.info("Is succes message displayed");
        return driver.findElement(aboneazaTeButton).isDisplayed();
    }


}