import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int[] arry = new int[]{2,3,5,1,3,5,69};
        System.out.println("test1");
        int max;
        int[] output = new int[arry.length];
        //reverseArray3(0, arry.length-1, arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
        System.out.println();
        System.out.println(maxArrayIndex(arry,0,arry.length-1));



    }


    private static void reverseArray1(int[] x, int[] y, int n) {

        if (n != 0) {
            y[n - 1] = x[x.length - n];
            reverseArray1(x, y, n - 1);
        }
    }

    private static void reverseArray2(int[] x, int[] y, int n) {
        if (n <= 0) {
            y[x.length - n] = x[n - 1];
            reverseArray2(x, y, n - 1);
        }

    }

    private static void reverseArray3(int i, int j, int[] x) {
        if(i >j){

        }
        else {
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            reverseArray3(i + 1, j - 1, x);
        }
    }

    private static int maxArrayIndex(int[] x, int p, int r) {




        if (p >= r) {
            return p;
        }
        else{
            int q = (p+r)/2;
            int lowerBound = maxArrayIndex(x,p,q);
            int upperBound = maxArrayIndex(x,q+1,r);
            if(x[lowerBound] > x[upperBound]){
                return lowerBound;
            }
            else{
                return upperBound;
            }
        }







    }












        /*int max = 0;
        int max1 = 0;
        int maxindex = 0;
        int maxindex1 = 0;
        int q = 0;

        if (p == r) {
            return 0;
        } else {
            q = p + (r - p)/2;
            maxArrayIndex(x, p, q);
            maxArrayIndex(x, q +1, r);
        }
        for(int i = p; i < q; i++){

            if(x[i] > max){
                max = x[i];
                maxindex = i;
            }
        }
        for(int j = q; j < r; j++){
            max = x[j];
            maxindex1 = j;
        }

        System.out.println("max left " + maxindex + "max right " + maxindex1);



        if(x[p] > x[q]){
            return p;
        }
        else{
            return q;
        }
*/











}
