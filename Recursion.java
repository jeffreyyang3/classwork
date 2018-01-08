public class Recursion {

    public static void main(String[] args){
        int[] arry = new int[] {1,2,3,4,5};
        int[] output = new int[5];
        reverseArray1(arry, output, 5);
        for(int i = 0; i < arry.length; i++){
            System.out.println(output[i]);
        }
    }


    private static void reverseArray1(int[] x, int[]y, int n){

        if(n != 0){
            y[n - 1] = x[x.length - n];
            reverseArray1(x,y,n-1);
        }
    }



}
