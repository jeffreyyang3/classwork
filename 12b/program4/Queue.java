//Jeffrey Yang
//1606512
//CMPS 12B
// 2/22/2018
// Implements Queue interface for queue of objects
public class Queue implements QueueInterface {
    private Node head;
    private Node tail;
    int size = 0;
    private class Node{
        Node next;
        Object item;
        Node(Object item){
            this.item = item;
            next = null;
        }
    }
    public Queue copyQueue(){
        Queue copy = new Queue();

        Node curr = this.head;
        while (curr != null) {
            copy.enqueue(curr.item);
            curr = curr.next;
        }
        return copy;
    }
    public boolean isEmpty(){
        return(size == 0);
    }

    // length()
    // pre: none
    // post: returns the length of this Queue.
    public int length(){
        return size;
    }

    // enqueue()
    // adds newItem to back of this Queue
    // pre: none
    // post: !isEmpty()
    public void enqueue(Object newItem){
        if(size == 0){
            head = new Node(newItem);
            tail = head;
            size++;
        }
        else{
            tail.next = new Node(newItem);
            tail = tail.next;
            size++;
        }
    }

    // dequeue()
    // deletes and returns item from front of this Queue
    // pre: !isEmpty()
    // post: this Queue will have one fewer element
    public Object dequeue() throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException("queue empty");
        }
        else{
            Object x = head.item;
            head = head.next;
            size--;
            return x;
        }

    }

    // peek()
    // pre: !isEmpty()
    // post: returns item at front of Queue
    public Object peek() throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException("queue empty");
        }
        else{
            return head.item;
        }
    }

    public Object peekback() throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException("queue empty");
        }
        else{
            return tail.item;
        }
    }

    // dequeueAll()
    // sets this Queue to the empty state
    // pre: !isEmpty()
    // post: isEmpty()
    public void dequeueAll() throws QueueEmptyException{
        if(isEmpty()){
            throw new QueueEmptyException("queue empty");
        }
        else{
            head = null;
            size = 0;
        }
    }

    // toString()
    // overrides Object's toString() method
    public String toString(){
        String str = "";
        Node temp = head;
        while(temp != null){
            str += temp.item+" ";
            temp = temp.next;
        }

        return str;
    }



}
