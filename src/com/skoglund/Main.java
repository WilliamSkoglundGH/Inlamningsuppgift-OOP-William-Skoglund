package com.skoglund;

import com.skoglund.administration.Inventory;
import com.skoglund.administration.MemberRegistry;
import com.skoglund.entity.items.FishingReel;
import com.skoglund.entity.items.FishingRod;
import com.skoglund.entity.items.LureSet;
import com.skoglund.menu.EquipmentMenuChoice;
import com.skoglund.menu.MembershipMenuChoice;
import com.skoglund.menu.RentalMenuChoice;
import com.skoglund.service.MembershipService;
import com.skoglund.service.RentalService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MemberRegistry memberRegistry = new MemberRegistry();
        MembershipService membershipService = new MembershipService(memberRegistry);

        Inventory inventory = new Inventory();
        RentalService rentalService = new RentalService();

        MembershipMenuChoice menuChoice1 = new MembershipMenuChoice();
        RentalMenuChoice menuChoice2 = new RentalMenuChoice();
        EquipmentMenuChoice menuChoice3 = new EquipmentMenuChoice();

        inventory.addItem(new FishingRod("Svartzonker", "Svart" , true, "7", "90-180",
                "spinn"));
        inventory.addItem(new FishingReel("Daiwa", "Svart", true, "6:3:1", "Spinn",
                "16"));
        inventory.addItem(new LureSet("Westin" , "Röd", true, "Swimbait"));

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
                            menuChoice1.showMenuChoiceMembership(memberRegistry, membershipService);
                            break;

                    case 2:
                        menuChoice2.showMenuChoiceRental(rentalService, inventory, memberRegistry);
                        break;

                    case 3:
                        menuChoice3.showMenuChoiceEquipment(inventory);
                        break;

                    case 4:
                        System.out.println("Intäkter: " + rentalService.calculateIncomeFromRentals() + "kr");
                        System.out.println("KLICKA ENTER FÖR ATT ÅTERGÅ TILL STARTSIDAN!");
                        scanner.nextLine();
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
                System.out.println("Klicka ENTER för att återgå till startsidan och försök igen!");
                scanner.nextLine(); //rensar felaktiga värdet från scannern
                scanner.nextLine(); //väntar på ENTER
            }
        }while(showMenu);

    }
}
