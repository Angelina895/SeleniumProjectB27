package com.cydeo.tests.day2_locators_GetText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3Back_and_forth_navigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        WebElement gmail = driver.findElement(By.className("gb_d"));
        gmail.click();
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.navigate().back();
        expectedTitle = "Google";
        actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("good");
        }else {
            System.out.println("bad");
        }
        driver.quit();


    }
}
