package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SearchUserSteps {
    @And("^Admin verify 'system users' text from view system users page$")
    public void adminVerifySystemUsersTextFromViewSystemUsersPage() {
        new ViewSystemUsersPage().verifyTheSystemUsersWelcomeText();
    }

    @And("^Admin search for username <\"([^\"]*)\">$")
    public void adminSearchForUsername(String searchUsername) {
        new ViewSystemUsersPage().putUserNameInTheUserNameField(searchUsername);
    }

    @And("^Admin search for user role <\"([^\"]*)\">$")
    public void adminSearchForUserRole(String roleSearch) {
        new ViewSystemUsersPage().selectUserRole(roleSearch);
    }

    @And("^Admin search for user status <\"([^\"]*)\">$")
    public void adminSearchForUserStatus(String searchStatus) {
        new ViewSystemUsersPage().selectUserStatus(searchStatus);
    }

    @And("^Admin click on 'search' button$")
    public void adminClickOnSearchButton() {
        new ViewSystemUsersPage().clickOnTheSearchButton();
    }

    @Then("^Admin should verify user found successfully$")
    public void adminShouldVerifyUserFoundSuccessfully() {
        new ViewSystemUsersPage().verifyUserCreated();
    }
}
