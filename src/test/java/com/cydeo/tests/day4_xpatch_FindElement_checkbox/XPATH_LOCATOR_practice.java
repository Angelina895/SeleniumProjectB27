package com.cydeo.tests.day4_xpatch_FindElement_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPATH_LOCATOR_practice {
    public static void main(String[] args) {
//        1. Open Chrome browser
//        2. Go to http://practice.cydeo.com/multiple_buttons
//        3. Click on Button 1
//        4. Verify text displayed is as expected:
//        Expected: “Clicked on button one!”


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/multiple_buttons");

        WebElement btm1 = driver.findElement(By.xpath("//button[.='Button 1']"));
        btm1.click();

       String expectedText = "Clicked on button one!";
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();


        if (expectedText.equals(actualText)){
            System.out.println(actualText);
        }else {
            System.out.println("Test is failed");
        }

driver.quit();






    }
}
