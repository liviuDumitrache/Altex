package test.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String prenume = "Ion";
    String nume = "Popescu";
    String email = "maroha2658@huizk.com";
    String numarDeTelefon = "0745123456";
    String parola = "Parola1";

    @Test

    public void register(){
        sleep(1000);
        LOG.info("Pres permite toate");
        signInPage.pressPermiteToate();

        signInPage.clickContButton();

        LOG.info("Click 'Inregistrare' button ");
        registerPage.clickInregistrareButton();

        LOG.info("Type in Prenume");
        registerPage.insertPrenume(prenume);


        LOG.info("Type in Nume");
        registerPage.insertNume(nume);

        LOG.info("Type in Email Adress");
        registerPage.insertEmailAdress(email);

        LOG.info("Type in Numar de Telefon");
        registerPage.insertNumarDeTelefon(numarDeTelefon);

        LOG.info("Type in parola");
        registerPage.insertParola(parola);

        sleep(5000);

        LOG.info("Click agree terms");
        registerPage.clickAgreeTerms();

        LOG.info("Click intregistrare button");
        registerPage.clickRegister();

        sleep(5000);

//        signInPage.clickContButton();
//
//        sleep(5000);
//
//        LOG.info("Click iesi din cont");
//        registerPage.clickIesiDinCont();




        sleep(2000L);

    }



}
