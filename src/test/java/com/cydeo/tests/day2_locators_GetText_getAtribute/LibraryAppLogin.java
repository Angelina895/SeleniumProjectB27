package com.cydeo.tests.day2_locators_GetText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryAppLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cydeo.com/login.html");

        WebElement usernameInput = driver.findElement(By.id("inputEmail"));
        usernameInput.sendKeys("incorrect@gmail.com");

        WebElement userPassword = driver.findElement(By.id("inputPassword"));
        userPassword.sendKeys("incorrectPassword");

        WebElement singIn = driver.findElement(By.tagName("button"));
        singIn.click();






    }
}
