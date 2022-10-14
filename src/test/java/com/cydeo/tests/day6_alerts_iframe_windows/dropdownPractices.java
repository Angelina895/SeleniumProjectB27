package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dropdownPractices {
//    1. Open Chrome browser
//    2. Go to http://practice.cybertekschool.com/dropdown
//    3. Select Illinois
//    4. Select Virginia
//    5. Select California
//    6. Verify final selected option is California.
//    Use all Select options. (visible text, value, index)
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void DropdownTask4(){

        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        selectState.selectByVisibleText("Illinois");
        selectState.selectByValue("VA");
        selectState.selectByIndex(5);

        String actualFinalOption =selectState.getFirstSelectedOption().getText() ;
        String expectedFinalOption = "California";
        Assert.assertEquals(actualFinalOption,expectedFinalOption,"Final Selected option verification is failed");


        int index = -1;
        for (WebElement eachState : selectState.getOptions()){
            index++;
            if (eachState.getText().equals("California")){
                System.out.println(index);
            }
        }

    }
    @Test
    public void dropdownTask5(){
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/dropdown
//        3. Select “December 1st, 1923” and verify it is selected.
//        Select year using   : visible text
//        Select month using    : value attribute Select
//        day using : index number

        Select selectLanguage = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        for (WebElement eachLanguage : selectLanguage.getOptions()) {
            eachLanguage.click();
            System.out.println("eachLanguage.getText() = " + eachLanguage.getText());

        }
        selectLanguage.deselectAll();






    }
}
