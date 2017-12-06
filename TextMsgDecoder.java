package src;

/**
 * Created by JeffreyYang on 10/9/17.
 */
import java.util.Scanner;
public class TextMsgDecoder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scan.nextLine();
        System.out.println("You entered: " + text);
    }

}
