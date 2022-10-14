package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoURLVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com ");

        String expectedURL = "cydeo";
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains(expectedURL)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        //driver.quit();

        String expectedTitle = "Practice";
        String currentTitle = driver.getTitle();
        if (currentTitle.contains(expectedTitle)){
            System.out.println("Good to go");
        }else {
            System.out.println("Try better");
        }
        driver.quit();

    }
}
