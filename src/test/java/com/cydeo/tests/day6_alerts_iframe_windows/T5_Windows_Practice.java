package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows ");

    }
//    1. Create a new class called: T5_WindowsPractice
//    2. Create new test and make set ups
//    3. Go to : https://practice.cydeo.com/windows
//    4. Assert: Title is “Windows”
//    5. Click to: “Click Here” link
//    6. Switch to new Window.
//    7. Assert: Title is “New Window”

    @Test
    public void windowsTask(){
String actualTitle = driver.getTitle();
String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle,expectedTitle);


        System.out.println("Before opening a new window : " + actualTitle);
        WebElement clickHereBtn = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHereBtn.click();

        actualTitle = driver.getTitle();
        System.out.println("After opening a new window : " + actualTitle);

        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
            System.out.println("eachWindow = " + eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());

        }
        actualTitle = driver.getTitle();
        String expectedTitleClick = "New Window";
        Assert.assertEquals(actualTitle,expectedTitleClick);




    }



}
