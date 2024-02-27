package test.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import test.BaseTest;

import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    @Test

    public void register(){
        signInPage.clickContButton();

    }



}
