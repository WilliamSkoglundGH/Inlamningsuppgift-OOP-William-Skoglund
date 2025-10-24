package com.skoglund.entity.items;

public class FishingRod extends Item{
    private String rodLength;
    private String castingWeight;
    private String rodType;

    public FishingRod(){

    }

    public FishingRod(String brand, String color, String rodLength, String castingWeight, String rodType){
        super(brand, color);
        this.rodLength = rodLength;
        this.castingWeight = castingWeight;
        this.rodType = rodType;
    }

    @Override
    public void showItemInfo() {
        System.out.println("Fiskespö av varumärket: " + getBrand() + " | Färg: " + getColor());
        System.out.println("Spöt är ett: " + this.rodType + "spö" + " och är " + this.rodLength + " fot långt");
        System.out.println("Kastvikten är: " + this.castingWeight + "g");

    }
}
