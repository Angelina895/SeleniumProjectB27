package com.cydeo.tests.day7_windows_webTable;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HW_TC2Printing_out_the_texts_of_the_links_on_the_page extends TestBase {
//          1. Open Chrome browser
//          2. Go to https://www.openxcell.com
//          3. Print out all of the texts of the links on the page
    @Test
    public void PrintAllLinks(){
        driver.get("https://www.openxcell.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for (WebElement eachLink : allLinks){
            System.out.println(eachLink.getText() + eachLink.getAttribute("href"));
        }

    }
}
