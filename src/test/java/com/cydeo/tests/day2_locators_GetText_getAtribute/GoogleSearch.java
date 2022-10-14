package com.cydeo.tests.day2_locators_GetText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
         WebElement search = driver.findElement(By.name("q"));
         search.sendKeys("apple" + Keys.ENTER);

         String expectedInTitle = "apple";
         String actualTitle = driver.getTitle();

         if (actualTitle.contains(expectedInTitle)){
             System.out.println("passed");
         }else {
             System.out.println("failed");
         }
         driver.quit();



    }
}
