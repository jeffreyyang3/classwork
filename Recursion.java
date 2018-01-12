public class Recursion {


	public static void main(String[] args){
		int[] arry = new int[] {1,2,3,4,5};
	System.out.println("test1");
		int[] output = new int[5];
		reverseArray2(arry, output, 5);
		for(int i = 0; i < arry.length; i++){
			System.out.println(output[i]);
		}
		System.out.println();
		reverseArray3(0,4,arry);
		for(int i = 0; i < arry.length; i++){
			System.out.println(arry[i]);
		}

	}


	private static void reverseArray1(int[] x, int[]y, int n){

		if(n != 0){
			y[n - 1] = x[x.length - n];
			reverseArray1(x,y,n-1);
		}
	}
	private static void reverseArray2(int[] x, int[]y, int n){
		if(n != 0){
			y[x.length - n] = x[n-1];
			reverseArray2(x,y, n-1);
		}

	}
	private static void reverseArray3(int i, int j, int[]x){
		if(i != j){
			int temp = x[i];
			x[i] = x[j];
			x[j] = temp;
			reverseArray3(i+1,j-1,x);
		}
	}	
	private static int maxArrayIndex(int[] x, int p, int r){
		if(x.length == 1){
			return 0;
		}
		else{
			int q = (p+r)/2;
			maxArrayIndex(x,p,q);
			maxArrayIndex(x,q+1,r);

		}
		


	}


}
