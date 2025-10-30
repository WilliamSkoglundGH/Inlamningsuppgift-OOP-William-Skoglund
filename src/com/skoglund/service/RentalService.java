package com.skoglund.service;

import com.skoglund.entity.Member;
import com.skoglund.entity.Rental;
import com.skoglund.entity.items.Item;

public class RentalService {

    public RentalService(){

    }

    public Rental createNewRental(Item item, Member member, String rentalTime){
        if(!item.isAvailable()){
            return null;
        }
        else{
            Rental rental = new Rental(item, member, rentalTime);
            member.addNewRental(rental);
            item.setToNotAvailable();
            return rental;
        }
    }

    public void finishRental(Member member, Rental rental){
        member.finishRental(rental);
        Item item = rental.getItem();
        item.setToAvailable();
    }
    public void showMemberActiveRentals(Member member){
        member.showActiveRentals();
    }
    public void showMemberRentalHistory(Member member){
        member.showRentalHistory();
    }

    public void showRentalInfo(Rental rental){
        rental.showRental();
    }

}
