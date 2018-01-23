//-----------------------------------------------------------------------------
// BinarySearch.java
//-----------------------------------------------------------------------------

public class BinarySearch {

    // binarySearch()
    // pre: Array A[p..r] is sorted
    static int binarySearch(String[] A, int p, int r, String target){

        int q;

        if(p > r) {
            return -1;
        }
        else{
            q = (p+r)/2;
            if(target.compareTo(A[q]) == 0){
                return q;
            }
            else if(target.compareTo(A[q])<0){
                return binarySearch(A, p, q-1, target);
            }
            else{ // target > A[q]
                return binarySearch(A, q+1, r, target);
            }
        }
    }

    public static void main(String[] args) {

        String[] B = {"a" , "b" , "c", "d"};

        System.out.println(binarySearch(B, 0, B.length-1, "a"));

    }
}




