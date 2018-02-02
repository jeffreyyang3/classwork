

import java.util.Scanner;

public class AuthoringAssistant {
    Scanner scan;

    public static void main(String[] args) {
        double x1 = 1;
        double x2 = 0;
        double y1 = 1;
        double y2 = 0;
        double one = (x1 - x2) * (x1 - x2);
        double two = (y1- y2) * (x1-x2);
        double height = Math.sqrt(one + two);


        System.out.print(height);
        }


    }
