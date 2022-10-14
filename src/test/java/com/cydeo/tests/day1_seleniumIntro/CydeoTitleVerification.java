package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.cydeo.com");
        String expectedTitle = "Cydeo";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED");
        }else {
            System.out.println("Title verification is FAILED");
        }

        driver.quit();

    }
}
