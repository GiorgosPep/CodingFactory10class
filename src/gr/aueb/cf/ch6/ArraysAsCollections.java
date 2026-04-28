package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Οι βασικές πράξεις σε συλλογές στοιχείων είναι:
 * filtering,
 * mapping,
 * reducing
 */
public class ArraysAsCollections {
    public static void main(String[] args) {

    }

    public static int[] filterEven(int[] arr){
        if(arr == null || arr.length == 0 ) return new int[0];
        int [] arraytoReturn = new int[arr.length];
        int count = 0;

        for ( int element : arr){
            if(element%2 ==0){
                arraytoReturn[count ++] = element;
            }
        }
        return Arrays.copyOf(arraytoReturn, count);
    }


    public static int[] mapToDouble(int[] arr){
        if(arr == null || arr.length == 0) return new int[0];
        int[] mapped = new int[arr.length];

        for (int i = 0; i <arr.length; i++){
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static int sumArr(int[] arr){
        int sum = 0;

        if(arr == null || arr.length == 0) return 0;
        for (int i =0; i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double avg(int[] arr){
        int s = 0;

        s= sumArr(arr);
        return (double) arr.length !=0 ? s/arr.length : 0;
    }

    public static boolean anyEven(int[] arr){

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0) return true;
        }
        return false;
    }

    public static boolean isAllEven(int[] arr){

        if(arr == null || arr.length == 0) return false;

        for( int element : arr){
            if (element % 2 != 0) return false;
        }
        return true;
    }

    public static boolean isMoreThanTwoEven(int[] arr) {
        int countEven = 0;
//        if(arr == null || arr.length == 0) return false;
//
//        for( int i = 0; i < arr.length ; i++){
//            if(arr[i] % 2 == 0) countEven++;
//        }
//        return countEven > 2 ;

        for (int element : arr) {
            if (element % 2 == 0) countEven++;
            if (countEven > 2) return true; //early exit
        }
        return false;
    }
}
