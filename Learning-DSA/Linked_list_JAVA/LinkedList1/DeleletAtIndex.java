public class DeleteAtIndex{
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
		int size = 0;
		void insertHead(int val){
			Node newHead = new Node(val);
			if(head == null){
				head = newHead;
				tail = newHead;
			}else{
				newHead.next = head;
				head = newHead;
			}
			size++;
		}
		void display(){
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
		void deleteAt(int index){
			if(index<0 || index>=size){
				System.out.println("Invalid Index. :(");
				return;
			}
			if(index == 0){
				head = head.next;
				if (head == null) {
        tail = null; // List is now completely empty
    }
				size--;
				return;
			}
			Node temp = head;
			if(index == size - 1){
				while(temp.next.next != null){
					temp = temp.next;
				}
				tail = temp;
				temp.next = null;
				size--;
				return;
			}
			for(int j = 0; j < index - 1; j++){
				temp = temp.next;
			}
			temp.next = temp.next.next;
			size--;		
		}
		
	}
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.insertHead(56);
		ll.insertHead(89);
		ll.display();
		ll.insertHead(78);
		ll.insertHead(12);
		ll.insertHead(67);
		ll.display();
		ll.deleteAt(3);
		ll.display();
		ll.deleteAt(4);
		ll.display();
	}
}