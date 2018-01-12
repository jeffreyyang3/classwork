import java.util.Arrays;
//xx
public class Recursion {
    public static void main(String[] args) {
        int[] arry = new int[]{8,7,2,5,2,1};
        System.out.println("test1");
        int[] output = new int[arry.length];
        reverseArray2(arry, output, arry.length);
        for (int i = 0; i < arry.length; i++) {
            System.out.println(output[i]);
        }
        maxArrayIndex(arry,0,arry.length-1);
        System.out.println();
        for (int x : arry) {
            System.out.println(x);
        }

    }


    private static void reverseArray1(int[] x, int[] y, int n) {

        if (n != 0) {
            y[n - 1] = x[x.length - n];
            reverseArray1(x, y, n - 1);
        }
    }

    private static void reverseArray2(int[] x, int[] y, int n) {
        if (n != 0) {
            y[x.length - n] = x[n - 1];
            reverseArray2(x, y, n - 1);
        }

    }

    private static void reverseArray3(int i, int j, int[] x) {
        if (i != j) {
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            reverseArray3(i + 1, j - 1, x);
        }
    }

    private static void maxArrayIndex(int[] x, int p, int r) {
        int q = 0;
        if (p == r) {
            return;
        } else {
            q = p + (r - p)/2;
            maxArrayIndex(x, p, q);
            maxArrayIndex(x, q +1, r);

        }
        int n1 = q - p +1;
        int n2 = r - q;
        int i,j,k;
        int leftmax = 0;
        int rightmax = 0;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(i = 0; i < n1; i++){
            left[i] = x[p+i];
        }
        for(j = 0; j < n2; j++){
            right[j] = x[q+j+1];
        }
        i = 0;
        j = 0;

        for(k = p; k <= r; k++){
            if(i < n1 && j <n2){
                if(left[i] < right[j]){
                    x[k] = left[i];
                    rightmax = j;
                    i++;
                }
                else{
                    x[k] = right[j];
                    leftmax = i;
                    j++;
                }


            }
            else if(i<n1){
                x[k] = left[i];
                leftmax = i;
                i++;
            }
            else{
                x[k] = right[j];
                rightmax = j;
                j++;
            }


        }





    }



}
