package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_TC2Confirmation_alert_practice extends TestBase {
//    1. Open browser
//    2. Go to website: http://practice.cydeo.com/javascript_alerts
//    3. Click to “Click for JS Confirm” button
//    4. Click to OK button from the alert
//    5. Verify “You clicked: Ok” text is displayed.

    @Test
    public void alertJ3_Confirm(){
        driver.get("http://practice.cydeo.com/javascript_alerts");

        WebElement clickJSConfirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        clickJSConfirm.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement okBtn = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertEquals(okBtn.getText(),"You clicked: Ok");
    }

}
