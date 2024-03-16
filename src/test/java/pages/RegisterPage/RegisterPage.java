package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;



public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By inregistrareButton = By.xpath("//a[text()='Inregistrare']");
    private By imputPrenume = By.xpath("//input[@name='first_name']");
    private By imputNume = By.xpath("//input[@name='last_name']");
    private By imputEmailAdress = By.xpath("//input[@autocomplete='off']");
    private By numar = By.xpath("//input[@name='telephone']");
    private By parola1 = By.xpath("//form[@class='text-sm ']//input[@name='password']");
    private By parola2 = By.xpath("//input[@name='password_confirm']");
    private By agreeTerms = By.xpath("//span[@class='checkbox-control flex-none w-5 h-5 p-1 mr-2 border-gray-light border rounded-4px bg-white is-required']");
    private By register = By.xpath("//span[text()='Inregistrare']");





    public void clickInregistrareButton() {
        LOG.info("Click 'Inregistrare' button");
        driver.findElement(inregistrareButton).click();
    }

    public void insertPrenume(String prenume) {
        LOG.info("Insert prenume");
        driver.findElement(imputPrenume).sendKeys(prenume);
    }

    public void insertNume(String nume) {
        LOG.info("Insert nume");
        driver.findElement(imputNume).sendKeys(nume);
    }

    public void insertEmailAdress(String email) {
        LOG.info("Insert email adress");
        driver.findElement(imputEmailAdress).sendKeys(email);
    }

    public void insertNumarDeTelefon(String numarDeTelefon) {
        LOG.info("Insert Numar de Telefon");
        driver.findElement(numar).sendKeys(numarDeTelefon);
    }

    public void insertParola(String parola) {
        LOG.info("Insert parola");
        driver.findElement(parola1).sendKeys(parola);
        driver.findElement(parola2).sendKeys(parola);
    }

    public void clickAgreeTerms() {
        LOG.info("Click agree terms");
        driver.findElement(agreeTerms).click();
    }

    public void clickRegister() {
        LOG.info("Click inregistrare button");
        driver.findElement(register).click();
    }






}
