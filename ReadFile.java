/**
 * Created by JeffreyYang on 10/30/17.
 */
import java.io.*;
import java.util.Scanner;
public class ReadFile {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double[] rainfall = populateArray();
        System.out.println("Choose an option");
        System.out.println("highest to find the year with the highest rainfall, lowest to find the year with the lowest rainfall, average for average rainfall and quit to quit");

        while(true) {
            String input = scan.nextLine();
            if(input.equals("quit")) {
                return;
            }
            if(input.equals("highest")) {
                System.out.println(findHighestYearIndex(rainfall));
                return;
            }
            if(input.equals("lowest")) {
                System.out.println(findLowestYearIndex(rainfall));
                return;
            }
            if(input.equals("average")) {
                System.out.println(findAverage(rainfall));
            }
            else{
            System.out.println("Enter a valid input");
            System.out.println("highest to find the year with the highest rainfall, lowest to find the year with the lowest rainfall, average for average rainfall and quit to quit");


        }


    }
    }
    public static double[]populateArray() {
        int count = 0;
        double[] data = new double[168];
        try { //idea taken from ReadFile.java on the class site
            File f = new File("/Users/JeffreyYang/IdeaProjects/untitled1/src/rainfall.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextDouble()) {
                data[count] = sc.nextDouble();
                count++;
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return data;

    }
    public static int findHighestYearIndex(double[] data) {
        double max = 0;
        int j;
        int maxindex = 0;
        for (j = 0; j < data.length; j++) {


            if (data[j] > max) {
                max = data[j];
                maxindex = j;

            }
        }
        return 1849 + maxindex;
    }
    public static int findLowestYearIndex(double[] data){
        double min = 5000;
        int j;
        int minindex = 5000;
        for (j = 0; j < data.length; j++) {


            if (data[j] < min) {
                min = data[j];
                minindex = j;

            }
        }
        return 1849 + minindex;

    }
    public static double findAverage(double[] data){
        double sum = 0;
        for (int i = 0; i < data.length; i++){
            sum += data[i];

        }
        return sum / data.length;
    }
}


