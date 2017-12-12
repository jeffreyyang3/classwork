public class ijtest {
    public static void main(String[] args){
        int[][] twoD = {{3,6,4,7}, {2,3}, {8,5,6}};
        int a = findHighest (twoD);
        int b = findSum(twoD);
        System.out.println(a + " " + b);
    }
    public static int findHighest(int[][] z){
        int highest = z[0][0];
        for(int i = 0; i < z.length; i++){
            for(int j = 0; j <z[i].length; j++){
                if(z[i][j] > highest){
                    highest = z[i][j];
                }
            }
        }
        return highest;
    }
    public static int findSum(int[][] z){
        int sum = 0;
        for(int i = 0; i < z.length; i++){
            for(int j = 0; j < z[i].length; j++){
                sum+= z[i][j];
            }
        }
        return sum;

    }
}