package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.heartbingo.utility.Utility;

public class Homepage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class);
    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Bingo']")
    WebElement bingoLink;

    @CacheLookup
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptCookies;


    @CacheLookup
    @FindBy(linkText = "Log In")
    WebElement loginLink;


    public void clickOnBingoLink() {
        log.info("Clicking on login Link : " + bingoLink.toString());
        clickOnElement(bingoLink);
    }

    public void clickOnAcceptAllCookies() {
        log.info("Clicking on acceptCookies : " + acceptCookies.toString());
        mouseHoverToElementAndClick(acceptCookies);
    }


    public void clickOnLoginLink() {
        log.info("Clicking on login Link : " + loginLink.toString());
        clickOnElement(loginLink);
    }
    public String verifyCurrentURL (){
        return driver.getCurrentUrl();

    }


}








