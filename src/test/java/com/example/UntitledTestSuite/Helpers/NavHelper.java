package com.example.UntitledTestSuite.Helpers;

import com.example.UntitledTestSuite.AppManager;


public class NavHelper extends HelperBase {
    private String baseUrl;

    public NavHelper(AppManager appManager, String baseUrl) {
        super(appManager);
        this.baseUrl = baseUrl;
    }

    public void openCartPage() {
        driver.get("https://lalehome.com/%d0%ba%d0%be%d1%80%d0%b7%d0%b8%d0%bd%d0%b0/");
    }

    public void openLoginPage() {
        driver.get("https://lalehome.com/%d0%bc%d0%be%d0%b9-%d0%b0%d0%ba%d0%ba%d0%b0%d1%83%d0%bd%d1%82/");
    }

}