package com.cydeo.tests.day7_windows_webTable;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HWTC3_Counting_the_number_of_inks_that_does_not_have_text extends TestBase {
//    1. Open Chrome browser
//    2. Go to https://www.openxcell.com
//    3. Count the number of links that does not have text and verify
//    Expected: 109
    @Test
    public void LinksNoText(){

        driver.get("https://www.openxcell.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement eachLink : links) {

        }

    }
}
