//Jeffrey Yang
//1606512
//CMPS 12B
// 1/13/2018
// Recursive methods for reversing arrays and finding indices of maximum and minimum values in an array

//vscode test
public class Recursion {
    public static void main(String[] args){
        int[] A = {-1, 2, 6, 12, 9, 2,-5, -2, 8, 5, 7};
        int[] B = new int[A.length];
        int[] C = new int[A.length];
        int minIndex = minArrayIndex(A, 0, A.length - 1);
        int maxIndex = maxArrayIndex(A, 0, A.length - 1);
        for(int x: A) System.out.print(x+" ");
        System.out.println();
        System.out.println( "minIndex = " + minIndex );
        System.out.println( "maxIndex = " + maxIndex );
        reverseArray1(A, A.length, B);
        for(int x: B) System.out.print(x+" ");
        reverseArray2(A, A.length, C);
        System.out.println();
        for(int x: C) System.out.print(x+" ");
        System.out.println();
        reverseArray3(A, 0, A.length - 1);
        for(int x: A) System.out.print(x+" ");
        System.out.println();
    }


    private static void reverseArray1(int[] x, int n, int []y) { // copies left most n elements into rightmost n positions of output array in reverse order

        if (n != 0) {
            y[n - 1] = x[x.length - n];
            reverseArray1(x, n - 1, y);
        }
    }

    private static void reverseArray2(int[] x, int n, int[] y) { // reverseArray1 but copy order is done in reverse
        if (n != 0) {
            y[x.length - n] = x[n - 1];
            reverseArray2(x,n - 1,y);
        }

    }

    private static void reverseArray3(int[] x, int i, int j) { // reverses array by directly swapping the values in the array
        if(i >j){

        }
        else {
            int temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            reverseArray3(x, i + 1, j - 1);
        }
    }

    private static int maxArrayIndex(int[] x, int p, int r) { // uses procedure similar to the first part of mergesort to compare every value in the array

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
    private static int minArrayIndex(int[]x, int p, int r){ // same procedure as maxArrayIndex but seeks the lowest value instead of highest
        if(p >= r){
            return p;
        }
        else{
            int q = (p+r) / 2;
            int lowerBound = minArrayIndex(x,p,q);
            int upperBound = minArrayIndex(x,q+1,r);
            if (x[lowerBound] < x[upperBound]) {
                return lowerBound;
            }
            else{
                return upperBound;
            }
        }
    }













}
