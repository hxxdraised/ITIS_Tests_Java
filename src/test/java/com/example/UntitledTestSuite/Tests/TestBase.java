package com.example.UntitledTestSuite.Tests;

import com.example.UntitledTestSuite.Entities.AccountData;
import com.example.UntitledTestSuite.Entities.PositionData;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.fail;

public class TestBase {
    protected WebDriver driver;
    protected String baseUrl;
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();
    JavascriptExecutor js;

    @Before
    public void setUp() throws Exception {
//    System.setProperty("webdriver.chrome.driver", "");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        js = (JavascriptExecutor) driver;
    }

    @After
    public void tearDown() throws Exception {
//        driver.quit();
//        String verificationErrorString = verificationErrors.toString();
//        if (!"".equals(verificationErrorString)) {
//          fail(verificationErrorString);
//        }
    }

    protected void deletePosition() {
        driver.findElement(By.linkText("×")).click();
    }

    protected void setCartPositionQuantity(Integer quantity) {
        WebElement quantityField = driver.findElement(
                By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/article/div/div/div[1]/form/div/" +
                        "table/tbody/tr/td[5]/div/input[2]")
        );
        quantityField.click();
        quantityField.clear();
        quantityField.sendKeys(quantity.toString());
    }

    protected void openCartPage() {
        driver.get("https://lalehome.com/%d0%ba%d0%be%d1%80%d0%b7%d0%b8%d0%bd%d0%b0/");
    }

    protected void addGoodPositionToCart(PositionData position) {
        driver.get(position.link);
        WebElement quantityField = driver.findElement(
                By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/form/div/input[2]")
        );
        quantityField.click();
        quantityField.clear();
        quantityField.sendKeys(position.quantity.toString());
        driver.findElement(By.name("add-to-cart")).click();
    }

    protected void login(AccountData user) {
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

    protected void openLoginPage() {
        driver.get("https://lalehome.com/%d0%bc%d0%be%d0%b9-%d0%b0%d0%ba%d0%ba%d0%b0%d1%83%d0%bd%d1%82/");
    }

}
