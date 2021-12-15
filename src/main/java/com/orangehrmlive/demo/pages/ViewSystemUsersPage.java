package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {

    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRoleDropDown;

    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement userName;

    @FindBy(name = "searchSystemUser[status]")
    WebElement statusDropDown;

    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchButton;

    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement checkBox;

    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteButton;

    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement deleteOkay;

    @FindBy(css = "div[class='head'] h1")
    WebElement systemUsersText;

    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecordFound;

    @FindBy(xpath = "//a[contains(text(),'AnanyaDash20')]")
    WebElement verifyEmployeeName;

    @FindBy(xpath = "//form[@id='frmList_ohrmListComponent']//script")
    WebElement userDeletedText;

    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnTheSearchButton() {
        Reporter.log("Click on the search Button : " + searchButton.toString() + "<br>");
        clickOnElement(searchButton);
    }

    public void clickOnTheCheckBox() {
        Reporter.log("Click on the checkbox : " + checkBox.toString() + "<br>");
        clickOnElement(checkBox);
    }

    public void clickOnTheDeleteButton() {
        Reporter.log("Click on the delete button : " + deleteButton.toString() + "<br>");
        clickOnElement(deleteButton);
    }

    public void clickOnOKButtonOfPopUp() {
        driver.switchTo().alert().dismiss();
    }

    public void putUserNameInTheUserNameField(String empUserName) {
        Reporter.log("Enter Employee User Name : " + userName.toString() + "<br>");
        sendTextToElement(userName, empUserName);
    }

    public void verifyTheSystemUsersWelcomeText() {
        Reporter.log("Verifying the system users text : " + systemUsersText.toString() + "<br>");
        verifyTestMethod("System Users", systemUsersText);

    }

    public void selectUserRole(String role) {
        Reporter.log("Select role : " + userRoleDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(userRoleDropDown, role);
    }

    public void selectUserStatus(String statusValue) {
        Reporter.log("Select Status : " + statusDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(statusDropDown, statusValue);
    }

    public void verifyUserCreated() {
        verifyTestMethod("AnanyaDash20", verifyEmployeeName);
    }

    public void verifyUserDeletedText() {
        verifyTestMethod("Successfully Deleted", userDeletedText);
    }
    public void clickOnOKDelete(){
        clickOnElement(deleteOkay);
    }
    public void verifyNoRecordFoundText(String noRecord){
        verifyTestMethod(noRecord,noRecordFound);
    }
}

