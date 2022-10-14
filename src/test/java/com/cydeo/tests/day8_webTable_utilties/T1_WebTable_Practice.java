package com.cydeo.tests.day8_webTable_utilties;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.WebTable_Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T1_WebTable_Practice extends TestBase {
//  1. Go to: https://practice.cydeo.com/web-tables
//  2. Verify Bob’s name is listed as expected.
//   Expected: “Bob Martin”
//   3. Verify Bob Martin’s order date is as expected
//    Expected: 12/31/2021
//    WebDriver driver;
//   @BeforeMethod
//  public void setUp(){
//      driver = WebDriverFactory.getDriver("chrome");
//      driver.manage().window().maximize();
//      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       //driver.get("https://practice.cydeo.com/web-tables ");


    @Test
    public void order_name_test(){
        driver.get("https://practice.cydeo.com/web-tables ");
        WebElement name = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));
        String expectedName = "Bob Martin";
        String actualName = name.getText();
        Assert.assertEquals(actualName,expectedName,"passed");

        WebElement bobMartinOrderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedDate = "12/31/2021";
       String actualDate =  bobMartinOrderDate.getText();
       Assert.assertEquals(actualDate,expectedDate);

    }
    @Test
    public void test2(){
       String customerOrderDate1 = WebTable_Utils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println(customerOrderDate1);

    }

    @Test
    public void test3(){
       WebTable_Utils.orderVerify(driver,"Ned Stark","05/12/2021");

    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}

