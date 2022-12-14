package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task6_hm_nonSelectedDropdown {
//    TC #6: Selecting value from non-select dropdown
//    1. Open Chrome browser
//    2. Go to https://practice.cydeo.com/dropdown
//    3. Click to non-select dropdown
//    4. Select Facebook from dropdown
//     5. Verify title is “Facebook - Log In or Sign Up”
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown ");
    }
    @Test
    public void Dropdown(){
     // Select Facebook =  new Select(driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']")));

        WebElement selectWeb = driver.findElement(By.id("dropdownMenuLink"));
        String actualWeb = selectWeb.getText();
        selectWeb.click();

        WebElement selectFacebook = driver.findElement(By.linkText("Facebook"));
        String actualFacebook = selectFacebook.getText();
        selectFacebook.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - log in or sign up";

        Assert.assertEquals(actualTitle,expectedTitle);





    }
}
