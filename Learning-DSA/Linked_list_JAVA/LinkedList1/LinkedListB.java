package LinkedList1;
public class LinkedListB{
	public int count = 0;
	public static class Node{
		int data; // value 
		Node next; // address of the next node
		Node(int data){
			this.data = data;
		}
	}
	public static int length(Node head){
		int count = 0;
		Node temp = head;
		while (temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	public static void recursiveLengthCount(Node head){
		Node temp = head;
		if(temp != null){
			System.out.println(temp.data);
			temp = temp.next;
			recursiveLengthCount(temp);
		}
	}
	public static int recursiveLength(Node head){
		if (head == null){ 
			return 0;
	}return 1 + recursiveLength(head.next);
	}
		public static void main(String[] args){
		Node a = new Node(5);
		Node b = new Node(7);
		Node c = new Node(6);
		Node d = new Node(56);
		Node e = new Node(80);
		// 5 -> 7 -> 6 -> 6 -> 56 -> 80
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		System.out.println(c.data);
		System.out.println(b.next.data); 
		Node temp = a;
		int listLength = 0;
		while(temp != null){
			System.out.println(temp.data);
			listLength ++;
			temp = temp.next;
		}
		LinkedListB obj1 = new LinkedListB();
		System.out.println("The length of the list is "+listLength);
		System.out.println("The length "+ obj1.length(a));
		System.out.println("The length by the recursive method "+ recursiveLength(a));

		 recursiveLengthCount(a);
		/*
		System.out.println(a);        // LinkedList1.LinkedListB$Node@7852e922
		System.out.println(a.next);   // LinkedList1.LinkedListB$Node@7852e922
		System.out.println(b);        // LinkedList1.LinkedListB$Node@7852e922
		System.out.println(c);        // LinkedList1.LinkedListB$Node@70dea4e
		*/
	}
}