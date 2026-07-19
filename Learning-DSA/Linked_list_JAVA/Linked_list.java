//
//  Linked_list.java
//  
//
//  Created by Shubham Jana on 18/07/26.
//
public class Linked_list{
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
    // A simple method to insert data at the beginning of the linked list
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
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
    
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is already empty.");
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("List is already empty.");
            return;
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node Dtemp = head;
        while(Dtemp.next.next != null){
            Dtemp = Dtemp.next;
        }
        Dtemp.next = null;
        size--;
    }
    public void displayList(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args){
        Linked_list Mylist = new Linked_list();
        
        Mylist.insertFirst(23);
        Mylist.insertFirst(90);
        Mylist.insertLast(56);
        
        System.out.println("Node created succesfully 😊");
        System.out.println("The size fo the linked list = " + Mylist.size);
        System.out.print("List contains ");
        Mylist.displayList();
        Mylist.deleteLast();
        Mylist.displayList();
    }
}
