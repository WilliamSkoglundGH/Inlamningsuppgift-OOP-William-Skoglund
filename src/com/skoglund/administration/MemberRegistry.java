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
        System.out.println("Ny medlem registrerad:");
        printMemberInfo(newMember);
    }

    public void removeMember(Member member){
        memberList.remove(member);
    }

    public void showAllMembers() {
        for (Member member : memberList) {
            printMemberInfo(member);
        }
    }

    private void printMemberInfo(Member member){
        System.out.println("Namn: " + member.getName() + " | ID: " + member.getId() +
                " | Åldersgrupp: " + member.getAgeGroup());
    }

    public void searchAndDisplayMember(String ID){
        for(Member member : memberList){
            if(ID.equals(member.getId())){
                printMemberInfo(member);
                return;
            }
        }
        System.out.println("Medlemmen är ej registrerad i klubben!");
    }

    public Member searchAndGetMember(String ID){
        for(Member member: memberList){
            if(ID.equals(member.getId())){
                return member;
            }
        }
        return null;
    }
}
