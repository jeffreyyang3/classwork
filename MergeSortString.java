//-----------------------------------------------------------------------------
// MergeSort.java
//-----------------------------------------------------------------------------

public class MergeSortString {

    // mergeSort()
    // sort subarray A[p...r]
    public static void MergeSortString(String[] A, int firstindex, int lastindex){
        int midpoint;
        if(firstindex < lastindex) {
            midpoint = (firstindex+lastindex)/2;
            MergeSortString(A, firstindex, midpoint);
            MergeSortString(A, midpoint+1, lastindex);
            merge(A, firstindex, midpoint, lastindex);
        }
    }

    // merge()
    // merges sorted subarrays A[p..q] and A[q+1..r]
    public static void merge(String[] A, int lowerindex, int midpoint, int upperindex){
        int n1 = midpoint-lowerindex+1;
        int n2 = upperindex-midpoint;
        String[] L = new String[n1];
        String[] R = new String[n2];
        int i, j, k;

        for(i=0; i<n1; i++){ //fills L with first half of A
            L[i] = A[lowerindex+i];
        }
        for(j=0; j<n2; j++){ //Fills R with second half of A
            R[j] = A[midpoint+j+1];
        }

        i = 0; j = 0;
        for(k=lowerindex; k<=upperindex; k++){ //iterate through/compare values in L and R
            if( i<n1 && j<n2 ){ //when not all values have been compared
                if( L[i].compareTo(R[j]) < 0 ){ // if left i is less than right j
                    A[k] = L[i]; // fill that index (k)  of A with the value from left array
                    i++;
                }
                else{ //if not, fill index k of A with the value from right array
                    A[k] = R[j];
                    j++; //increment(eliminate index)
                }
            }else if( i<n1 ){ //if one has finished, only one side will keep going
                A[k] = L[i];
                i++;
            }else{ // j<n2 if n1 has been exhausted
                A[k] = R[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {

        String[] B = {"asdf" , "cool", "aaaa", "b emoji", "bbbb", "zzz", "aaa"};

        MergeSortString(B, 0, B.length-1);
        for(int i=0; i<B.length; i++) {
            System.out.print(B[i] + " ");
            System.out.println();
        }
    }
}

