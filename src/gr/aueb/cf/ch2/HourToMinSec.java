package gr.aueb.cf.ch2;
import java.util.Scanner;

/**
 * Λαμβάνει από το χρήστη έναν ακέραιο που αντιστοιχεί σε ώρες. Μετατρέπει σε λεπτά
 * και δευτερόλεπτα και τα εκτυπώνει
 */
public class HourToMinSec {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3600;
        int inputHours = 0;
        int minutes = 0;
        int seconds =0;

        //Input - Data Biding
        System.out.println("Παρακαλώ εισάγετε τον αριθμό των ωρών: ");
        inputHours = scanner.nextInt();

        //Εντολές επεξεργασίας
        minutes = inputHours * HOURS_TO_MINUTES;
        seconds = inputHours * HOURS_TO_SECONDS;

        System.out.printf("Ώρες: %d, Λεπτά: %d, Δευτερόλεπτα: %d\n", inputHours,minutes,seconds);
    }
}
