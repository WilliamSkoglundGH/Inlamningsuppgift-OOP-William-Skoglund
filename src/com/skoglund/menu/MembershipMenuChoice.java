package com.skoglund.menu;

import com.skoglund.administration.MemberRegistry;
import com.skoglund.entity.Member;
import com.skoglund.service.MembershipService;

import java.util.List;
import java.util.Scanner;

public class MembershipMenuChoice {
    public void showMenuChoiceMembership(MemberRegistry memberRegistry, MembershipService membershipService) {

        Scanner scanner = new Scanner(System.in);
        boolean showMenu1 = true;
        do {
            System.out.println("Här hanterar du medlemskap!");
            System.out.println("1) Lägg till medlem");
            System.out.println("2) Sök efter medlem i medlemsregistret");
            System.out.println("3) Ändra medlemsuppgifter");
            System.out.println("4) Visa alla medlemmar");
            System.out.println("5) Gå tillbaks till startsidan");
            System.out.print("Gör ditt val (1-5): ");

            try {
                int menu1Choice = scanner.nextInt();
                scanner.nextLine();
                switch(menu1Choice){
                    case 1:
                        System.out.println("Lägg till medlem:");

                        System.out.print("Ange namn: ");
                        String name = scanner.nextLine();

                        System.out.print("Ange åldersgrupp (barn, ungdom, vuxen, pensionär): ");
                        String ageGroup = scanner.nextLine();
                        membershipService.addMember(new Member(name, ageGroup));

                        break;

                    case 2:
                        //Sök efter medlem i medlemsregistret
                        //visa medlemens info om hittas!
                        break;

                    case 3:
                        //ändra medlemsuppgifter
                        break;

                    case 4:
                        membershipService.showAllMembers();
                        break;

                    case 5:
                        System.out.println("Klicka ENTER för att komma tillbaks till startsidan!");
                        showMenu1 = false;
                        continue;

                    default:
                        System.out.println("Heltalet du skriver in måste vara mellan 1 tom 5");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Du måste ange ett heltal!");
            }
        }while(showMenu1);
    }
}
