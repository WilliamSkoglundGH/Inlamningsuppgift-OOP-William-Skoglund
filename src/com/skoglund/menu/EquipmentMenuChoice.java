package com.skoglund.menu;

import java.util.Scanner;

public class EquipmentMenuChoice {

    public void showMenuChoiceEquipment(){
        Scanner scanner = new Scanner(System.in);
        boolean showMenu2 = true;
        do{
            System.out.println("Här hanterar uthyrningar!");
            System.out.println("1) Boka ny uthyrning");
            System.out.println("2) Avsluta en pågående uthyrning");
            System.out.println("3) Visa alla pågående uthyrningar");
            System.out.println("4) Gå tillbaks till startsidan");
            System.out.print("Gör ditt val (1-4): ");

            try {
                int menu2Choice = scanner.nextInt();
                switch(menu2Choice){
                    case 1:
                        //Boka ny uthyrning
                        break;

                    case 2:
                        //Avsluta en pågående uthyrning
                        break;

                    case 3:
                        //Visa alla pågende uthyrningar
                        break;

                    case 4:
                        System.out.println("Klicka ENTER för att komma tillbaks till startsidan!");
                        showMenu2 = false;
                        continue;

                    default:
                        System.out.println("Heltalet du skriver in måste vara mellan 1 tom 4");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Du måste ange ett heltal!");
            }

        }while(showMenu2);
    }
}

