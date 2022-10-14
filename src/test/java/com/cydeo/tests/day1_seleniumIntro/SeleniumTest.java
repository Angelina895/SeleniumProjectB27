package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        // 1- Setting up the wen driver manager
        WebDriverManager.chromedriver().setup();
        // 2- create instance of the chrome driver
        WebDriver driver = new ChromeDriver();
        // 3- Test if our driver is working
        driver.get("https://www.google.com");
    }
}
