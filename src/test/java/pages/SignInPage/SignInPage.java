package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;

    }

    private By logo = By.xpath("//a[@class='Header-logo block bg-no-repeat ']");
    private By contButton = By.xpath("//span [text()='Cont']");
    private By emailField = By.xpath("//div[@class='pb-2']//input[@autocomplete='username']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By autentificareButton = By.xpath("//button[@type='submit']/span/span[text()='Autentificare']");
    private By iesiDinCont = By.xpath("//a[text()='Iesi din cont']");
    private By permiteCookies = By.xpath("//button[text()='Permite toate']");
    private By error = By.xpath("//body[@class='root h-screen']");


    public boolean isLogoDisplayed() {
        LOG.info("Very if logo image is displayed");
        return driver.findElement(logo).isDisplayed();
    }

    public void pressPermiteToate() {
        LOG.info("Press permite toate");
        driver.findElement(permiteCookies).click();

    }


    public void clickContButton() {
        LOG.info("Click 'Cont' button");
        driver.findElement(contButton).click();
    }

    public void insertEmail(String Email) {
        LOG.info("Imput 'Email' in field");
        driver.findElement(emailField).sendKeys(Email);
    }

    public void insertPassword(String Password) {
        LOG.info("imput 'Password' in field ");
        driver.findElement(passwordField).sendKeys(Password);
    }

    public void clickAutentificareButton() {
        LOG.info("Click 'Autentificare' button");
        driver.findElement(autentificareButton).click();
    }


}
