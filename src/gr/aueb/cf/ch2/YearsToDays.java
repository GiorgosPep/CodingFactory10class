package gr.aueb.cf.ch2;
import java.util.Scanner;

public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputAgeInYears=0;
        int ageInDays=0;
        final int DAYS_IN_YEARS=365;

        //Input & Data binding
        System.out.println("Παρακαλώ εισάγετε την ηλικία σας σε έτη");
        inputAgeInYears = scanner.nextInt(); //data binding

        //Λογική της εφαρμογής
        ageInDays = inputAgeInYears * DAYS_IN_YEARS;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Ηλικία σε έτη: %d. Ηλικία σε ημέρες: %d\n", inputAgeInYears,ageInDays);
    }
}
