import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FinalPractice implements ActionListener {
    public static void main(String []args){
        //String[] arry = new String[]{"asdf", "gdhdf" , "eqweq","asdf", "dankman", "asdff"};
        //System.out.println(findIndex(arry, "dankman"));
        //System.out.println(fib(7));
        Container display = new Container();








    }
    public void actionPerformed(ActionEvent e){
        System.out.println("test");

    }
    static int findIndex(String[] ar, String s){
        for(int i = 0; i < ar.length; i++){
            if(ar[i].equals(s)){
                return i;
            }
        }
        return -1;

    }
    static int fib(int x){
        if(x <= 1){
            return x;
        }
        else{
            return fib(x-1) + fib(x-2);
        }


    }
    int sum(Node n){
        if(n == null){
            return 0;
        }
        else{
            return n.data + sum(n.next);
        }

    }
    int iterativesum(Node n){
        int sum = 0;
        while(n != null){
            sum += n.data;
            n = n.next;
        }
        return sum;
    }
    /*







*/
}
