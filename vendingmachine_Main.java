/*AUTHOR Nadine Alosert
This is a program that provides
information about types of snacks
and its prices when asked for.
 */

import java.util.Scanner;

class vendingMachine {
    vendingMachine() {
    }

    public static void main(String[] param) {
        welcome();
        viewSelection();
        System.exit(0);
    }

    public static void welcome() {
        String intro = "Welcome to Vendi!Here are your wide selection of snacks:";
        System.out.println(intro);
    }

    public static void viewSelection() {
        String nameA = "Crisp packet";
        String nameB = "Health bar";
        String nameC = "Chocolate bar";
        System.out.println("A: " + nameA);
        System.out.println("B: " + nameB);
        System.out.println("C: " + nameC);
        String priceA = "1.50";
        String priceB = "1.20";
        String priceC = "2.00";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.toUpperCase().equals("A")) {
            System.out.println("£" + priceA);
            System.out.println("Thank you for using Vendi");
        } else if (name.toUpperCase().equals("B")) {
            System.out.println("£" + priceB);
            System.out.println("Thank you for using Vendi");
        } else if (name.toUpperCase().equals("C")) {
            System.out.println("£" + priceC);
            System.out.println("Thank you for using Vendi");
        } else {
            System.out.println("ERROR IN CHOICE SELECTED.Please try again.");
        }

    }//END viewSelection
}//END vendingMachine
