package com.skoglund.price;

public class Youth implements PricePolicy{
    @Override
    public double getPrice() {
        return 400;
    }
}
