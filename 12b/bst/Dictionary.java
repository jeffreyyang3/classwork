//-----------------------------------------------------------------------------
// DictionaryInterface.java
// interface for the Dictionary ADT
//-----------------------------------------------------------------------------

public class Dictionary implements DictionaryInterface{
    private class Node{
        String key;
        String value;
        Node left;
        Node right;

        // Node constructor
        Node(String key, String value){
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }
    }
    int numPairs;
    Node root;
    public Dictionary(){
      root = null;
      numPairs = 0;
    }


    // isEmpty()
    // pre: none
    // returns true if this Dictionary is empty, false otherwise
    public boolean isEmpty(){
        return(numPairs == 0);
    }

    // size()
    // pre: none
    // returns the number of entries in this Dictionary
    public int size(){
        return numPairs;
    }

    public Node findKey(Node R, String k){
        if(R == null || k.compareTo(R.key) == 0){
            return R;
        }
        if(k.compareTo(R.key) < 0){
            return findKey(R.left, k);
        } 
        else{
            return findKey(R.right, k);
        }
    }
    public Node findParent(Node N){
        Node P = null;
        if(N != root){
            P = root;
            while(P.left != N && P.right != N){
                if(N.key.compareTo(P.key) < 0){
                    P = P.left;
                }
                else{
                    P = P.right;
                }
            }

        }
        return P;
    }

    // lookup()
    // pre: none
    // returns value associated key, or null reference if no such key exists
    public String lookup(String key) {
        Node N;
        N = findKey(root, key);
        return (N == null ? null : N.value);
    }

    // insert()
    // inserts new (key,value) pair into this Dictionary
    // pre: lookup(key)==null
    public void insert(String key, String value) throws DuplicateKeyException{
        Node N, A, B;
        B = null;
        N = new Node(key,value);
        A = root;
        if(numPairs == 0){
            numPairs++;
            root = new Node(key,value);

        }
        while(A != null){
            B = A;
            if(key.compareTo(A.key) < 0){
                A = A.left;
            }
            else{
                A = A.right;
            }

        }
        if(B == null){
            root = N;
        }
        else if(key.compareTo(B.key) < 0){
            B.left = N;
            numPairs++;

        }
        else{
            B.right = N;
            numPairs++;
        }

    }

    // delete()
    // deletes pair with the given key
    // pre: lookup(key)!=null
    public void delete(String key) throws KeyNotFoundException{
        Node N,P,S;
        N = findKey(root, key);
        if(N.left == null && N.right == null){ // case 1 no children
            if(N == root){
                root = null;
            }
            else{
                P = findParent(N);
                if(P.right == N){
                    P.right = null;
                }
                else{
                    P.left = null;
                }
            }
        }
        else if(N.right == null){ // case 2 left but no right
            if(N == root){
                root = N.left;
            }
            else{
                P = findParent(N);
                if(P.right == N){
                    P.right = N.left;
                }
                else{
                    P.left = N.left;
                }
            }
        }
        else if(N.left == null){ //case 2 right but no left
            if(N == root){
                root = N.right;
            }
            else{
                P = findParent(N);
                if(P.right == N){
                    P.right = N.right;
                }
                else{
                    P.left = N.right;
                }
            }

        }
        else{ // case 3 two children
            S = findLeftmost(N.right);
            N.key = S.key;
            N.value = S.value;
            P = findParent(N);
            if(P.right == S){
                P.right = S.right;
            }
            else{
                P.left = S.right;
            }


        }
        numPairs--;

    }

    // makeEmpty()
    // pre: none
    public void makeEmpty(){
        numPairs = 0;
        root = null;
    }
    private Node findLeftmost(Node R){
      Node L = R;
      if(L != null) for( ; L.left != null; L = L.left) ;
      return L;
   }
   void printInOrder(Node R){
      if(R!=null){
         printInOrder(R.left);
         System.out.println(R.key + " " +R.value);
         printInOrder(R.right);
      }
   }

    // toString()
    // returns a String representation of this Dictionary
    // overrides Object's toString() method
    // pre: none
    public String toString(){
      String x = "";
      printInOrder(root);
      return x;
   }
}