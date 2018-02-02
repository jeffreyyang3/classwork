public class practice{
	public static void main(String[] args){
		int[] arry = new int[]{2,3,4,1,2,3,4};
		int[] sorted = new int[]{1,2,3,4,5,6,7};
		System.out.println("asdf" + search(sorted,0,sorted.length-1, 3));
	}
	public static int sum(int n){
		if(n == 1){
			return n;
		}
		else{
			return n + sum(n-1);
		}	
	}
	public static int sum2(int one, int two){
		if(one > two){
			return 0;
		}
		if(one == two){
			return one;
		}
		else{
			return one + two + sum2(one+1, two-1);
		}

	}
	public static int sumArray(int[] a, int n){
		if(n == a.length-1){
			return a[n];
		}
		else{
			return a[n] + sumArray(a, n + 1);
		}
	}
	public static int sumArray2(int[] a, int lower, int upper){
		int q = (lower + upper) / 2;

		if(lower > upper){
			return 0;
		}
		if(lower == upper){
			return a[lower];
		}
		else{
			return sumArray2(a, lower, q) + sumArray2(a, q+1, upper);
		}
	}
	public static int search(int[] a, int lower, int upper, int target){

		int q = (lower+upper) / 2;
		System.out.println(q);
		if(a[q] == target){
			return q;
		}
		if(a[q] > target){
			return search(a, lower, q, target);
		}
		else{
			return search(a, q+ 1, upper, target);
		}

	}




	 
 
}
