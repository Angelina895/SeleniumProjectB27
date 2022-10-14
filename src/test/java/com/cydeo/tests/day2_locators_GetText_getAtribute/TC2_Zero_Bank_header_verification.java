package com.cydeo.tests.day2_locators_GetText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_Zero_Bank_header_verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement tag = driver.findElement(By.tagName("h3"));
        //System.out.println(tag.getText());
        String expectedText = "Log in to ZeroBank";
        String actualText = tag.getText();
        if (actualText.equals(expectedText)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.quit();
    }
}
