package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class DeleteUserSteps {
    @And("^Admin click on the checkbox$")
    public void adminClickOnTheCheckbox() {
        new ViewSystemUsersPage().clickOnTheCheckBox();
    }

    @And("^Admin click on 'delete' button$")
    public void adminClickOnDeleteButton() {
        new ViewSystemUsersPage().clickOnTheDeleteButton();
    }

    @And("^Admin click on 'OK' delete$")
    public void adminClickOnOKDelete() {
        new ViewSystemUsersPage().clickOnOKDelete();
    }

    @Then("^Admin verify user deleted text$")
    public void adminVerifyUserDeletedText() {
        new ViewSystemUsersPage().verifyUserDeletedText();
    }


    @Then("^Admin should verify <\"([^\"]*)\">$")
    public void adminShouldVerify(String reocordNotFound) {
       new ViewSystemUsersPage().verifyNoRecordFoundText(reocordNotFound);
    }
}
