package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα menu με πολλαπλά if .
 */
public class MultipleifApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;

        do {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές: ");
            System.out.println("1. Προβολή προφιλ");
            System.out.println("2. Επεξεργασία προφιλ");
            System.out.println("3. Ρυθμίσεις");
            System.out.println("4. Βοήθεια");
            System.out.println("5. Έξοδος");

            choise = in.nextInt();

            if (choise ==1){
                System.out.println("Προβολή προφίλ...");
            } else if(choise == 2){
                System.out.println("Επεξεργασία προφίλ...");
            } else if (choise == 3){
                System.out.println("Ρυθμίσεις...");
            } else if (choise == 4){
                System.out.println("Βοήθεια...");
            } else if (choise == 5){
                System.out.println("Έξοδος...");
            } else {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά. ");
            }
        } while (choise !=5); // 5 is exit
    }
}
