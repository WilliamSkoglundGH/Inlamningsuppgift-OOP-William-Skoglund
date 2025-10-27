package com.skoglund.price;

public class Senior implements PricePolicy{
    @Override
    public double getDiscount() {
        return 0.20;
    }
}
