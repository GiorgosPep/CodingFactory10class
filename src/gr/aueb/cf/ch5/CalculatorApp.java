package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Απλός υπολογιστής τσέπης που εμφανίζει μενού με
 * πρόσθεση, αφαίρεση, πολλαπλασιασμό, διαίρεση και mod, ο
 * χρήστης επιλέγει στη συνέχεια δίνει τις τιμές εισόδου
 * και λαμβάνει το αποτέλεσμα. Αυτό επαναλαμβάνεται μέχρι ο
 * χρήστης να επιλέξει έξοδο.
 */
public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choise =0;
        int result = 0;
        final int EXIT = 6;

        while(true){

            printMenu();
            choise = getOneInt();

            if(choise == EXIT){
                System.out.println("Έξοδος");
                break;
            }

            if(isChoiseValid(choise)){
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά");
                continue;
            }

            result = getResultOnChoise(choise);
        }
    }
    public static void printMenu(){
        System.out.println("Παρακαλώ επιλέξτε μία από τις παρακάτω επιλογές");

        System.out.println("1.Πρόσθεση");
        System.out.println("2.Αφαίρεση");
        System.out.println("3.Πολλαπλασιασμό");
        System.out.println("4.Διαίρεση");
        System.out.println("5.Mod");
        System.out.println("6.Έξοδος...");
    }

    public static int getOneInt(){
        return scanner.nextInt();

    }

    public static boolean isChoiseValid(int choise){
        return (choise>=1 && choise<=5); //το 6 έχει πιαστεί από τον έλεγχο πάνω από την κλήση
    }

    public static int getResultOnChoise(int choise) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Δώστε δύο ακεραίους: ");
        num1 = getOneInt();
        num2 = getOneInt();

        return switch (choise) {
            case 1 -> result = add(num1, num2);
            case 2 -> result = sub(num1, num2);
            case 3 -> result = mul(num1, num2);
            case 4 -> result = div(num1, num2);
            case 5 -> result = mod(num1, num2);
            default -> 0;
        };
    }
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static int sub(int num1,int num2){
        return num1-num2;
    }
    public static int mul(int num1,int num2){
        return num1*num2;
    }
    public static int div(int num1, int num2){return num2!=0 ? num1/num2 : 0;}
    public static int mod(int num1, int num2){return num2!=0 ? num1%num2 : 0;}

}
