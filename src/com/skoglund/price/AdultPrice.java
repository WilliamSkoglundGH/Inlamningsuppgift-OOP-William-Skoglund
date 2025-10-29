package com.skoglund.price;

public class AdultPrice implements PricePolicy{
    @Override
    public double getPrice() {
        return 500;

    }
}
