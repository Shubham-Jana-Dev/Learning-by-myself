public class MiddileNode{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public static void printMiddle(Node listHead){
		Node head = listHead;
		Node head2 = listHead;
		int count = 0;
		while(head != null){
			count++;
			head = head.next;
		}
		for(int i = 0; i < count/2; i++){
			System.out.print(head2.data+" -> ");
			head2 = head2.next;
					}
		System.out.println(count/2);
	}
	public static void displayLL(Node head){
		if(head == null)return;
		System.out.print(head.data+" -> ");
		displayLL(head.next);
	}
	public static Node insertEnd(Node head, int element){
		Node newTail = new Node(element);
		Node temp = head;
		if(head == null) return newTail;
		while(head.next != null){
			head = head.next;
		}
		head.next = newTail;
		return temp;
	}
	public static void main(String[] args){
		Node a = new Node(90);
		Node b = new Node(60);
		Node c = new Node(52);
		Node d = new Node(89);
		Node e = new Node(23);
		Node f = new Node(56);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		
		displayLL(a);
		System.out.println("\nThe half Linked list: ");
		printMiddle(a);
		insertEnd(a,564);
		System.out.println("After adding the element at the very end of the list: ");
		displayLL(a);
		
	}
}