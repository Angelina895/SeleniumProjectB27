package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RadioBtn {
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/radio_buttons
//        3. Click to “Hockey” radio button
//        4. Verify “Hockey” radio button is selected after clicking.

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyBtn.click();

      //  List<WebElement> btns = driver.findElements(By.name("sport"));

//        for (WebElement each : btns) {
//            // each.click();
//           if (each.isSelected()){
//               System.out.println(each.getAttribute("id") + " is Selected");
//           }else {
//               System.out.println( each.getAttribute("id") + " not selected");
//           }
        System.out.println("hockeyBtn is Selected = " + hockeyBtn.isSelected());


    }

    }


