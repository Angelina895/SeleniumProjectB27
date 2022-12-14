package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practice {

//    1. Open browser
//    2. Go to website: http://practice.cydeo.com/javascript_alerts
//    3. Click to “Click for JS Alert” button
//    4. Click to OK button from the alert
//     5. Verify “You successfully clicked an alert” text is displayed.
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @Test
    public void alertTask1(){
        WebElement informationAlertBtn=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        informationAlertBtn.click();

        Alert alert = driver.switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());
        alert.accept();

        WebElement textMessage = driver.findElement(By.xpath("//p[@id='result']"));

       // Assert.assertTrue(textMessage.isDisplayed());

        String actualTextMessage = textMessage.getText();
        String expectedTextMessage = "You successfully clicked an alert";

        Assert.assertEquals(actualTextMessage,expectedTextMessage);




    }
}
