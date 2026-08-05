public class LinkedListMethods{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	
	public static class LinkedList{
		Node head = null;
		Node tail = null;
		
		// Display the whole Linked List
		void displayLinkedList(){
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
		
		// Insert Element at the very end of the Linked List
		void insertEnd(int value){
			Node temp = new Node(value);
			if(head == null){
				head = temp;
			}else{
				tail.next = temp;
			}
			tail = temp;
		}
		
		// Delete an element from the very end of the Linked List
		void deleteEnd(){
			if(head == null)return;
			if(head.next == null){
				head = null;
				tail = null;
			}else{
				Node temp = head;
				while(temp.next != tail){
					temp = temp.next;
				}
				temp.next = null;	
				tail = temp;
			}
		}
		
		
		// Inset element at the bigening of the Linked List
		void insertFront(int val){
			Node newHead = new Node(val);
			if(head == null){
				head = tail = newHead;
			}else{
				newHead.next = head;
				head = newHead;
			}
		}
	}
	
	public static void main(String[] args){
		
		LinkedList ll1 = new LinkedList();
		ll1.insertEnd(33);
		ll1.displayLinkedList();
		ll1.insertEnd(32);
		ll1.displayLinkedList();
		ll1.insertEnd(34);
		ll1.displayLinkedList();
		ll1.insertFront(55);
		ll1.displayLinkedList();
		ll1.deleteEnd();
		ll1.displayLinkedList();
		ll1.deleteEnd();
		ll1.displayLinkedList();
		ll1.deleteEnd();
		ll1.displayLinkedList();
		


		
		Node a = new Node(30);
		Node b = new Node(40);
		Node c = new Node(50);
		Node d = new Node(60);
		Node e = new Node(45);
		Node f = new Node(50);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		// displayLinkedList(a);
		
	}
}