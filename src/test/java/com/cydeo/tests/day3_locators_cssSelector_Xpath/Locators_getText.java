package com.cydeo.tests.day3_locators_cssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators_getText {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        WebDriver driver = WebDriverFactory.getDriver("safari");


        driver.get("https://login.nextbasecrm.com/");

        //driver.findElement(By.name("USER_LOGIN")).sendKeys("incorrect");
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("incorrect");

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        WebElement loginBtn = driver.findElement(By.className("login-btn"));
        loginBtn.click();

        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Passed");
        }else {
            System.out.println("Fail");
        }

        driver.quit();


    }
}
