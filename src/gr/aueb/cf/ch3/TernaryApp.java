package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τριαδικός τελεστής για τον υπολογισμό του
 * μικρότερου μεταξύ δύο ακεραίων
 */
public class TernaryApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1=0;
        int num2=0;
        int min=0;

        System.out.println("Εισάγετε δύο ακεραίους: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        min = num1 < num2 ? num1 : num2;

        //Εκτύπωση Αποτελεσμάτων
        System.out.println("Ο αριθμός μεταξύ " +num1 + " και " +num2 + " είναι " + min);
    }
}
