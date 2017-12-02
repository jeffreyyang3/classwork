/**
 * Created by JeffreyYang on 11/6/17.
 */
import java.util.Scanner;
public class ShoppingCartPrinter {
    public static void main(String[] args){

        System.out.println("Item 1");
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the item name:");
        item1.setName(scan.nextLine());
        System.out.println("Enter the item price:");
        item1.setPrice(scan.nextInt());
        System.out.println("Enter the item quantity:");
        item1.setQuantity(scan.nextInt());
        System.out.println();
    

        Scanner why = new Scanner(System.in);
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        item2.setName(why.nextLine());
        System.out.println("Enter the item price:");
        item2.setPrice(why.nextInt());
        System.out.println("Enter the item quantity:");
        item2.setQuantity(why.nextInt());

        int item1total = (item1.getQuantity() * item1.getPrice());
        int item2total = (item2.getQuantity() * item2.getPrice());



        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1total);
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2total);
        System.out.println();
        System.out.println("Total: $" + (item1total + item2total));






    }
}
