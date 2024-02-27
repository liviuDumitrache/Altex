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

    private By inregistrareButton = By.xpath("//a[@class='underline hover:text-bleu-hover text-red-brand text-sm leading-15.6']");
    private By imputPrenume = By.xpath("//input[@label='Prenume']");
    private By imputNume = By.xpath("//input[@label='Nume']");


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






}
