package com.skoglund.menu;

import com.skoglund.administration.MemberRegistry;
import com.skoglund.entity.Member;
import com.skoglund.service.MembershipService;

import java.util.Scanner;

public class MembershipMenuChoice {

    public void showMenuChoiceMembership() {
        Scanner scanner = new Scanner(System.in);
        boolean showMenu1 = true;
        do {
            System.out.println("Här hanterar du medlemskap!");
            System.out.println("1) Lägg till medlem");
            System.out.println("2) Ta bort medlem");
            System.out.println("3) Sök efter medlem i medlemsregistret");
            System.out.println("4) Ändra medlemsuppgifter");
            System.out.println("5) Gå tillbaks till startsidan");
            System.out.print("Gör ditt val (1-5): ");

            try {
                int menu1Choice = scanner.nextInt();
                switch(menu1Choice){
                    case 1:
                        //Lägg till medlem
                        break;

                    case 2:
                        //Ta bort medlem
                        break;

                    case 3:
                        //Sök efter medlem i medlemsregistret
                        //visa medlemens info om hittas!
                        break;

                    case 4:
                        //ändra medlemsuppgifter
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
