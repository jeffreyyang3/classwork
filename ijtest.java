public class ijtest {
    public static void main(String[] args){















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


}