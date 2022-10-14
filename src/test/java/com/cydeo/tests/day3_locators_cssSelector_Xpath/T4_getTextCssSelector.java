package com.cydeo.tests.day3_locators_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_getTextCssSelector {
    public static void main(String[] args) {
//        1- Open a chrome browser
//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
//        3- Verify “Reset password” button text is as expected:
//        Expected: Reset password

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetPassword = driver.findElement(By.cssSelector("button.login-btn"));

        String expectedResetPassword = "Reset password";
        String actualResetText = resetPassword.getText();

        if (actualResetText.equals(expectedResetPassword)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.quit();
    }
}
