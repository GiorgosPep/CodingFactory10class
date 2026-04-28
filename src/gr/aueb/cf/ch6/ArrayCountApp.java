package gr.aueb.cf.ch6;

/**
 * Μετράει το πλήθος των εμφανίσεων ενός ακεραίου σε έναν πίνακα ακεραίων
 */
public class ArrayCountApp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3,4,5};
        int count = 0;

        count = getCount(arr, 4);
        System.out.println("Count of 4 in the array: " + count);

    }


//    public static int getCount(int[] arr, int value) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == value) {
//                return i;
//            }
//        }
//    }
    public static int getCount(int[] arr, int value){
        if (arr==null) return-1;
        int count = 0;

        for (int element : arr){
            if(element == value) count ++;
        }
        return count;
    }
}

