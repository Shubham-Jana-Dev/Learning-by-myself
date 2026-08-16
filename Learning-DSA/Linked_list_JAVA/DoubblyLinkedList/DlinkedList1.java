public class DLinkedList{
	public static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data = data;
		}
	}
	
	public static void displayByHead(Node head){
		Node temp = head;
		System.out.print("null -> ");
		while(temp != null){
			System.out.print(temp.data+" <-> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public static void displayByTail(Node tail){
		Node temp = tail;
		//System.out.print("null -> ");
		if(temp.prev != null){
			temp = temp.prev;
			displayByTail(temp);
		}
		System.out.print(temp.data+" <-> ");
		//System.out.println("null");
	}
	
	public static void displayByHeadInReverse(Node head){
		Node temp = head;
		if(temp.next != null){
			temp = temp.next;
			displayByHeadInReverse(temp);	
		}	
		System.out.print(temp.data + " -> ");
	}
	
	public static void displayByAnyNode (Node anyNode){
		Node asHead = anyNode;
		while(asHead.prev != null){
			asHead = asHead.prev;
		}
		System.out.println();
		System.out.print("null <- ");
		while(asHead != null){
			System.out.print(asHead.data + " <-> ");
			asHead = asHead.next;
		}
		System.out.println("null");
			}
	
	public static void main(String[] args){
		Node a = new Node(10);
		Node b = new Node(20);
		Node c = new Node(30);
		Node d = new Node(40);
		Node e = new Node(50);
		Node f = new Node(60);
		Node g = new Node(70);
		Node h = new Node(100);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;
		
		
		h.prev = g;
		g.prev = f;
		f.prev = e;
		e.prev = d;
		d.prev = c;
		c.prev = b;
		b.prev = a;
		
		displayByHead(a);
		displayByTail(h);
		//displayByHeadInReverse(a);
		displayByAnyNode(f);
	}
}