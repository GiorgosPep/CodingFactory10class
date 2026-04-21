package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 *  Ο χρήστης εισάγει τρεις πλευρές τριγώνου.
 *  Εμφανίζουμε αν το τρίγωνο είναι ορθογώνιο ή όχι.
 */
public class RighTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        boolean isRightTriangle = false;
        final double EPSILON = 0.0000005;

        System.out.println("Δώσε τις τρείς πλευρές του τριγώνου (ξεκινώντας από την υποτείνουσα):");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        isRightTriangle = Math.abs(a*a - b*b - c*c) < EPSILON;
        System.out.println("Το τρίγωνο είναι ορθογώνιο: " + isRightTriangle);

    }
}
