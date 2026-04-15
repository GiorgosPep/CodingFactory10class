package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο. Το πρόγραμμα υπολογίζει
 * το απόλυτο του ακεραίου.
 */
public class AbsTernary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int result = 0;

        System.out.println("Εισάγετε έναν ακέραιο: ");
        num = in.nextInt();
        result = num >= 0 ? num : -num ;

        System.out.println("Η απόλυτη τιμή του αριθμού είναι: " + result);
    }
}
