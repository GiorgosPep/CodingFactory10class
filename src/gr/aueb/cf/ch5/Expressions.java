package gr.aueb.cf.ch5;

/**
 * Demmo of floating point expressions
 */
public class Expressions {
    public static void main(String[] args) {
        int myInt = 10;
        float myFloat = 10.5f;
        double myDouble =10.5;
        double result = 0.0;

        result = myInt + myFloat + myDouble; //όλα μετατρέπονται στον μεγαλύτερο τύπο

        System.out.println("Result: " + result);
        System.out.printf("Result formatted : %.2f\n", result);
    }
}
