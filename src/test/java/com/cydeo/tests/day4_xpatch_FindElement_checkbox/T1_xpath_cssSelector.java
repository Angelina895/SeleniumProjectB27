package com.cydeo.tests.day4_xpatch_FindElement_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector {
//    1. Open Chrome browser
//    2. Go to https://practice.cydeo.com/forgot_password
//    3. Locate all the WebElements on the page using XPATH          and/or CSS
//    locator only (total of 6)
//    a. “Home” link
//    b. “Forgot password” header
//    c. “E-mail” text
//    d. E-mail input box
//    e. “Retrieve password” button
//    f. “Powered by Cydeo text
//    4. Verify all web elements are displayed.
public static void main(String[] args) {
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    driver.get("https://practice.cydeo.com/forgot_password");

    WebElement homeLink1 = driver.findElement(By.cssSelector(".nav-link"));
    WebElement homeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']"));

    WebElement homeLink3 = driver.findElement(By.xpath("//a[@class='nav-link']"));

    WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));
    WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

    WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

    WebElement forgotPassword4 = driver.findElement(By.xpath("//div[@class='example']/h2"));

    WebElement emailText = driver.findElement(By.xpath("//label[.='E-mail']"));
    WebElement emailText2 =driver.findElement(By.xpath("//label[contains(@for,'email')]"));
    WebElement emailInput = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));
    WebElement emailInput2 = driver.findElement(By.cssSelector("button[id='form_submit']>i"));

    WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

    System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
    System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
    System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
    System.out.println("emailInput2.isDisplayed() = " + emailInput2.isDisplayed());
    System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
    driver.quit();
}

}
