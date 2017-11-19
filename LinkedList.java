
public class LinkedList {
    Node head;
    int size;
    int count = 0;

    LinkedList(){
        this.head = null;
        this.size = 0;
        this.count = 0;
    }



    public void push(int i){
        Node temp = head;

        if (temp == null) {
            head = new Node(i, null);
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }
        Node n = new Node(i, null);

        temp.next = n;
        size++;

    }
    public void pop(){
        head = head.next;
        size--;

    }
    public void insert(int n, int d, Node a){
        if(head == null){
            return;
        }

        if(a == head){
            count = 1;
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
    public int find(int i, Node n){

        if (n == head){
            count = 1;
        }

        if (i != n.data){
            count++;
            find(i , n.next);
        }
        if(n == null) {
            return -1;
        }
        else{
            return count - 1;
        }





    }
    public void traverse(Node n){

        if(n != null){
            System.out.println(n.data);
            traverse(n.next);
        }

    }


}
