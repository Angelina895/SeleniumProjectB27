package com.cydeo.tests.day2_locators_GetText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsuranceAppVerification {
    public static void main(String[] args) throws InterruptedException {
//        1. Open Chrome browser
//        2. Go to
//        https://www.qa1.excelsoirinsurance.com/login
//        3. Verify URL contains
//        Expected: "excelsoirinsurance"
//        4. Verify title:
//        Expected: "Login | Excelsoir Insurance"
//
//        day2_locators_getText_getAttribute
//
//        CarInsuranceAppVerification

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.qa1.excelsoirinsurance.com/login");
        Thread.sleep(3000);

        String URLContain = "excelsoirinsurance" ;
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains(URLContain)){
            System.out.println("contains excelsoirinsurance");
        }else {
            System.out.println("don't contains");
        }
        String expectedTitle = "Login | Excelsoir Insurance";
        String currentTitle = driver.getTitle();

        if (currentTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else {
            System.out.println("failed");
        }
        driver.quit();

    }
}
