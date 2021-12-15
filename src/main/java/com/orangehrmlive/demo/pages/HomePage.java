package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.time.Duration;

public class HomePage extends Utility {

    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement orangeHRMLogo;

    @FindBy(xpath = "//b[normalize-space()='Admin']")
    WebElement admin;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logOut;

    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement loginPanel;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyLogoutSuccessfulByLoginPanel() {
        return getTextFromElement(loginPanel);
    }

    public void verifyTheWelcomeMessage() {
        Reporter.log("Verifying the message : " + welcomeText.toString() + "<br>");
        String s1 = "Welcome Paul";
        String expectedMessage = s1.substring(0, 6);
        String s2 = getTextFromElement(welcomeText);
        String actualMessage = s2.substring(0, 6);
        verifyTestMethod("Welcome Message is displayed incorrectly", welcomeText);
    }

    public WebElement pmDoWaitUntilVisibilityOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by);
    }

    public void verifyTheOrangeHRMLogo() {
        Reporter.log("Verifying the logo : " + orangeHRMLogo.toString() + "<br>");
        boolean logoPresent = orangeHRMLogo.isDisplayed();
        Assert.assertTrue(logoPresent);
    }

    public void mouseHoverOnLogoutAndClick() {
        pmDoWaitUntilVisibilityOfElementLocated(By.xpath("//a[normalize-space()='Logout']"), 50);
        mouseHoverToElementAndClick(logOut);

    }

    public void clickOnAdminTabFromHomePage() {
        Reporter.log("Click on Admin Tab From Homepage : " + admin.toString() + "<br>");
        clickOnElement(admin);
    }


}
