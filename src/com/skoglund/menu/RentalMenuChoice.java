package com.skoglund.menu;

import java.util.Scanner;

public class RentalMenuChoice {

    public void showMenuChoiceRental(){
        Scanner scanner = new Scanner(System.in);
        boolean showMenu3 = true;
        do {
            System.out.println("Här hanterar du klubbens uthyrningsmaterial!");
            System.out.println("1) Visa allt material");
            System.out.println("2) Visa material tillgängligt för uthyrning");
            System.out.println("3) Visa uthyrt material");
            System.out.println("4) Gå tillbaks till startsidan");
            System.out.print("Gör ditt val (1-4): ");

            try {
                int menu2Choice = scanner.nextInt();
                switch(menu2Choice){
                    case 1:
                        //Visa allt material (inventory)
                        break;

                    case 2:
                        //Visa material tillgängligt för uthyrning
                        break;

                    case 3:
                        //Visa uthyrt material
                        break;

                    case 4:
                        System.out.println("Klicka ENTER för att komma tillbaks till startsidan!");
                        showMenu3 = false;
                        continue;

                    default:
                        System.out.println("Heltalet du skriver in måste vara mellan 1 tom 6");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Du måste ange ett heltal!");
            }
        }while(showMenu3);
    }
}
