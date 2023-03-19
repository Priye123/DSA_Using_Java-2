package linkedlist;

public class LinkedListFinal {

	// Node class
	static class Node {
		int data;
		Node next;// self

		public Node() {

		}

		public Node(int data) {
			this.data = data;
		}
	}

	static class LinkedList {
		Node head;// address of first node
		Node tail; // address of last node
		int size;// size of overall list

		public void addLast(int val) {
			// create a node
			Node temp = new Node();
			temp.data = val;
			temp.next = null;
			if (size == 0) { // this is the first node
				head = tail = temp;
			} else { // add in existing list
				tail.next = temp;
				tail = temp;
			}
			size++;
		}

		public void display() {

			if (size == 0) {
				System.out.println("List is Empty");
				return;
			}

			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

		public int size() {
			return size;
		}

		public void removeFirst() {
			if (size == 0) {
				System.out.println("Can't be removed because list is Empty");
				return;
			} else if (size == 1) {
				head = tail = null;
				size = 0;
			} else {
				head = head.next;
				size--;
			}
		}

		public int getFirst() {
			return head.data;
		}

		public int getLast() {
			return tail.data;
		}

		public int getAt(int idx) {
			if (idx == 0) {
				return getFirst();
			} else if (idx == size - 1) {
				return getLast();
			} else if (idx < 0 || idx >= size) {
				return -1;
			} else {
				Node temp = head;
				for (int i = 0; i < idx; i++) {
					temp = temp.next;
				}
				return temp.data;
			}
		}

		public void addFirst(int val) {
			if (size == 0) {
				addLast(val);
			} else {
				Node temp = new Node(val);
				temp.next = null;

				temp.next = head;
				head = temp;
				size++;
			}
		}

		public void addAt(int idx, int val) {
			if (idx == 0) {
				addFirst(val);
			} else if (idx == size - 1) {
				addLast(val);
			} else if (idx < 0 || idx >= size) {
				System.out.println("invalid index");
				return;
			} else {
				Node temp = new Node(val);
				temp.next = null;

				Node t = head;
				for (int i = 0; i < idx; i++) {
					t = t.next;
				}
				temp.next = t.next;
				t.next = temp;
				size++;
			}

		}

		private void removeLast() {
			if (size == 0) {
				System.out.println("Can't be removed because list is Empty");
				return;
			} else if (size == 1) {
				removeFirst();
			} else {
				Node temp = head;
				for (int i = 0; i < size - 2; i++) {
					temp = temp.next;
				}
				temp.next = null;
				tail = temp;
				size--;
			}
		}

		private void removeAt(int idx) {
			if (idx < 0 || idx >= size) {
				System.out.println("Invalid index");
				return;
			} else if (idx == 0) {
				head = head.next;
				size--;
			} else {
				Node temp = head;
				for (int i = 0; i < idx - 1; i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
				size--;
			}
		}

		public static void main(String[] args) {
			LinkedList l = new LinkedList();
			l.addLast(20);
			l.addLast(30);
			l.addLast(40);
			// System.out.println(l.size());
			// l.display();
			// l.removeFirst();
			// l.removeFirst();
			// l.display();
			// l.getFirst();
			// l.getLast();
			// System.out.println(l.getAt(1));
			l.addFirst(50);
			l.addFirst(60);
			// l.display();
			l.addAt(2, 70);
			l.addAt(0, 15);
			// l.display();
			// l.removeLast();
			// l.removeFirst();
			l.removeAt(4);
			l.display();
			System.out.println("-------------------------------");
			l.reverse();

		}

		private void reverse() {
			int l = 0, r = size - 1;

			while (l <= r) {
				Node left = getNodeAt(l);
				Node right = getNodeAt(r);

				int temp = left.data;
				left.data = right.data;
				right.data = temp;

				l++;
				r--;
			}

			Node t = head;
			while (t != null) {
				System.out.println(t.data + " ");
				t = t.next;
			}
		}
		
		public Node getNodeAt(int idx){
			Node temp=head;
			for(int i=0;i<idx;i++) {
				temp=temp.next;
			}
			return temp;
		}

//		private void merge2sortedList(LinkedList l1, LinkedList l2) {
//			int i = 0, j = 0;
//			Node n1 = l1.head, n2 = l2.head;
//			LinkedList merged = new LinkedList();
//
//			while (n1 != null && n2!= null) {
//				if (n1.data > n2.data) {
//					merged.addLast(n2.data);
//					n2 = n2.next;
//				} else {
//					merged.addLast(n1.data);
//					n1 = n1.next;
//				}
//			}
//
//			while (n1 != null) {
//				merged.addLast(n1.data);
//				n1 = n1.next;
//			}
//
//			while (n2 != null) {
//				merged.addLast(n2.data);
//				n2 = n2.next;
//			}
//			this.head=merged.head;
//
//		}
//
//		private int middleOfLinkedList() {
//			if (size % 2 != 0)
//				return getAt(size / 2);
//			else
//				return getAt(size / 2 - 1);
//		}
//
//		private int kthElementFromend(int k) {
//			return getAt(size - 1 - k);
//		}
//
//		private void reverse() {
//			int li = 0, ri = size - 1;
//
//			while (li <= ri) {
//				Node l = getNodeAt(li);
//				Node r = getNodeAt(ri);
//
//				int temp = l.data;
//				l.data = r.data;
//				r.data = temp;
//				li++;
//				ri--;
//			}
//			Node t = head;
//			while (t != null) {
//				System.out.print(t.data + " ");
//				t = t.next;
//			}
//			System.out.println("--------------------------");
//		}
//
//		public Node getNodeAt(int idx) {
//			Node temp = head;
//			for (int i = 0; i < idx; i++)
//				temp = temp.next;
//			return temp;
//		}

	}
}
