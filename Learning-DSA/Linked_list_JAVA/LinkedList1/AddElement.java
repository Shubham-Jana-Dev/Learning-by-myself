public class AddElement{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public static void displayLinkedList(Node head){
		if(head == null) return;
		System.out.println(head.data);
		displayLinkedList(head.next);
		
	}
	public static Node insertHead(Node head,int element){
		Node newHead = new Node(element);
		newHead.next = head;
		return newHead;
	}
	public static Node insertEnd(Node head, int element){
		if (head == null) {
        return newEnd;
    }
		Node newEnd = new Node(element);
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newEnd;
		return head;
	}
	public static void main(String[] args){
		Node a = new Node(23);
		Node b = new Node(56);
		Node c = new Node(89);
		Node d = new Node(25);
		
		a.next = b;
		b.next = c;
		c.next = d;
		displayLinkedList(a);
		Node a1 = insertHead(a,56);
		System.out.println("After adding 56 at the very first of the Linked list: ");
		displayLinkedList(a1);
		Node b1 = insertEnd(a1,87);
		System.out.println("After adding 87 at the very end of the Linked list: ");
		displayLinkedList(b1);
	}
}