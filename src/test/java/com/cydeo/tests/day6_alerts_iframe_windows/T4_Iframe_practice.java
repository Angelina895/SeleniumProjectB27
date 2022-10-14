package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframe_practice {
    //    1. Create a new class called: T4_Iframes
//    2. Create new test and make set ups
//    3. Go to: https://practice.cydeo.com/iframe
//    4. Assert: “Your content goes here.” Text is displayed.
//    5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");

    }
    @Test
    public void iframeTask(){

       // WebElement textAria = driver.findElement(By.xpath("//p"));

       // driver.switchTo().frame("mce_0_ifr");
       // driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        WebElement textAria = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(textAria.isDisplayed());

        // if nested iframe and if you want to go back to parant iframe
       // driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerText.isDisplayed());

    }
}
