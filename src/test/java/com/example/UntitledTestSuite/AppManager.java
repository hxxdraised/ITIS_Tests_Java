package com.example.UntitledTestSuite;

import com.example.UntitledTestSuite.Helpers.DataHelper;
import com.example.UntitledTestSuite.Helpers.LoginHelper;
import com.example.UntitledTestSuite.Helpers.NavHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AppManager {
    private final String baseUrl;
    protected WebDriver driver;
    protected StringBuffer verificationErrors;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setNavigation(NavHelper navigation) {
        this.navigation = navigation;
    }

    public void setLogin(LoginHelper login) {
        this.login = login;
    }

    public void setData(DataHelper data) {
        this.data = data;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public NavHelper getNavigation() {
        return navigation;
    }

    public LoginHelper getLogin() {
        return login;
    }

    public DataHelper getData() {
        return data;
    }

    public void stop() {
        driver.quit();
    }

    protected NavHelper navigation;
    protected LoginHelper login;
    protected DataHelper data;

    public AppManager() {
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        verificationErrors = new StringBuffer();
        navigation = new NavHelper(this, baseUrl);
        login = new LoginHelper(this);
        data = new DataHelper(this);
    }


}