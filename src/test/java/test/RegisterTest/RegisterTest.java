package test.RegisterTest;

import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.getBaseUrl;
import static pages.BasePage.sleep;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    String prenume = "Florin";
    String nume = "Pop";
    String email = "ceva.altceva@" + RandomStringUtils.randomAlphanumeric(5) + ".com";
    String numarDeTelefon = "0769143522";
    String parola = "Parola123";

    @Test

    public void register() {
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

        sleep(1000);

        LOG.info("Click agree terms");
        registerPage.clickAgreeTerms();

        LOG.info("Click intregistrare button");
        registerPage.clickRegister();





    }


}
