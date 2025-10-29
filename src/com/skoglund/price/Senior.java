package com.skoglund.price;

public class Senior implements PricePolicy{
    @Override
    public double getPrice() {
        return 350;
    }
}
