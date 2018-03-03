//Jeffrey Yang
//1606512
//CMPS 12B
// 2/22/2018
//test for queue interface implementation

class QueueTest{
    
   public static void main(String[] args){
      Queue x = new Queue();
      x.enqueue((int)45);             
      x.enqueue((int)112230);
      x.enqueue((int)424);
      x.enqueue((int)888);
      System.out.println(x);          
      x.dequeue();
      System.out.println(x.peek());        
      x.dequeueAll();
      System.out.println(x.isEmpty()); 
    }
}
