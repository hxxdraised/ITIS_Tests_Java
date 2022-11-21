package com.example.UntitledTestSuite.Tests;

import com.example.UntitledTestSuite.Entities.AccountData;
import com.example.UntitledTestSuite.Entities.PositionData;
import org.junit.*;

public class TestCase extends TestBase {
  protected AccountData user = new AccountData("monade8871@adroh.com", "cegthgag02");
  protected PositionData position = new PositionData("https://lalehome.com/product/clasy-butik-" +
          "%d0%b4%d0%b2%d1%83%d1%81%d0%bf%d0%b0%d0%bb%d1%8c%d0%bd%d1%8b%d0%b9-%d0%ba%d0%be%d0%bc%d0%bf" +
          "%d0%bb%d0%b5%d0%ba%d1%82-%d0%bf%d0%be%d1%81%d1%82%d0%b5%d0%bb%d1%8c%d0%bd%d0%be%d0%b3%d0%be-3/", 2);
  @Test
  public void loginTestCase() throws Exception {
    driver.manage().window().maximize();
    openLoginPage();
    login(user);
  }
  @Test
  public void addPositionTestCase() throws Exception {
    driver.manage().window().maximize();
    openLoginPage();
    login(user);
    addGoodPositionToCart(position);
    openCartPage();
    setCartPositionQuantity(4);
    deletePosition();
  }
}
