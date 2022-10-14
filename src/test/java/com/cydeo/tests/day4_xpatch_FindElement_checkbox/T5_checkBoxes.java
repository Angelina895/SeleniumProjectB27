package com.cydeo.tests.day4_xpatch_FindElement_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkBoxes {
    public static void main(String[] args) throws InterruptedException {
//        1. Go to http://practice.cydeo.com/checkboxes
//        2. Confirm checkbox #1 is NOT selected by default
//        3. Confirm checkbox #2 is SELECTED by default.
//        4. Click checkbox #1 to select it.
//        5. Click checkbox #2 to deselect it.
//        6. Confirm checkbox #1 is SELECTED.
//        7. Confirm checkbox #2 is NOT selected.


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.cssSelector("input[id='box1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        System.out.println("checkbox1.isSelected(), expected false " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected(),expected true " + checkbox2.isSelected());
        Thread.sleep(5000);
        checkbox1.click();
        Thread.sleep(5000);
        checkbox2.click();
        Thread.sleep(5000);



        System.out.println("checkbox1.isSelected(),expected true " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected(),expected false " + checkbox2.isSelected());


        driver.quit();


    }
}
