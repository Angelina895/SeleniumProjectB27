package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    public static void login_crm(WebDriver driver){

        WebElement loginBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        loginBox.sendKeys("hr2@cydeo.com");

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        passwordBox.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));

        loginBtn.click();


    }
    public static void login_crm(WebDriver driver,String username,String password){

        WebElement loginBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        loginBox.sendKeys(username);

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        passwordBox.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));

        loginBtn.click();



    }
}
