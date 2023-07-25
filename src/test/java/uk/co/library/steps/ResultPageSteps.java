package uk.co.library.steps;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import uk.co.library.pages.ResultPage;

public class ResultPageSteps {
    @Then("I should see the relevant message{string}")
    public void iShouldSeeTheRelevantMessage(String message) {
        String expectedMessage=message;
        String actualMessage=new ResultPage().verifyTheResults();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
