package com.example.UntitledTestSuite.Helpers;

import com.example.UntitledTestSuite.AppManager;
import com.example.UntitledTestSuite.Entities.AccountData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginHelper  extends HelperBase{

    public LoginHelper(AppManager appManager){
        super(appManager);
    }

    public void login(AccountData user) {
        WebElement emailField = driver.findElement(By.xpath("//div[@id='customer_login']/div/form/p/input"));
        WebElement passwordField = driver.findElement(By.xpath("//div[@id='customer_login']/div/form/p[2]/span/input"));
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/article/div/div/div[2]/div/div[1]/form/p[3]/button"));

        emailField.click();
        emailField.clear();
        emailField.sendKeys(user.username);
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(user.password);
        submitButton.click();
    }
}