import java.util.Arrays;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Issues shop = new Issues();
        System.out.println(shop.message);
        shop.total= shop.price*shop.quantity*shop.tax;
        System.out.println("Total cost with tax is: "  + shop.total);
    }
}