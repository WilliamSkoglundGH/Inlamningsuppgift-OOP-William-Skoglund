package com.skoglund.entity;

import java.util.Random;

public class Member {
    private String name;
    private String Id;
    private String ageGroup;
    //ID ska ges automatiskt vid skapande av member
    //private List<Rental>;
    //Agegroup agegroup ---- barn,ungdom,vuxen,pensionär

    Random random = new Random();
    StringBuilder stringBuilder = new StringBuilder();

    public Member(){

    }

    public Member(String name, String ageGroup){
        this.name = name;
        this.ageGroup = ageGroup;
        this.Id = createID();
    }

    private String createID(){
        for(int i = 0; i < 7; i++){
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
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

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public void showRentalHistory(){

    }
    public void showActiveRentals(){

    }
}
