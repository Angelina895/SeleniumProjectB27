package com.cydeo.tests.day3_locators_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getTest_getAttribute {
//    1- Open a chrome browser
//    2- Go to: https://login1.nextbasecrm.com/
//    3- Verify “remember me” label text is as expected:
//    Expected: Remember me on this computer
//    4- Verify “forgot password” link text is as expected:
//    Expected: Forgot your password?
//    5- Verify “forgot password” href attribute’s value contains expected:
//    Expected: forgot_password=yes
public static void main(String[] args) {
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("https://login1.nextbasecrm.com/");

    WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
    String expectedText = "Remember me on this computer";
    String actualText = rememberMeLabel.getText();

    if (actualText.equals(expectedText)){
        System.out.println("Remember me label text verification passed");
    }else {
        System.out.println("Remember me label text verification failed");
    }

    WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
    String expectedLink = "FORGOT YOUR PASSWORD?";
    String actualLink = forgotPassword.getText();
    if (actualLink.equals(expectedLink)){
        System.out.println("forgot password text verification passed");
    }else {
        System.out.println("actualLink = " + actualLink);
        System.out.println("expectedLink = " + expectedLink);
        System.out.println("forgot password text verification failed");
    }
    String expectedInHref = "forgot_password=yes";
    String actualInHref = forgotPassword.getAttribute("href");
    if (actualInHref.contains(expectedInHref)){
        System.out.println("Href attribute value is passed");
    }else {
        System.out.println("Href attribute value is failed");
    }


    driver.quit();

}
}
