package com.cydeo.tests.day2_locators_GetText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wooden_Spoon {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com ");
        WebElement search = driver.findElement(By.id("global-enhancements-search-query") );
        search.sendKeys(" wooden spoon" + Keys.ENTER);
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.quit();



    }
}
