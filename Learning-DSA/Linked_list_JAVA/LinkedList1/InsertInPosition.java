public class InsertInPosition{
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
		void display(){
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data+" -> ");
				temp = temp.next;
			}
			System.out.println("null");
	 	}
			
			void insertHead(int val){
				Node newNode = new Node(val);
				if(head == null){
					head = newNode;
					tail = newNode;
				}else if(head.next == null){
					newNode.next = head;
					tail = head;
					head = newNode;
				}else{
					newNode.next = head;
					head = newNode;
				}
			}
			void insertAtTail(int val){
				Node newElement = new Node(val);
				if(head == null){
					insertHead(val);
					return;
				}
				tail.next = newElement;
				tail = newElement;
			}
		void insertAt(int val,int index){
			Node temp = new Node(val);
			Node tempF = head;
			if(index == size()){
				insertAtTail(val);
				return;
			}else if(index == 0){
				insertHead(val);
				return;
			}else if(index < 0 || index > size()){
				System.out.println("Invalid Index :(");
				return;
			}
			for(int i = 1; i<= index-1; i++){ // 🔥 Here (index - 1) is very very importent because we are not traversal to the index we are traversing upto previous node of the index.
				tempF = tempF.next;
			}
			temp.next = tempF.next;
			tempF.next = temp;
			
		}
		
		public int get(int index) {
			if(index<0||index>=size()){
				System.out.println("Index out of bound! :(");
				return -1;
			}else if(index == 0){
				System.out.println("The element at "+index+" = "+head.data);
				return head.data;
			}
        Node temp = head;
        for(int i = 0; i<index;i++){
            temp = temp.next;
        }
        System.out.println("The element at "+index+" = "+temp.data);
        return temp.data;

    }
    
    public int size(){
    	Node temp = head;
    	int count = 0;
    	while(temp != null){
    		count++;
    		temp = temp.next;
    	}
    	return count;
    }
		}
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.insertHead(23);
		ll.insertHead(53);
		ll.insertHead(29);
		ll.insertHead(203);
		ll.insertHead(77);
		ll.insertHead(100);
		ll.insertAt(500,2);
	
		ll.display();
		ll.get(2);
		ll.get(3);
		ll.insertAtTail(400);
		ll.display();
		ll.insertAt(455,0);
		ll.display();
		ll.insertAt(405,9);
		ll.display();
		ll.insertAt(805,11);
		
		System.out.println(ll.size());
		System.out.println("Head: "+ll.head.data);
		System.out.println("Tail: "+ll.tail.data);
		ll.get(0);
		ll.get(7);


	}
}