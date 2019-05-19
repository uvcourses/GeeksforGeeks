package leet.code;

class Link { 
	int item;
	Link next;
	Link(int Data) {
		item=Data;
		next=null;
	}
}

public class LinkedList01 {

	Link head; 
	
	LinkedList01() {
		head=null;
	}
	
	void insertList(int item) {
		
		Link newNode=new Link(item);
		newNode.next=head;
		head=newNode;
		
	} 
	
	void print() { 
		Link current=head;
		
		while(current!=null) {
			System.out.println(current.item); 
			current=current.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList01 l=new LinkedList01(); 
		l.insertList(10);
		l.insertList(20);
		l.insertList(30);
		
		l.print();
	}

}
