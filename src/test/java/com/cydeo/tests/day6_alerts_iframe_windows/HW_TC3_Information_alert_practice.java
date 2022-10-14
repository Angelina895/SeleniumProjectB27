package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.Browser_Utilities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_TC3_Information_alert_practice extends TestBase {
//   1. Open browser
//   2. Go to website: http://practice.cydeo.com/javascript_alerts
//   3. Click to “Click for JS Prompt” button
//   4. Send “hello” text to alert
//   5. Click to OK button from the alert
//   6. Verify “You entered:  hello” text is displayed.
    @Test
    public void information_alert(){
        driver.get("http://practice.cydeo.com/javascript_alerts");
        WebElement clickJSPrompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickJSPrompt.click();

        Alert alert = driver.switchTo().alert();
        Browser_Utilities.sleep(2);
        alert.sendKeys("hello");
        Browser_Utilities.sleep(2);
        alert.accept();

        WebElement helloText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertEquals(helloText.getText(),"You entered: hello");



    }
}
