package com.cydeo.tests.day2_locators_GetText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();


//        2- Go to: https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com");
        Thread.sleep(3000);

//        3- Click to A/B Testing from top of the list.
        // driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();
        Thread.sleep(3000);

//        4- Verify title is: Expected: No A/B Test

        String expectedTitle = "No A/B Test";
        String currentTitle = driver.getTitle();

        if (currentTitle.equals(expectedTitle)){
            System.out.println("No A/B Test title verification passed!");
        }else {
            System.out.println("No A/B Test title verification failed!");
        }

//        5- Go back to home page by using the .back();
        driver.navigate().back();
        Thread.sleep(3000);

//        6- Verify title equals: Expected: Practice
        expectedTitle = "Practice";
        currentTitle = driver.getTitle();

        if (currentTitle.equals(expectedTitle)){
            System.out.println("Practice page title verification passed!");
        }else {
            System.out.println("Practice page title verification failed!");
        }
        driver.quit();












    }
}
