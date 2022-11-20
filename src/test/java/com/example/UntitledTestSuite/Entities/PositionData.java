package com.example.UntitledTestSuite.Entities;

public class PositionData {
    public String link;
    public Integer quantity;

    public PositionData(String link, Integer quantity) {
        this.link = link;
        this.quantity = quantity;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getLink() {
        return link;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
