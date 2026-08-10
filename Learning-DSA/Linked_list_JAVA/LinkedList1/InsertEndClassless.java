public class InsertEndClassless{
	public static class Node{
		int data;
		Node next;
		Node (int data){
			this.data = data;
		}
	}
	public static void display(Node head){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public static Node insertEnd(Node head, int val){
		Node newTail = new Node(val);
		if(head == null){
			return newTail;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newTail;
		return head;
	}
	public static void main(String[] args){
		Node a = new Node(23);
		Node b = new Node(20);
		Node c = new Node(55);
		Node d = new Node(90);
		Node e = new Node(70);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		display(a);
		insertEnd(a,56);
		display(a);
				
	}
}