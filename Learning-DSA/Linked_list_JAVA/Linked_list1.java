//
//  Linked_list1.java
//  
//
//  Created by Shubham Jana on 19/07/26.
//

public class Linked_list1{
    private Node head;
    private int size;
    
    private class Node{
        private int value;
        private Node next;
        
        public Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    
    public void insertFirst(int val){
        Node MyNode = new Node(val);
        MyNode.next = head;
        head = MyNode;
        size++;
    }
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node MyTemp = head;
        while(MyTemp.next != null){
            MyTemp = MyTemp.next;
        }
        Node newNode = new Node(val);
        MyTemp.next = newNode;
        size++;
    }
    public Linked_list1(int[] numbers){
        if(numbers == null || numbers.length == 0){return;}
        head = new Node(numbers[0]);
        
        Node tail = head;
        
        for(int i = 1; i < numbers.length; i++){
            Node MyNewNode = new Node(numbers[i]);
            tail.next = MyNewNode;
            tail = MyNewNode;
            size++;
        }
    }
    public Linked_list1(){
        this.head = null;
        this.size = 0;
    }
    
    public void displayList(){
        Node theTemp = head;
        while(theTemp != null){
            System.out.print(theTemp.value + "->");
            theTemp = theTemp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args){
        int[] MyArray = {12,34,44,55,56,67,78,79};
        Linked_list1 MyList = new Linked_list1(MyArray);
        MyList.displayList();
    }
    
}
