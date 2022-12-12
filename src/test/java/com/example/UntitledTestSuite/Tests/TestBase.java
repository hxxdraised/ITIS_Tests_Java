package com.example.UntitledTestSuite.Tests;

import com.example.UntitledTestSuite.AppManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;

public class TestBase {

    JavascriptExecutor js;
    protected AppManager appManager;

    @Before
    public void setUp() throws Exception {
        appManager = new AppManager();
    }

    @After
    public void tearDown() throws Exception {
        appManager.stop();
    }

}
