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
    private By imputPrenume = By.xpath("//input[@label='Prenume']");
    private By imputNume = By.xpath("//input[@label='Nume']");
    private By imputEmailAdress = By.xpath("//form/div[@class='pb-2']//input[@name='email']");
    private By numar = By.xpath("//input[@name='telephone']");
    //private By parola = By.xpath("");


    public void clickInregistrareButton() {
        LOG.info("Click 'Inregistrare' button");
        driver.findElement(inregistrareButton).click();
    }

    public void insertPrenume(String prenume) {
        LOG.info("Insert prenume");
        driver.findElement(imputPrenume).sendKeys(prenume);
    }

    public void insertNume(String nume){
        LOG.info("Insert prenume");
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






}
