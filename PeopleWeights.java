
/**
 * Created by JeffreyYang on 10/22/17.
 */
import java.util.*;
import java.util.Arrays;
public class PeopleWeights {
    public static void main(String[] args) {
        final int size = 5;
        double sum = 0;
        double max = 0;
        double[] weights = new double[size];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Enter weight " + (i + 1) + ":");
            double input = scan.nextDouble();
            weights[i] = input;

        }
        System.out.print("You entered: ");
        for (int i = 0; i < 5; i++){
            System.out.print(weights[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++){
            sum += weights[i];

        }
        System.out.println();
        System.out.println("Total weight: " + sum);
        System.out.println("Average weight: " + (sum / 5));
        for (int j = 0; j < weights.length; j++) {


            if (weights[j] > max) {
                max = weights[j];
            }
        }
        System.out.println("Max weight: " + max);



    }
}
