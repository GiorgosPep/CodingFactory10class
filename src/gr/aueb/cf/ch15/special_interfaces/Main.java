package gr.aueb.cf.ch15.special_interfaces;

public class Main {
    public static void main(String[] args) {
        IProduct book = new Book();
        IProduct cd = new CompactDisk();

        deliver(book);
        deliver(cd);
    }

    public static void deliver (IProduct product){
        if (product instanceof Book){
            System.out.println("Delivering a book");
        } else if (product instanceof CompactDisk){
            System.out.println("Delivering a CD");
        }else {
            throw new IllegalArgumentException("Invalid product type.");
        }
    }
}
