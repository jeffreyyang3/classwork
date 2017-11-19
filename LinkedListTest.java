/**
 * Created by JeffreyYang on 11/16/17.
 */
public class LinkedListTest {
    public static void main(String[] args){
        // the first item in the linked list
        LinkedList fibNums = new LinkedList();
        fibNums.push(1);
        fibNums.push(1);
        fibNums.push(2);
        fibNums.push(3);
        fibNums.push(5);
        fibNums.push(8);
        fibNums.push(13);
        fibNums.push(21);
        fibNums.push(34);
        fibNums.push(55);
        fibNums.push(89);
        fibNums.push(144);
        fibNums.pop();
        fibNums.insert(2,1232,fibNums.head);

        //fibNums.traverse(fibNums.head);



        System.out.println(fibNums.find(13, fibNums.head));



    }
}
