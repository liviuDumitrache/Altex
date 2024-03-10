package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.FinantarePage.FinantarePage;
import pages.NewsletterPage.NewsletterPage;
import pages.SearchBarPage.SearchBarPage;
import pages.SignInPage.SignInPage;
import pages.RegisterPage.RegisterPage;
import pages.UseFilterPage.UseFilterPage;


public class BaseTest {
    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public UseFilterPage useFilterPage = UseFilterPage.getInstance();
    public SearchBarPage searchBarPage = SearchBarPage.getInstance();
    public FinantarePage finantarePage = FinantarePage.getInstance();
    public NewsletterPage newsletterPage = NewsletterPage.getInstance();




    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }

}
