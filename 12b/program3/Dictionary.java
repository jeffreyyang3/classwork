public class Dictionary implements DictionaryInterface{
	private class Node{
		Node next;
		String key,value;
		Node(String key, String value){
			this.key = key;
			this.value = value;
			next = null;
		}
	}
	Node head;
	int items;
	public Dictionary(){
		head = null;
		items = 0

	}

	public boolean isEmpty(){
		return(items == 0);
	}

	public int size(){
		return items;
	}

	public String lookup(String key){
		Node temp = head;
		while(temp != null){
			if(temp.key == key){
				return temp.value;
			}
			temp = temp.next;
		}
	}
	public void insert(String key, String value){
		if(lookup(key) == null){
			return; // duplicate key exception
		}
		else{
			Node temp = head;
			while(temp != null){
				if(temp.next == null){
					temp.next = new Node(key,value);
					items++;
				}
			}
		}
	}
	public void delete(String key){
		if(lookup(key) != null){
			return; //duplicate key exception
		}
		else{
			Node temp = head;
			Node insert = new Node(key,value);
			while(!temp.next.key.equals(key)){
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
	public void makeEmpty(){
		head = null;
		items = 0;
	}
	public String toString(){
		Node temp = head;
		String str = "";
		while(temp != null){
			x += temp.key + " " + temp.value + "\n";
			temp = temp.next;

		}

	}


}