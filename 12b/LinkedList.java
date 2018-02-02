
public class LinkedList {
    Node head;
    private int size;
    private int count = 0;
    private int countsize;
    private int data;
    private int counter = 0;


    LinkedList(){
        this.head = null;
        this.size = 0;
        this.count = 0;
    }

    public void push(int i){
        Node temp = this.head;

        if (temp == null) {
            size++;
            this.head = new Node(i, null);
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }
        Node n = new Node(i, null);
        temp.next = n;
        size++;

    }
    public int pop(){
        int temp = head.data;
        head = head.next;
        size--;
        return temp;


    }
    public void insert(int n, int d, Node a){
        if(head == null){
            return;
        }

        if(a == head){
            count++;
        }


        Node temp = new Node(d, null);

        if(count != n) {
            count++;
            insert(n,d, a.next);
        }
        else {
            temp.next = a.next;
            a.next = temp;
            count = 0;
        }

    }
    /*public int find(int i, Node n){
        //System.out.println(n.data);
        if(i>size){
            return -1;
        }
        //System.out.println(size);
        count = 1;
        search(i, n);

        if(countsize == -1){
            return countsize;
        }
        else{
            return data;
        }



    }
    */

    public void search(int i, Node n){


        if (i != count){
            //System.out.println(count);

            count++;
            search(i , n.next);

        } else{
            //System.out.println(n.data);
            data = n.data;
        }

        /*if(count == i){
            System.out.println(n.data);
            data = n.data;
        }*/

    }
    public int find(int i, Node n){



        if(n == head){
            System.out.println("value at place " + i);
            counter = 1;
        }
        if(i > size){
            return -1;
        }
        if(counter == i){
            return n.data;
        }
        else{
            counter++;
            return(find(i, n.next));

        }

    }
    public void traverse(Node n){

        if(n != null){
            System.out.println(n.data);
            traverse(n.next);

        }
    }





}
