package com.cydeo.tests.day7_windows_webTable;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HWTasksP10_P11 extends TestBase {
    @Test
    public  void Tasks(){

        driver.get("https://practice.cydeo.com/tables");

     WebElement name = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']"));


        String locator = name + "/preceding-sibling::td[.='Conway']";




    }

}
