package pages.UseFilterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class UseFilterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(UseFilterPage.class);
    public static UseFilterPage instance;

    public static UseFilterPage getInstance() {
        if (instance == null) {
            instance = new UseFilterPage();
        }
        return instance;
    }

    private By hamburgerButton = By.id("MobileMenuTriggerButton");
    private By tvAudioFoto = By.xpath("//a[@style='font-size:15px;line-height:36px'][text()='TV, Audio-Video, Foto']");


    public void clickHamburgerButton () {
        LOG.info("Click hamburger button");
        driver.findElement(hamburgerButton).click();
    }




}


