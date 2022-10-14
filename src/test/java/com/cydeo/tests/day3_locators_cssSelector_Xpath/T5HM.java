package com.cydeo.tests.day3_locators_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5HM {
//    TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
//            3- Enter incorrect username into login box:
//            4- Click to `Reset password` button
//5- Verify “error” label is as expected
//    Expected: Login or E-mail not found

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement incorrectUsername = driver.findElement(By.cssSelector("input[class='login-inp']"));
        incorrectUsername.sendKeys("natabul55@gmailo.com");

        WebElement resetPasswordBtn = driver.findElement(By.cssSelector("button[class='login-btn']"));
        resetPasswordBtn.click();

        WebElement error = driver.findElement(By.cssSelector("div[class='errortext']"));

        String expectedError = "Login or E-mail not found";
        String actualError = error.getText();

        if (actualError.equals(expectedError)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
    }
}
