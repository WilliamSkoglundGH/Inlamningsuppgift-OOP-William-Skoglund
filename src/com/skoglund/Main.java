package com.skoglund;

import com.skoglund.entity.items.FishingReel;
import com.skoglund.entity.items.FishingRod;
import com.skoglund.entity.items.Item;

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
                switch(menuChoice){
                        case 1:
                            boolean showMenu1 = true;
                            do {
                                System.out.println("Här hanterar du medlemskap!");
                                System.out.println("1) Lägg till medlem");
                                System.out.println("2) Ta bort medlem");
                                System.out.println("3) Sök efter medlem i medlemsregistret");
                                System.out.println("4) Ändra medlemsuppgifter");
                                System.out.println("5) Gå tillbaks till startsidan");
                                System.out.println("Gör ditt val (1-4)");

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
                                            break;

                                        case 4:
                                            //ändra medlemsuppgifter
                                            break;

                                        case 5:
                                            System.out.println("Du skickas tillbaks till startsidan!");
                                            showMenu1 = false;
                                            continue;

                                        default:
                                            System.out.println("Heltalet du skriver in måste vara mellan 1 tom 6");
                                    }
                                } catch (NumberFormatException ex) {
                                    System.out.println("Du måste ange ett heltal!");
                                }
                            }while(showMenu1);


                    case 2:
                       //Visa de olika delarna av uthyrningshantering
                        break;

                    case 3:
                        //Visa de olika delarna av hantering av uthyrningsmaterial
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
            System.out.println("Klicka på ENTER för att komma tillbaks till menyn!");
            scanner.nextLine();

        }while(showMenu);

    }
}
