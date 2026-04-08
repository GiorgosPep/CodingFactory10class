package gr.aueb.cf.ch1;

/**
 * Η κλάση προσθέτει δύο ακεραίους και εμφανίζει το αποτέλεσμα στην κοσνόλα
 */
public class MyAdd {

    public static void main(String[] args) {
        //Η δήλωση και η αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Η λογική - Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το άθροισμα των "+ num1 + " και " + num2 + " είναι: " + result  );
        System.out.printf("Το άθροισμα των %d και %d είναι: %d\n",num1,num2,result);
    }
}
