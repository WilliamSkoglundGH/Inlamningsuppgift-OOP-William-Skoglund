package com.skoglund;

import com.skoglund.menu.EquipmentMenuChoice;
import com.skoglund.menu.MembershipMenuChoice;
import com.skoglund.menu.RentalMenuChoice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean showMenu = true;
        do{
            System.out.println("Välkommen till medlemsklubben för sportfiskare!");
            System.out.println("Du har kommit till startsidan, här under visas menyn:");
            System.out.println("1) Hantera medlemskap");
            System.out.println("2) Hantera uthyrningar");
            System.out.println("3) Hantera klubbens uthyrningsmaterial");
            System.out.println("4) Summera intäkter");
            System.out.println("5) Avsluta");
            System.out.print("Gör ditt val (1-5): ");

            try{
                int menuChoice = scanner.nextInt();
                scanner.nextLine();
                switch(menuChoice){
                        case 1:
                            MembershipMenuChoice menuChoice1 = new MembershipMenuChoice();
                            menuChoice1.showMenuChoiceMembership();
                            break;

                    case 2:
                        EquipmentMenuChoice menuChoice2 = new EquipmentMenuChoice();
                        menuChoice2.showMenuChoiceEquipment();
                        break;

                    case 3:
                        RentalMenuChoice menuChoice3 = new RentalMenuChoice();
                        menuChoice3.showMenuChoiceRental();
                        break;

                    case 4:
                        //Visa intäkter
                        break;

                    case 5:
                        System.out.println("Programmet avslutas!");
                        showMenu = false;
                        continue;

                    default:
                        System.out.println("Heltalet du skriver in måste vara mellan 1 tom 6!");
                        break;
                }
            }catch (InputMismatchException ex){
                System.out.println("Du måste ange ett heltal!");
            }
            finally{
                scanner.nextLine();
            }
        }while(showMenu);

    }
}
