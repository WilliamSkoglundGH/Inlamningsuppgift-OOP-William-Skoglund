package com.skoglund.price;

public class ChildPrice implements PricePolicy{
    @Override
    public double getDiscount() {
        return 0.5;

    }
}
