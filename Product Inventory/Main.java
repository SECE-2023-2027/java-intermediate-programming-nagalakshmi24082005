import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock Quantity: ");
        int stock = sc.nextInt();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        Product p = new Product(id, name, price, stock);

        p.applyDiscount(discount);

        System.out.println("\nPrice after discount: " + p.getPrice());
        System.out.println("Stock Quantity: " + p.getStockQuantity());

        sc.close();
    }
}