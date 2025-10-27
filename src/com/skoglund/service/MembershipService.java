package com.skoglund.service;

import com.skoglund.administration.MemberRegistry;
import com.skoglund.entity.Member;

public class MembershipService {
    MemberRegistry memberRegistry;

    public MembershipService(){

    }

    public MembershipService(MemberRegistry memberRegistry){
        this.memberRegistry = memberRegistry;
    }

    public void addMember(Member member){
        this.memberRegistry.addNewMember(member);
    }

    public void showAllMembers(){
        for(Member member : memberRegistry.getMemberList()){
            System.out.println(member.getName() + " | " + member.getId() + " | " + member.getAgeGroup());
        }
    }


    //public void searchForMember();


    //public void sortMembersByName();


    //public void sortMembersByAge();
}
