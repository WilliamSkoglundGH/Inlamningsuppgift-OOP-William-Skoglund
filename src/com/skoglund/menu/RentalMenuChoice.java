package com.skoglund.menu;

import com.skoglund.administration.Inventory;
import com.skoglund.administration.MemberRegistry;
import com.skoglund.entity.Member;
import com.skoglund.service.RentalService;

import java.util.Scanner;

public class RentalMenuChoice {

    public void showMenuChoiceRental(RentalService rentalService){
        Scanner scanner = new Scanner(System.in);
        boolean showMenu = true;
        do{
            System.out.println("Här hanterar du uthyrningar!");
            System.out.println("1) Boka ny uthyrning");
            System.out.println("2) Avsluta en pågående uthyrning");
            System.out.println("3) Visa alla pågående uthyrningar");
            System.out.println("4) Gå tillbaks till startsidan");
            System.out.print("Gör ditt val (1-4): ");

            try {
                int menuChoice = scanner.nextInt();
                scanner.nextLine();
                switch(menuChoice){
                    case 1:
                        boolean showBookingMenu = true;
                        do{
                            System.out.println("1) Här bokar du en ny uthyrning");
                            System.out.println("Detta är klubbens utrustning:");
                            System.out.println("1) Fiskespö");
                            System.out.println("2) Fiskerulle");
                            System.out.println("3) Betesset");
                            System.out.print("Vilken utrustning gäller bokningen: ");

                            int choice = scanner.nextInt();
                            scanner.nextLine();


                            switch(choice){
                                case 1:


                                    break;

                                case 2:
                                    //boka fiskerulle
                                    break;

                                case 3:
                                    //boka betesset
                                    break;

                                case 4:
                                    System.out.println("Bokning/ar sparas, du återgår till menyn!");
                                    showBookingMenu = false;
                                    break;

                                default:
                                    System.out.println("Heltalet du anger måste vara mellan 1 tom 4");
                                    break;
                            }
                        }while(showBookingMenu);

                        System.out.print("Ange vilken utrustning(fiskespö, fiskerulle, betesset): ");

                        System.out.println("Ange kundID: ");
                        String ID = scanner.nextLine();

                        System.out.println("Ange uthyrningsperiod: ");
                        String rentalPeriod = scanner.nextLine();

                        Member member = memberRegistry.searchAndGetMember(ID);
                        if(member == null){
                            System.out.println("ID matchar ej någon registrerad medlem!");
                        }
                        else{
                            //gör bokningen!
                        }


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
                        showBookingMenu = false;
                        continue;

                    default:
                        System.out.println("Heltalet du skriver in måste vara mellan 1 tom 4");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Du måste ange ett heltal!");
            }

        }while(showMenu);
    }
}

