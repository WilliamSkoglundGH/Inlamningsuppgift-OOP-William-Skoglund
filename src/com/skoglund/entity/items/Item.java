package com.skoglund.entity.items;

public abstract class Item {
    private String brand;
    private String color;

    public Item(){

    }
    public Item(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public abstract void showItemInfo();

}
