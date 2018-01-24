import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) throws IOException {


        String line;
        int count = 0;

        // check number of command line arguments is
        // open filesbn
        Scanner counter = new Scanner(new File(args[0]));
        Scanner in = new Scanner(new File(args[0]));
        while(counter.hasNextLine()){
            counter.nextLine();
            count++;
        }
        counter.close();
        int[] lines = new int[count];
        for(int i = 0; i < lines.length; i++){
            lines[i] = i+1;
        }
        String[] token = new String[lines.length];

        // read lines from in, extract and print tokens from each line
        for(int i = 0; i < lines.length; i++){
            token[i] = in.nextLine();
        }
        
        MergeSortString(token, 0, token.length - 1, lines);

        for(int i = 1; i < args.length; i++){
            int indx = binarySearch(token,0,token.length-1, args[i]);

            if(indx == -1){
                System.out.println(args[i] + " not found");
            }
            else{
                System.out.println(args[i] + " found on line " + lines[indx]);
            }


        }


        in.close();









    }
    public static void MergeSortString(String[] A, int firstindex, int lastindex, int[] indexes){
        int midpoint;
        if(firstindex < lastindex) {
            midpoint = (firstindex+lastindex)/2;
            MergeSortString(A, firstindex, midpoint, indexes);
            MergeSortString(A, midpoint+1, lastindex, indexes);
            merge(A, firstindex, midpoint, lastindex, indexes);
        }
    }
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


}
