package com.skoglund.entity.items;

public abstract class Item {
    private String brand;
    private String color;
    private boolean isAvailable;


    public Item() {

    }

    public Item(String brand, String color, boolean isAvailable) {
        this.brand = brand;
        this.color = color;
        this.isAvailable = isAvailable;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public abstract void showItemInfo();

    public abstract String getType();

    public void ToAvailable() {
        this.isAvailable = true;
    }

    public void ToNotAvailable() {
        this.isAvailable = false;
    }
}
