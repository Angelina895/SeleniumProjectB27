package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task5_hm_selectingDate {
    //    TC #5: Selecting date on dropdown and verifying
//    1. Open Chrome browser
//    2. Go to https://practice.cydeo.com/dropdown
//    3. Select “December 1st, 1923” and verify it is selected.
//    Select year using   : visible text
//    Select month using    : value attribute Select
//    day using : index number
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

    }
    @Test
            public void Dropdown(){
        Select yearText = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearText.selectByVisibleText("1923");
        Select monthText = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthText.selectByValue("11");
        Select dayText = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayText.selectByIndex(0);

        String actualYear = yearText.getFirstSelectedOption().getText();
        String expectedYear= "1923";
        Assert.assertEquals(actualYear,expectedYear,"passed");

        String actualMonth = monthText.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        Assert.assertEquals(actualMonth,expectedMonth);

        String actualDay = dayText.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay,expectedDay);




    }




}
