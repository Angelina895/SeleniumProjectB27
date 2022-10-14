package com.cydeo.tests.day2_locators_GetText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_getAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));
        System.out.println(headerText.getText());
        String actualHeader = headerText.getText();
        String expectedHeader = "Registration form";
        if (actualHeader.equals(expectedHeader)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        String expectedName = "first name";
        String actualName = firstNameInput.getAttribute("placeholder");

        if (actualName.equals(expectedName)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.quit();


    }
}
