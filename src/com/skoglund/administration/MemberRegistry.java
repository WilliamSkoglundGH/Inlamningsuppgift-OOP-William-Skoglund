package com.skoglund.administration;

import com.skoglund.entity.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRegistry {
    private List<Member> memberList;
    //Lista med alla medlemmar
    //Läggs till "automatiskt" listan när en ny member skapas

    public MemberRegistry(){
        memberList = new ArrayList<>();
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void addNewMember(Member newMember){
        memberList.add(newMember);
    }

    public void removeMember(Member member){
        memberList.remove(member);
    }
}
