package uk.co.heartbingo.steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import uk.co.heartbingo.pages.Homepage;

public class GetUrlSteps {

    @Then("Verify that the URL is correct for application")
    public void verifyThatTheURLIsCorrectForApplication() {
       String expectedUrl = new Homepage().verifyCurrentURL();
       String actualUrl = "https://www.heartbingo.co.uk/";
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}
