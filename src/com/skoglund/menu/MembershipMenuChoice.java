package com.skoglund.menu;

import com.skoglund.administration.MemberRegistry;
import com.skoglund.entity.Member;
import com.skoglund.service.MembershipService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MembershipMenuChoice {
    public void showMenuChoiceMembership(MemberRegistry memberRegistry, MembershipService membershipService) {

        Scanner scanner = new Scanner(System.in);
        boolean showMenu1 = true;
        do {
            System.out.println("Här hanterar du medlemskap!");
            System.out.println("1) Lägg till medlem");
            System.out.println("2) Sök efter/ändra en medlem i medlemsregistret");
            System.out.println("3) Visa alla medlemmar");
            System.out.println("4) Gå tillbaks till startsidan");
            System.out.print("Gör ditt val (1-4): ");

            try {
                int menuChoice = scanner.nextInt();
                scanner.nextLine();
                switch(menuChoice){
                    case 1:
                        System.out.println("1) Lägg till medlem:");

                        System.out.print("Ange namn: ");
                        String name = scanner.nextLine();

                        boolean repeatAgeGroup = true;
                        do{
                            System.out.print("Ange åldersgrupp (barn, ungdom, vuxen, pensionär): ");
                            String ageGroup = scanner.nextLine();
                            if(!ageGroup.equalsIgnoreCase("barn") &&
                                    !ageGroup.equalsIgnoreCase("ungdom") &&
                                    !ageGroup.equalsIgnoreCase("vuxen") &&
                                    !ageGroup.equalsIgnoreCase("pensionär")){
                                System.out.println("Åldersgrupp måste vara (barn, ungdom, vuxen eller pensionär)");
                                System.out.println("Försök igen.");

                            }
                            else{
                                membershipService.addMember(new Member(name, ageGroup));
                                repeatAgeGroup = false;
                            }
                        }while(repeatAgeGroup);
                        break;

                    case 2:
                        System.out.println("2) Sök efter eller ändra en medlem:");

                        System.out.print("Ange medlemsID: ");
                        String ID = scanner.nextLine();

                        membershipService.searchAndDisplayMember(ID);

                        System.out.println("Vill du ändra denna medlems uppgifter?(ja/nej): ");
                        String changeOrNot = scanner.nextLine();

                        if(changeOrNot.equalsIgnoreCase("ja")){
                            Member memberForChange = membershipService.searchAndGetMember(ID);
                            boolean showChangeMenu = true;
                            do{
                                System.out.println("1) Ändra namn");
                                System.out.println("2) Ändra ID");
                                System.out.println("3) Ändra åldersgrupp");
                                System.out.println("4) Stäng menyn!");
                                System.out.print("Ditt val: ");

                                try{
                                    int choice = scanner.nextInt();
                                    scanner.nextLine();

                                    switch(choice){
                                        case 1:
                                            System.out.println("1) Ändra namn");
                                            System.out.print("Ange nytt namn: ");
                                            String newName = scanner.nextLine();
                                            memberForChange.setName(newName);
                                            System.out.println("Namn ändrat, nytt namn: " + newName);
                                            break;

                                        case 2:
                                            System.out.println("2) Ändra ID");
                                            System.out.print("Ange nytt ID: ");
                                            String newID = scanner.nextLine();
                                            memberForChange.setId(newID);
                                            System.out.println("ID ändrat, nytt ID: " + newID);
                                            break;

                                        case 3:
                                            System.out.println("3) Ändra åldersgrupp");
                                            System.out.print("Ange ny åldersgrupp(barn,ungdom,vuxen,pensionär): ");
                                            String newAgeGroup = scanner.nextLine();
                                            memberForChange.setAgeGroup(newAgeGroup);
                                            System.out.println("Åldersgrupp ändrat, ny åldersgrupp: " + newAgeGroup);
                                            break;


                                        case 4:
                                            System.out.println("Menyn stängs!");
                                            showChangeMenu = false;
                                            continue;

                                        default:
                                            System.out.println("Heltalet måste vara mellan 1-4");
                                    }
                                    System.out.println("KLICKA ENTER FÖR ATT ÅTERGÅ TILL MENYN!");
                                    scanner.nextLine();
                                }catch(InputMismatchException ex){
                                    System.out.println("Du måste ange ett heltal!");
                                    System.out.println("Klicka ENTER för att återgå till ändringsmenyn och försök igen!");
                                    scanner.nextLine(); //rensar felaktiga värdet från scannern
                                    scanner.nextLine(); //väntar på ENTER
                                }

                            }while(showChangeMenu);


                        }
                        else if (changeOrNot.equalsIgnoreCase("nej")){
                            System.out.println("Du skickas tillbaks till menyn");
                        }
                        break;

                    case 3:
                        membershipService.showAllMembers();
                        break;

                    case 4:
                        System.out.println("Klicka ENTER för att komma tillbaks till startsidan!");
                        showMenu1 = false;
                        continue;

                    default:
                        System.out.println("Heltalet du skriver in måste vara mellan 1 tom 4");
                }
                System.out.println("KLICKA ENTER FÖR ATT ÅTERGÅ TILL MENYN!");
                scanner.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Du måste ange ett heltal!");
                System.out.println("Klicka ENTER för att återgå till medlemsmenyn och försök igen!");
                scanner.nextLine(); //rensar felaktiga värdet från scannern
                scanner.nextLine(); //väntar på ENTER
            }
        }while(showMenu1);
    }
}
