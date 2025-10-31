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
        this.memberRegistry.showAllMembers();
    }

    public void searchAndDisplayMember(String ID){
        this.memberRegistry.searchAndDisplayMember(ID);
    }

    public Member searchAndGetMember(String ID){
        return this.memberRegistry.searchAndGetMember(ID);
    }


}




