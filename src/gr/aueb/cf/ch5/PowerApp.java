package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη a^b με μέθοδο
 */
public class PowerApp {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int base = 0;
        int exponent = 0;


        //Input & data binding
        System.out.println("Δώστε δύο ακεραίους, πρώτα τη βάση και μετά τον εκθέτη: ");
        base= in.nextInt();
        exponent= in.nextInt();

        //Calls the service - delegation
        int result = pow(base,exponent);

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Το αποτέλεσμα είναι: "+result);
    }

    /**
     * Calculates a^b
     * @param a the base number
     * @param b the exponent
     * @return a^b
     */
    public static int pow(int a, int b){
        int result = 1;
        for(int i = 0; i<b; i++) {
            result *=a;
        }
        return result;
    }
}
