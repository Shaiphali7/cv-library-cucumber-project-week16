package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import uk.co.library.pages.HomePage;

public class HomePageSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
        new HomePage().acceptIFrameAlert();

    }

    @When("I enter jobTitle {string}")
    public void iEnterJobTitle(String jobTitle) {

        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I enter distance {string}")
    public void iEnterDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on more search option")
    public void iClickOnMoreSearchOption() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter the minimum salary {string}")
    public void iEnterTheMinimumSalary(String minSalary) {
        new HomePage().enterMinSalary(minSalary);
    }

    @And("I enter maximum salary {string}")
    public void iEnterMaximumSalary(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("I select salary type {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select job type {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on find job button")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }


}
