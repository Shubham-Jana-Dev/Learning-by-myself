class MyLinkedList {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public MyLinkedList() {}

    Node head = null;
    Node tail = null;
    int size = 0;

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        if (head == null) {
            head = newHead;
            tail = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newTail = new Node(val);
        if (head == null) {
            head = newTail;
            tail = newTail;
        } else {
            tail.next = newTail;
            tail = newTail;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        Node newElement = new Node(val);
        Node temp = head;
        for (int j = 0; j < index - 1; j++) {
            temp = temp.next;
        }
        
        newElement.next = temp.next;
        temp.next = newElement;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return;
        }
        
        Node temp = head;
        for (int k = 0; k < index - 1; k++) {
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        if (temp.next == null) {
            tail = temp;
        }
        
        size--;
    }
}