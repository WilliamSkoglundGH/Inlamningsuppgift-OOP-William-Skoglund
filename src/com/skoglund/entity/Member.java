package com.skoglund.entity;

public class Member {
    private String name;
    private String Id;
    private String ageGroup;
    //ID ska ges automatiskt vid skapande av member
    //private List<Rental>;
    //Agegroup agegroup ---- barn,ungdom,vuxen,pensionär

    public Member(){

    }

    public Member(String name, String ageGroup){
        this.name = name;
        this.ageGroup = ageGroup;
        //ge ett random ID
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void showRentalHistory(){

    }
    public void showActiveRentals(){

    }
}
