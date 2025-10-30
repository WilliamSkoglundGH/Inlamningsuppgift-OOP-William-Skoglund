package com.skoglund.entity;

import com.skoglund.administration.Inventory;
import com.skoglund.entity.items.Item;

import java.util.List;

public class Rental {
    Item item;
    Member member;
    String rentalTime;
    double price; //varje uthyrning har ett pris baserat på åldersgruppen av den membern

    public Rental(){

    }
    public Rental(Item item, Member member, String rentalTime){
        this.item = item;
        this.member = member;
        this.rentalTime = rentalTime;
    }

    public Item getItem() {
        return item;
    }

    public void showRental(){
        System.out.println("Bokning genomförd!");
        System.out.println("Kund: " + member.getName() + " | " + member.getId() + " | " + member.getAgeGroup());
        System.out.println("Uthyrningsperiod: " + rentalTime);
        item.showItemInfo();
    }

}
