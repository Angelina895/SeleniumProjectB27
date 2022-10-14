package com.cydeo.tests.day9_proporties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.Browser_Utilities;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_CRM_Login extends TestBase {

//    1. Create new test and make set ups
//    2. Go to : http://login1.nextbasecrm.com/
//    3. Enter valid username
//    4. Enter valid password
//    5. Click to Log In button
//    6. Verify title is as expected:
//    Expected: Portal
    @Test
    public void crm_login_test(){
        driver.get("http://login1.nextbasecrm.com/");

        WebElement loginBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));

        loginBox.sendKeys("hr2@cydeo.com");

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));

        passwordBox.sendKeys("UserUser");

        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));

        loginBtn.click();

        Browser_Utilities.verifyTitle(driver,"Portal");

    }
    @Test
    public void crm_login_test2(){
        driver.get("http://login1.nextbasecrm.com/");
        CRM_Utilities.login_crm(driver);

        Browser_Utilities.verifyTitle(driver,"Portal");
    }
    @Test
    public void crm_login_test3(){
        driver.get("http://login1.nextbasecrm.com/");
        CRM_Utilities.login_crm(driver,"hr2@cydeo.com","UserUser");

        Browser_Utilities.sleep(2);
        Browser_Utilities.verifyTitle(driver,"Portal");
    }
}
