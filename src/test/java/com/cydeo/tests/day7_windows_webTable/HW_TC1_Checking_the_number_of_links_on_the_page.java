package com.cydeo.tests.day7_windows_webTable;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HW_TC1_Checking_the_number_of_links_on_the_page extends TestBase {
//    TC #1: Checking the number of links on the page
//     1. Open Chrome browser
//     2. Go to https://www.openxcell.com
//     3. Count the number of the links on the page and verify
//      Expected: 332
@Test
    public void NumberOfLinks(){
    driver.get("https://www.openxcell.com");
    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println(links.size());
    int totallinks = links.size();

    Assert.assertEquals(totallinks,355);

    }
}

