package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

import java.sql.Driver;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By inregistrareButton = By.xpath("//div/a[@class='underline hover:text-bleu-hover text-red-brand text-sm leading-15.6']");
    private By imputPrenume = By.xpath("//input[@name='first_name']");
    private By imputNume = By.xpath("//input[@name='last_name']");
    private By imputEmailAdress = By.xpath("//input[@autocomplete='off']");
    private By numar = By.xpath("//input[@name='telephone']");
    private By parola1 = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/main[1]/div[1]/section[1]/form[1]/div[5]/input[1]");
    private By parola2 = By.xpath("//input[@name='password_confirm']");


    public void clickInregistrareButton() {
        LOG.info("Click 'Inregistrare' button");
        driver.findElement(inregistrareButton).click();
    }

    public void insertPrenume(String prenume) {
        LOG.info("Insert prenume");
        driver.findElement(imputPrenume).sendKeys(prenume);
    }

    public void insertNume(String nume){
        LOG.info("Insert nume");
        driver.findElement(imputNume).sendKeys(nume);
    }

    public void insertEmailAdress(String email){
    LOG.info("Insert email adress");
    driver.findElement(imputEmailAdress).sendKeys(email);
    }

    public void insertNumarDeTelefon(String numarDeTelefon){
        LOG.info("Insert Numar de Telefon");
        driver.findElement(numar).sendKeys(numarDeTelefon);
    }

    public void insertParola(String parola){
        LOG.info("Insert parola");
        driver.findElement(parola1).sendKeys(parola);
    }









}
