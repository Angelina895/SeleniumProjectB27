package com.cydeo.tests.day4_xpatch_FindElement_checkbox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC4FindElements {
    public static void main(String[] args) {
//        1- Open a chrome browser
//        2- Go to: https://practice.cydeo.com/abtest
//        3- Locate all the links in the page.
//        4- Print out the number of the links on the page.
//        5- Print out the texts of the links.
//        6- Print out the HREF attribute values of the links

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

       List <WebElement> allLinks = driver.findElements(By.tagName("a"));

        System.out.println("allLinks.size() = " + allLinks.size());

        for (WebElement eachLink: allLinks){
            System.out.println("eachLink.getText() = " + eachLink.getText());
            System.out.println("text of each Link: " + eachLink.getText());
            System.out.println("HREF value for each link: " + eachLink.getAttribute("href"));
        }

        driver.quit();

    }
}
