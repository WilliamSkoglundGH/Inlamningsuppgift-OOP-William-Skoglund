package com.skoglund.service;

import com.skoglund.administration.Inventory;
import com.skoglund.administration.MemberRegistry;
import com.skoglund.entity.Member;
import com.skoglund.entity.Rental;
import com.skoglund.entity.items.Item;

import java.util.ArrayList;
import java.util.List;

public class RentalService {

    public RentalService(){

    }

    public void createNewRental(Item item, Member member, String rentalTime){
        Rental rental = new Rental(item, member, rentalTime);
    }
    public void finishRental(Rental rental){

    }

}
