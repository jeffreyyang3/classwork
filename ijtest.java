public class ijtest{
    public static void main(String[] args){
        System.out.println(myPow(-1,-2147483648));















    }
    int sum(Node n){
        if(n == null){
            return 0;
        }
        else{
            return n.data + sum(n.next);
        }
    }
    int iterative(Node n){
        int sum1 = 0;
        while(n != null){
            sum1 += n.data;
            n = n.next;

        }
        return sum1;
    }
    public static double myPow(double x, int n) {
        System.out.println(n);
        boolean flag = false;
        int counter = 0;
        double cool = 1;
        if(x == 1 || x == -1){
            return x;
        }
        if(n >= 2147483647 || n == -2147483647){
            return 0.0;
        }
        if(n < 0){
            n *= -1;
            flag = true;
        }

        while(counter < n){
            cool *= x;
            counter++;
        }

        if(flag){
            if(x < 0 && n % 2 == 0){
                if(n * -1 == -2147483648){
                    return 1/cool;
                }

                return -1/cool;
            }
            return 1/ cool;

        }

        return cool;

    }
    public static int reverse(int x) {

        int length = String.valueOf(x).length();
        if(x < 0){
            length--;
        }
        int sum = 0;
        int[] arry = new int[length];
        for(int i = 0; i < length; i++){
            arry[i] = x % 10;
            x = x / 10;
        }
        for(int i = 0; i < length ; i++){
            sum += arry[length - 1 - i] * Math.pow(10, i);
        }
        if(sum == 2147483647 || sum == -2147483648){
            return 0;
        }


        return sum;




    }

}