//-----------------------------------------------------------------------------
// MergeSort.java
//-----------------------------------------------------------------------------

public class MergeSortString {

    // mergeSort()
    // sort subarray A[p...r]
    public static void MergeSortString(String[] A, int firstindex, int lastindex, int[] indexes){
        int midpoint;
        if(firstindex < lastindex) {
            midpoint = (firstindex+lastindex)/2;
            MergeSortString(A, firstindex, midpoint, indexes);
            MergeSortString(A, midpoint+1, lastindex, indexes);
            merge(A, firstindex, midpoint, lastindex, indexes);
        }
    }

    // merge()
    // merges sorted subarrays A[p..q] and A[q+1..r]
    public static void merge(String[] A, int lowerindex, int midpoint, int upperindex, int[] lines){
        int n1 = midpoint-lowerindex+1;
        int n2 = upperindex-midpoint;
        String[] L = new String[n1];
        int[] left = new int[n1];
        int[] right = new int[n2];
        String[] R = new String[n2];
        int i, j, k;

        for(i=0; i<n1; i++){ //fills L with first half of A
            L[i] = A[lowerindex+i];
            left[i] = lines[lowerindex+i];
        }
        for(j=0; j<n2; j++){ //Fills R with second half of A
            R[j] = A[midpoint+j+1];
            right[j] = lines[midpoint + j + 1];
        }

        i = 0; j = 0;
        for(k=lowerindex; k<=upperindex; k++){ //iterate through/compare values in L and R
            if( i<n1 && j<n2 ){ //when not all values have been compared
                if( L[i].compareTo(R[j]) < 0 ){ // if left i is less than right j
                    A[k] = L[i]; // fill that index (k)  of A with the value from left array
                    lines[k] = left[i];
                    i++;
                }
                else{ //if not, fill index k of A with the value from right array
                    A[k] = R[j];
                    lines[k] = right[j];
                    j++; //increment(eliminate index)
                }
            }
            else if( i<n1 ){ //if one has finished, only one side will keep going
                A[k] = L[i];
                lines[k] = left[i];
                i++;
            }
            else{ // j<n2 if n1 has been exhausted
                A[k] = R[j];
                lines[k] = right[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {


        String[] B = {"asdf" , "cool", "aaaa", "b emoji", "bbbb", "zzz", "aaa"};
        int[] numbers = new int[B.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        MergeSortString(B, 0, B.length-1, numbers);
        for(int i=0; i<B.length; i++) {
            System.out.print(B[i] + " ");
            System.out.println();
        }
        for(int i=0; i<B.length; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println();
        }
    }
}

