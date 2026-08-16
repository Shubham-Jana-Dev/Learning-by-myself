public class DLinkedList1{
	public static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data = data;
		}
	}
		public static void display(Node tail){
			Node temp = tail;
			if(temp == null){
				System.out.println("null");
				return;
			}
			System.out.print("null <- ");
			while (temp != null){
				System.out.print(temp.data + " <--> ");
				temp = temp.prev;
			}
			System.out.println("null");
		}
	
	public static void main(String[] args){
		Node a = new Node(4);
		Node b = new Node(10);
		Node c = new Node(2);
		Node d = new Node(99);
		Node e = new Node(13);
		
		e.prev = d;
		d.prev = c;
		c.prev = b;
		b.prev = a;
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		display(e);
	}
}