package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών στον χρήστη και του ζητάει να επιλέξει μία επιλογή.
 * Ανάλογα με το choise δίνουμε
 * feedback.
 */
public class SwitchApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choise = 0;
        final int EXIT = 5;

        do{
            System.out.println("Προβολή προφίλ...");
            System.out.println("Επεξεργασία προφίλ...");
            System.out.println("Ρυθμίσεις...");
            System.out.println("Βοήθεια...");
            System.out.println("Έξοδος...");

            switch(choise){
//                case 1:
//                    System.out.println("Προβολή προφίλ...");
//                    break;
//                case 2:
//                    System.out.println("Επεξεργασία προφίλ...");
//                    break;
//                case 3:
//                    System.out.println("Ρυθμίσεις...");
//                    break;
//                case 4:
//                    System.out.println("Βοήθεια...");
//                    break;
//                case EXIT:
//                    System.out.println("Έξοδος...");
//                    break;
//                default:
//                    System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
//                    break;

                //arrow syntax, no break needed

                case 1 ->System.out.println("Προβολή προφίλ...");
                case 2->System.out.println("Επεξεργασία προφίλ...");
                case 3->System.out.println("Ρυθμίσεις...");
                case 4->System.out.println("Βοήθεια...");
                case EXIT->System.out.println("Έξοδος...");
                default->System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
            }
        } while (choise != EXIT);
    }
}
