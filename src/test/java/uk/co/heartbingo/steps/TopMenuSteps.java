package uk.co.heartbingo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.heartbingo.pages.BingoPage;
import uk.co.heartbingo.pages.Homepage;

public class TopMenuSteps {
    @And("I click on Accept all cookies")
    public void iClickOnAcceptAllCookies() {
        new Homepage().clickOnAcceptAllCookies();
    }

    @When("I click on Bingo link")
    public void iClickOnBingoLink() {
        new Homepage().clickOnBingoLink();
    }

    @Then("I should navigate to Bingo page successfully")
    public void iShouldNavigateToBingoPageSuccessfully() {
        Assert.assertEquals(new BingoPage().getTextOnlineBingo(),"Online Bingo");
    }



}
