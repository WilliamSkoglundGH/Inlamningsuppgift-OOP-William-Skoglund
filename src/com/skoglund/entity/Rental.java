package com.skoglund.entity;

import com.skoglund.entity.items.Item;

public class Rental {
    Item item;
    Member member;
    int rentalTime;

    public Rental() {

    }

    public Rental(Item item, Member member, int rentalTime) {
        this.item = item;
        this.member = member;
        this.rentalTime = rentalTime;
    }

    public Item getItem() {
        return item;
    }

    public int getRentalTime() {
        return rentalTime;
    }

    public Member getMember() {
        return member;
    }

    public String getRentalInfo() {
        return "Bokning genomförd!\n Kund: " + member.getName() + " | " + member.getId() + " | "
                + member.getAgeGroup() + "\n" + "Utrustning: " + item.getType() + "\n"
                + "Uthyrningsperiod: " + rentalTime + "dagar";
    }

}
