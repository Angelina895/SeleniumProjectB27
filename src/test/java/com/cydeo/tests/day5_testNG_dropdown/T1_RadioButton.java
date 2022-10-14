package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_RadioButton {
    public static void main(String[] args) {
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/radio_buttons
//        3. Click to “Hockey” radio button
//        4. Verify “Hockey” radio button is selected after clicking.


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyBtn.click();
        //System.out.println("hokeyBtn.isSelected() = " + hokeyBtn.isSelected());
        if (hockeyBtn.isSelected()){
            System.out.println("hockey btn is selected");
        }else {
            System.out.println("hockey btn is not selected");
        }

        List<WebElement> sportRadioBtn= driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement eachSport : sportRadioBtn) {
            eachSport.click();
            if (eachSport.isSelected()){
                System.out.println(eachSport.getAttribute("id") + "radio btn is selected");
            }
            }
        driver.quit();
        }


        }




