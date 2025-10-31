package com.skoglund.service;

import com.skoglund.entity.Member;
import com.skoglund.entity.Rental;
import com.skoglund.entity.items.Item;
import com.skoglund.price.*;

import java.util.ArrayList;
import java.util.List;

public class RentalService {
    private List<Rental> allRentals;

    public RentalService(){
        allRentals = new ArrayList<>();
    }

    public Rental createNewRental(Item item, Member member, int rentalTime){
        if(!item.isAvailable()){
            return null;
        }
        else{
            Rental rental = new Rental(item, member, rentalTime);
            allRentals.add(rental);
            member.addNewRental(rental);
            item.ToNotAvailable();
            return rental;
        }
    }

    public void finishRental(Member member, Rental rental){
        member.finishRental(rental);
        Item item = rental.getItem();
        item.ToAvailable();
    }
    public void showMemberActiveRentals(Member member){
        member.showActiveRentals();
    }
    public void showMemberRentalHistory(Member member){
        member.showRentalHistory();
    }

    public void showRentalInfo(Rental rental){
        System.out.println(rental.getRentalInfo() + "Pris: " + calculateRentalPrice(rental, rental.getMember()) + "kr");
    }
     public PricePolicy getMemberPricePolicy(Rental rental, Member member){
        String memberAgeGroup = member.getAgeGroup();
        PricePolicy memberPricePolicy;

        if(memberAgeGroup.equalsIgnoreCase("vuxen")){
            memberPricePolicy = new AdultPrice();
        }
        else if(memberAgeGroup.equalsIgnoreCase("barn")){
            memberPricePolicy = new ChildPrice();
        }
        else if(memberAgeGroup.equalsIgnoreCase("pensionär")){
            memberPricePolicy = new SeniorPrice();
        }
        else if(memberAgeGroup.equalsIgnoreCase("ungdom")){
            memberPricePolicy = new YouthPrice();
        }
        else{
            memberPricePolicy = new AdultPrice();
        }
        return memberPricePolicy;
     }

      public double calculateRentalPrice(Rental rental, Member member){
        return rental.getRentalTime() * getMemberPricePolicy(rental, member).getPricePerDay();
      }

      public double calculateIncomeFromRentals(){
        double income = 0;
        for(Rental rental : allRentals){
            income += calculateRentalPrice(rental, rental.getMember());
        }
        return income;
      }
}
