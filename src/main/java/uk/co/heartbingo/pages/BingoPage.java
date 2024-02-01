package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.heartbingo.utility.Utility;

public class BingoPage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class);
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Online Bingo']")
    WebElement textOnOnlineBingo;


    public String getTextOnlineBingo() {
        log.info("Getting Text online Bingo : " + textOnOnlineBingo.getText());
         return getTextFromElement(textOnOnlineBingo);
    }

}
