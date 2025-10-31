package com.skoglund.entity.items;

public class FishingReel extends Item{
    private String gearRatio;
    private String reelType;
    private String maxDrag;

    public FishingReel(){

    }
    public FishingReel(String brand, String color, boolean isAvailable, String gearRatio,
                       String reelType, String maxDrag){
        super(brand, color,isAvailable);
        this.gearRatio = gearRatio;
        this.reelType = reelType;
        this.maxDrag = maxDrag;
    }


    @Override
    public void showItemInfo() {
        System.out.println("(Fiskerulle av varumärket: " + getBrand() + " | Färg: " + getColor());
        System.out.println("Rullen är en: " + this.reelType + " med utväxlingen " + this.gearRatio +
                " och en maxbroms på: " + this.maxDrag + "kg)");
    }

    @Override
    public String getType() {
        return "Fiskerulle";
    }
}
