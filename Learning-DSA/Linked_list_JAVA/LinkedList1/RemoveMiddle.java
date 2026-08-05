public class RemoveMiddle{
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	public static void display(Node head){
		while(head != null){
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println("null"); //🔥
	}
	
	//🔥🔥🔥🔥🔥🔥🔥
	public static Node removeMiddle(Node head){ //🪿
		Node temp = head;
		Node tempf = head;
		int length = 0;
		while(temp != null){
			temp = temp.next;
			length++;
		}
		Node temp2 = head;
		for(int i = 0;i < length/2; i++){
			temp2 = temp2.next;
		}
		Node temp3 = head;
		int count = 0;
		while(count<(length/2)){
			head = head.next;
			count++;
		}
		head.next = temp2.next.next;
		return tempf; 
	} // 🪿
	//🔥🔥🔥🔥🔥🔥🔥

	
	public static void main(String[] args){
		Node a = new Node(12);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		Node f = new Node(60);
		Node g = new Node(55);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		display(a);
		removeMiddle(a);
		display(removeMiddle(a));
	}
}