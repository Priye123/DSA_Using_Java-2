package linkedlist;

public class LinkedListFinal {

	// node :- self data + address of next node
	static class Node {
		int data;
		Node next; // self-reference node
	}

	static class LinkedList {
		Node head;
		Node tail;
		int size=0;
	}

	public static void main(String[] args) {
		addLast();
	}

	private static void addLast() {
		Node n=new Node();//next 
		n.data=10;
		n.next=null;
		
		LinkedList l=new LinkedList();
		l.head=n;
		l.tail=null;
		(l.size)++;
	}

}
