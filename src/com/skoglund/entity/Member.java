package com.skoglund.entity;

public class Member {
    private String name;
    private String Id; //ID ska ges automatiskt vid skapande av member
    //private List<uthyrningshistorik>;
    //Agegroup agegroup ---- barn,ungdom,vuxen,pensionär

    public Member(){

    }

    public Member(String name, String Id){
        this.name = name;
        this.Id = Id;
        //ge ett random ID
    }
    public void showRentalHistory(){

    }
    public void showActiveRentals(){

    }
}
