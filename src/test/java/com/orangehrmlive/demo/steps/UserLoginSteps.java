package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class UserLoginSteps {
    @Given("^User is on homepage$")
    public void userIsOnHomepage() {

    }

    @Then("^User should verify welcome text$")
    public void userShouldVerifyWelcomeText() {
        new HomePage().verifyTheWelcomeMessage();
    }

    @And("^User should verify that Orange HRM logo is displayed$")
    public void userShouldVerifyThatOrangeHRMLogoIsDisplayed() {
        new HomePage().verifyTheOrangeHRMLogo();
    }

    @Then("^User click on logout$")
    public void userClickOnLogout() {
        new HomePage().mouseHoverOnLogoutAndClick();
    }


    @And("^User should logout successfully <\"([^\"]*)\">$")
    public void userShouldLogoutSuccessfully(String loginpanel) {
        String exp = loginpanel;
        String act = new HomePage().verifyLogoutSuccessfulByLoginPanel();
        Assert.assertEquals(exp, act);
    }
}
