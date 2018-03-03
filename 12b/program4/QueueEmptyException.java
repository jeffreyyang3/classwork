//Jeffrey Yang
//1606512
//CMPS 12B
// 2/22/2018
// custom exception for empty queue

public class QueueEmptyException extends RuntimeException {
    QueueEmptyException(String s){
        super(s);
    }
}
