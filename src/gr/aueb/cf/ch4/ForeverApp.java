package gr.aueb.cf.ch4;

public class ForeverApp {
    public static void main(String[] args) {
        int count = 0;
        final int MAX_COUNT= 100;

        for(;;){
            System.out.println("Forever");
            count++;

            if (count%10 ==0 ) System.out.println();
            if (count == MAX_COUNT){
                break;
            }
        }
    }
}
