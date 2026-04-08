package gr.aueb.cf.ch2;
/**
 * Εμφανίζει ΜΙΝ, ΜΑΧ και εύρος τιμών των
 * βασικών τύπων ακεραίων
 */
public class IntApp {
    public static void main(String[] args) {
        System.out.printf("INT, MIN = %d, MAX = %d, SIZE = %d \n", Integer.MIN_VALUE,Integer.MAX_VALUE, Integer.SIZE);
        System.out.printf("SHORT, MIN = %d, MAX = %d, SIZE = %d\n", Short.MIN_VALUE,Short.MAX_VALUE, Short.SIZE);
        System.out.printf("BYTE, MIN = %d, MAX = %d, SIZE = %d\n", Byte.MIN_VALUE,Byte.MAX_VALUE, Byte.SIZE);
        System.out.printf("LONG, MIN = %d, MAX = %d, SIZE = %d\n", Long.MIN_VALUE,Long.MAX_VALUE, Long.SIZE);
    }
}
