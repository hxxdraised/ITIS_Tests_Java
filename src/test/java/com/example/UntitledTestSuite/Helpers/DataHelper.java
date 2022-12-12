package com.example.UntitledTestSuite.Helpers;

import com.example.UntitledTestSuite.AppManager;
import com.example.UntitledTestSuite.Entities.PositionData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataHelper extends HelperBase{

    public DataHelper(AppManager appManager){
        super(appManager);
    }

    public void deletePosition() {
        driver.findElement(By.linkText("×")).click();
    }

    public void setCartPositionQuantity(Integer quantity) {
        WebElement quantityField = driver.findElement(
                By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/article/div/div/div[1]/form/div/" +
                        "table/tbody/tr/td[5]/div/input[2]")
        );
        quantityField.click();
        quantityField.clear();
        quantityField.sendKeys(quantity.toString());
    }



    public void addGoodPositionToCart(PositionData position) {
        driver.get(position.link);
        WebElement quantityField = driver.findElement(
                By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div/form/div/input[2]")
        );
        quantityField.click();
        quantityField.clear();
        quantityField.sendKeys(position.quantity.toString());
        driver.findElement(By.name("add-to-cart")).click();
    }

}