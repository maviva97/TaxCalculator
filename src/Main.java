import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double 	price=300;
        double 	tax=1.2;
        int quantity=5;
        double total=0;
        String message="I want to buy "+ quantity+" shirt!";
        System.out.println(message);
  total= price*quantity*tax;
        System.out.println("Total cost with tax is: "  + total);
    }
}