import javax.swing.*;
import java.awt.*;

public class EmptyFrame {
    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j - 1] > arr[j]){
                    temp = arr[j - 1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}