package com.skoglund.menu;

import com.skoglund.administration.Inventory;
import com.skoglund.administration.MemberRegistry;
import com.skoglund.entity.Member;
import com.skoglund.entity.Rental;
import com.skoglund.entity.items.Item;
import com.skoglund.service.RentalService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RentalMenuChoice {

    public void showMenuChoiceRental(RentalService rentalService, Inventory inventory, MemberRegistry memberRegistry){
        Scanner scanner = new Scanner(System.in);
        boolean showMenu = true;
        do{
            System.out.println("Här hanterar du uthyrningar!");
            System.out.println("1) Boka ny uthyrning");
            System.out.println("2) Avsluta en pågående uthyrning");
            System.out.println("3) Visa en medlems pågående uthyrningar");
            System.out.println("4) Visa en medlems uthyrningshistorik");
            System.out.println("5) Gå tillbaks till startsidan");
            System.out.print("Gör ditt val (1-5): ");

            try {
                int menuChoice = scanner.nextInt();
                scanner.nextLine();
                switch(menuChoice){
                    case 1:
                        boolean showBookingMenu = true;
                        do{
                            System.out.println("1) Här bokar du en ny uthyrning");
                            System.out.println("Här under visas info om klubbens utrustning:");
                            inventory.showItemInfo();
                            System.out.println("KLICKA ENTER FÖR ATT GÖRA DITT VAL AV UTRUSTNING");
                            scanner.nextLine();

                            System.out.println("1) Fiskespö");
                            System.out.println("2) Fiskerulle");
                            System.out.println("3) Betesset");
                            System.out.println("4) Spara och stäng uthyrningssidan");
                            System.out.print("Ditt val (1-4): ");

                            try{
                                int choice = scanner.nextInt();
                                scanner.nextLine();
                                switch(choice){
                                    case 1:
                                        boolean repeatCustomerID = true;
                                        do{
                                            System.out.println("Här bokar/hyr du fiskespöt");
                                            System.out.print("Ange kund ID: ");
                                            String ID = scanner.nextLine();

                                            Member member = memberRegistry.searchAndGetMember(ID);
                                            if(member == null){
                                                System.out.println("Det finns ingen medlem registrerad med det ID:et");
                                                System.out.println("Försök igen");
                                            }
                                            else{
                                                System.out.print("Ange tidsperiod för uthyrning(antal dagar): ");
                                                try{
                                                    int rentalPeriod = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Item item = inventory.getItemFromInventory("Fiskespö");
                                                    Rental newRental = rentalService.createNewRental(item, member, rentalPeriod);
                                                    if(newRental == null){
                                                        System.out.println("Utrustningen är redan uthyrd!");
                                                        System.out.println("KLICKA PÅ ENTER FÖR ATT ÅTERGÅ TILL MENYN");
                                                        scanner.nextLine();
                                                        break;
                                                    }
                                                    else{
                                                        rentalService.showRentalInfo(newRental);
                                                        System.out.println("KLICKA PÅ ENTER FÖR ATT ÅTERGÅ TILL MENYN FÖR UTHYRNINGAR");
                                                        scanner.nextLine();
                                                        repeatCustomerID = false;
                                                    }
                                                }catch (InputMismatchException ex){
                                                    System.out.println("Du måste ange dagar som ett heltal!");
                                                    System.out.println("Klicka ENTER för att göra om bokning!");
                                                    scanner.nextLine(); //rensar felaktiga värdet från scannern
                                                    scanner.nextLine(); //väntar på ENTER
                                                }

                                            }
                                        }while(repeatCustomerID);
                                        break;

                                    case 2:
                                        boolean repeatCustomerIDD = true;
                                        do{
                                            System.out.println("Här bokar/hyr du ut fiskerullen");
                                            System.out.print("Ange kund ID: ");
                                            String ID = scanner.nextLine();

                                            Member member = memberRegistry.searchAndGetMember(ID);
                                            if(member == null){
                                                System.out.println("Det finns ingen medlem registrerad med det ID:et");
                                                System.out.println("Försök igen");
                                            }
                                            else{
                                                System.out.print("Ange tidsperiod för uthyrning(antal dagar): ");
                                                try{
                                                    int rentalPeriod = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Item item = inventory.getItemFromInventory("Fiskerulle");
                                                    Rental newRental = rentalService.createNewRental(item, member, rentalPeriod);
                                                    if(newRental == null){
                                                        System.out.println("Utrustningen är redan uthyrd!");
                                                        System.out.println("KLICKA PÅ ENTER FÖR ATT ÅTERGÅ TILL MENYN");
                                                        scanner.nextLine();
                                                        break;
                                                    }
                                                    else{
                                                        rentalService.showRentalInfo(newRental);
                                                        System.out.println("KLICKA PÅ ENTER FÖR ATT ÅTERGÅ TILL MENYN FÖR UTHYRNINGAR");
                                                        scanner.nextLine();
                                                        repeatCustomerIDD = false;
                                                    }
                                                }catch(InputMismatchException ex){
                                                    System.out.println("Du måste ange dagar som ett heltal!");
                                                    System.out.println("Klicka ENTER för att göra om bokning!");
                                                    scanner.nextLine(); //rensar felaktiga värdet från scannern
                                                    scanner.nextLine(); //väntar på ENTER

                                                }

                                            }
                                        }while(repeatCustomerIDD);
                                        break;

                                    case 3:
                                        boolean repeatCustomerIDDD = true;
                                        do{
                                            System.out.println("Här bokar/hyr du betessettet");
                                            System.out.print("Ange kund ID: ");
                                            String ID = scanner.nextLine();

                                            Member member = memberRegistry.searchAndGetMember(ID);
                                            if(member == null){
                                                System.out.println("Det finns ingen medlem registrerad med det ID:et");
                                                System.out.println("Försök igen");
                                            }
                                            else{
                                                System.out.print("Ange tidsperiod för uthyrning(antal dagar): ");
                                                try{
                                                    int rentalPeriod = scanner.nextInt();
                                                    scanner.nextLine();
                                                    Item item = inventory.getItemFromInventory("Betesset");
                                                    Rental newRental = rentalService.createNewRental(item, member, rentalPeriod);
                                                    if(newRental == null){
                                                        System.out.println("Utrustningen är redan uthyrd!");
                                                        System.out.println("KLICKA PÅ ENTER FÖR ATT ÅTERGÅ TILL MENYN");
                                                        scanner.nextLine();
                                                        break;
                                                    }
                                                    else{
                                                        rentalService.showRentalInfo(newRental);
                                                        System.out.println("KLICKA PÅ ENTER FÖR ATT ÅTERGÅ TILL MENYN FÖR UTHYRNINGAR");
                                                        scanner.nextLine();
                                                        repeatCustomerIDDD = false;
                                                    }
                                                }catch(InputMismatchException ex){
                                                    System.out.println("Du måste ange dagar som ett heltal!");
                                                    System.out.println("Klicka ENTER för att göra om bokning!");
                                                    scanner.nextLine(); //rensar felaktiga värdet från scannern
                                                    scanner.nextLine(); //väntar på ENTER
                                                }

                                            }
                                        }while(repeatCustomerIDDD);
                                        break;

                                    case 4:
                                        System.out.println("Bokning/ar sparas, du återgår till menyn!");
                                        showBookingMenu = false;
                                        break;

                                    default:
                                        System.out.println("Heltalet du anger måste vara mellan 1 tom 4");
                                        break;
                                }
                            }catch(InputMismatchException ex){
                                System.out.println("Du måste ange ett heltal!");
                                System.out.println("Klicka ENTER för att återgå till val av utrustning och försök igen!");
                                scanner.nextLine(); //rensar felaktiga värdet från scannern
                                scanner.nextLine(); //väntar på ENTER

                            }
                            }while(showBookingMenu);
                        break;

                    case 2:
                        //avsluta en aktiv uthyrning
                        System.out.println("2) Här avslutar du en pågående uthyrning");
                        System.out.println("Ange medlems ID (för kunden bokningen gäller): ");
                        String ID = scanner.nextLine();

                        Member member = memberRegistry.searchAndGetMember(ID);
                        if(member == null){
                            System.out.println("Ingen medlem är registrerad under detta ID");
                        }
                        else{
                            System.out.println("Ange vilken utrustning bokningen gäller");
                            System.out.print("(fiskespö, fiskerulle eller betesset): ");
                            String itemType = scanner.nextLine();

                            Rental rental = member.getSpecificRental(itemType);
                            if(rental == null){
                                System.out.println("Medlemmen har ingen aktiv uthyrning med " + itemType);
                            }
                            else{
                                rentalService.finishRental(member, rental);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Här visar du en medlems pågående uthyrningar");
                        System.out.println("Ange ID för medlemmen:");
                        String id = scanner.nextLine();
                        Member member1 = memberRegistry.searchAndGetMember(id);
                        if(member1 == null){
                            System.out.println("Det finns ingen registrerad medlem med det ID:et");
                        }
                        else{
                            member1.showActiveRentals();
                            System.out.println("KLICKA ENTER FÖR ATT ÅTERGÅ TILL MENYN!");
                            scanner.nextLine();
                        }
                        break;

                    case 4:
                        System.out.println("Här visar du en medlems uthyrningshistorik");
                        System.out.println("Ange ID för medlemmen:");
                        String memberId = scanner.nextLine();
                        Member member2 = memberRegistry.searchAndGetMember(memberId);
                        if(member2 == null){
                            System.out.println("Det finns ingen registrerad medlem med det ID:et");
                        }
                        else{
                            member2.showRentalHistory();
                            System.out.println("KLICKA ENTER FÖR ATT ÅTERGÅ TILL MENYN!");
                            scanner.nextLine();
                        }
                        break;

                    case 5:
                        System.out.println("Klicka ENTER för att komma tillbaks till startsidan!");
                        showMenu = false;
                        continue;

                    default:
                        System.out.println("Heltalet du skriver in måste vara mellan 1 tom 4");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Du måste ange ett heltal!");
                System.out.println("Klicka ENTER för att återgå till uthyrningsmenyn och försök igen!");
                scanner.nextLine(); //rensar felaktiga värdet från scannern
                scanner.nextLine(); //väntar på ENTER
            }

        }while(showMenu);
    }
}

