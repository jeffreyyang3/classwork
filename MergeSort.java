//-----------------------------------------------------------------------------
// MergeSort.java
//-----------------------------------------------------------------------------

public class MergeSort {

   // mergeSort()
   // sort subarray A[p...r]
   public static void mergeSort(int[] A, int firstindex, int lastindex){
      int midpoint;
      if(firstindex < lastindex) {
         midpoint = (firstindex+lastindex)/2;
         System.out.println(firstindex+" "+ midpoint +" "+lastindex);
         mergeSort(A, firstindex, midpoint);
         mergeSort(A, midpoint+1, lastindex);
         merge(A, firstindex, midpoint, lastindex);
      }
   }

   // merge()
   // merges sorted subarrays A[p..q] and A[q+1..r]
   public static void merge(int[] A, int lowerindex, int midpoint, int upperindex){
      int n1 = midpoint-lowerindex+1;
      int n2 = upperindex-midpoint;
      int[] L = new int[n1];
      int[] R = new int[n2];
      int i, j, k;

      for(i=0; i<n1; i++){
         L[i] = A[lowerindex+i];
      }
      for(j=0; j<n2; j++){ 
         R[j] = A[midpoint+j+1];
      }

      i = 0; j = 0;
      for(k=lowerindex; k<=upperindex; k++){
         if( i<n1 && j<n2 ){
            if( L[i]<R[j] ){
               A[k] = L[i];
               i++;
            }else{
               A[k] = R[j];
               j++;
            }
         }else if( i<n1 ){
            A[k] = L[i];
            i++;
         }else{ // j<n2
            A[k] = R[j];
            j++;
         }
      }
   }

   public static void main(String[] args) {

      int[] B = {9,8,7,6,5,4,3,2,1};

      mergeSort(B, 0, B.length-1);
      for(int i=0; i<B.length; i++) 
         System.out.print(B[i]+" ");
      System.out.println();
   }
}
