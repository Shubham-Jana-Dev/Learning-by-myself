//
//  Access_element_Linked_list.java
//
//
//  Created by Shubham Jana on 19/07/26.
//
public class Access_element_Linked_list{
    private Node head;
    private int size;
    
    public Access_element_Linked_list(){
        this.head = null;
        this.size = 0;
    }
    public Access_element_linked_list(int[] array){
        if(array.elngth == 0 || arra){
            
        }
    }
    public class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = vlaue;
            this.next = null;
        }
    }
    public void insertFirst(int val){
        Node theNode = new Node(val);
        theNode.next = head;
        head = theNode;
        size++;
    }
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        size++;
    }
    public int get(int index){
        if(index < 0 || index >= size){
            System.out.println("Index out of bounds!");
            return -1;
        }
        Node temp = head;
        int count = 0;
        while(count < index){
            temp = temp.next;
            count++;
        }
        return temp.value;
    }
    public static void main(String[] args){
        int[] arr = {12,33,44,556,76,89};
        
    }
}
