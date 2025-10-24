package com.skoglund.entity.items;

public class LureSet extends Item {
    private String lureType;
    private final int amountOfLures = 5;

    public LureSet(){

    }
    public LureSet(String brand, String color, String lureType){
        super(brand, color);
        this.lureType = lureType;
    }

    @Override
    public void showItemInfo() {
        System.out.println("Betesset av varumärket: " + getBrand() + " | Färg: " + getColor());
        System.out.println("Settet innehåller: " + this.amountOfLures + " beten och är av typen: " + this.lureType);

    }
}
