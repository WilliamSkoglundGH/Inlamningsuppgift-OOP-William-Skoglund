package com.skoglund.price;

public class Youth implements PricePolicy{
    @Override
    public double getDiscount() {
        return 0.10;
    }
}
