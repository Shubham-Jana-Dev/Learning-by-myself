public class RevercePrint{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
		public static void reverceDisplay(Node head){
			if(head == null)return;
			reverceDisplay(head.next);
			System.out.print(" <- "+head.data);
	}
	public static void main(String[] args){
		Node a = new Node(12);
		Node b = new Node(33);
		Node c = new Node(89);
		Node d = new Node(44);
		Node e = new Node(56);
		Node f = new Node(77);
		Node g = new Node(90);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		
		System.out.print("null");
		reverceDisplay(a);
	}
}