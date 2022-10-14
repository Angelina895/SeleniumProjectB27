package com.cydeo.tests.day3_locators_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_CssSelector {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

       // WebElement logInBtn = driver.findElement(By.cssSelector("input[type='submit'']"));
       // WebElement logInBtn = driver.findElement(By.cssSelector("input[value='Log In']"));

       // WebElement logInBtn = driver.findElement(By.cssSelector("input.login-btn"));
      //  WebElement logInBtn = driver.findElement(By.cssSelector("input[onclick=\"BX.addClass(this, 'wait');\"]"));
        WebElement logInBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expectedLogInText = "Log In";
        String actualLogInText = logInBtn.getAttribute("value");
        if (actualLogInText.equals(expectedLogInText)){
            System.out.println("Log in text verification passed");
        }else {
            System.out.println("Log in verification failed");
        }
        driver.quit();
    }
}
