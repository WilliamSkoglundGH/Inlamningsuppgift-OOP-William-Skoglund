package com.skoglund.menu;

import com.skoglund.administration.Inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquipmentMenuChoice {

    public void showMenuChoiceEquipment(Inventory inventory){
        Scanner scanner = new Scanner(System.in);
        boolean showMenu3 = true;
        do {
            System.out.println("Här hanterar du klubbens material!");
            System.out.println("1) Visa klubbens material");
            System.out.println("2) Visa material tillgängligt för uthyrning");
            System.out.println("3) Visa uthyrt material");
            System.out.println("4) Gå tillbaks till startsidan");
            System.out.print("Gör ditt val (1-4): ");

            try {
                int menuChoice = scanner.nextInt();
                scanner.nextLine();
                switch(menuChoice){
                    case 1:
                        System.out.println("Här under visas klubbens utrustning");
                        inventory.showItemInfo();
                        break;

                    case 2:
                        System.out.println("Här under visas det material som är tillgängligt för uthyrning");
                        inventory.showAvailableItems();
                        break;

                    case 3:
                        System.out.println("Här under visas det material som i nuläget är uthyrt");
                        inventory.showRentedItems();
                        break;

                    case 4:
                        System.out.println("Klicka ENTER för att komma tillbaks till startsidan!");
                        showMenu3 = false;
                        continue;

                    default:
                        System.out.println("Heltalet du skriver in måste vara mellan 1 tom 4");
                }
                System.out.println("KLICKA PÅ ENTER FÖR ATT ÅTERGÅ TILL MENYN!");
                scanner.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Du måste ange ett heltal!");
                System.out.println("Klicka ENTER för att återgå till materialmenyn och försök igen!");
                scanner.nextLine(); //rensar felaktiga värdet från scannern
                scanner.nextLine(); //väntar på ENTER
            }
        }while(showMenu3);
    }
}
