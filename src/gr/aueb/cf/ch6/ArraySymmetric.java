package gr.aueb.cf.ch6;

public class ArraySymmetric  {
    public static void main(String[] args) {

    }

    public static boolean isArraySymmetric(int[] arr){

        for (int i = 0 , j = arr.length-1 ; i < j ; i++, j--){
            if (arr[i] != arr[j]) return false;
        }

        return true;
    }
}
