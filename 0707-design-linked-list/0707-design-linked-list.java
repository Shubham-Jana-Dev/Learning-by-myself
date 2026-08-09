class MyLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    Node head = null;
    Node tail = null;
    int size = 0;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        Node temp = head;
        for(int j = 0; j < index; j++){
            if(temp.next == null){
                return temp.val;
            }
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        if(head == null){
            head = newHead;
            tail = newHead;
            size++;
            return;
        }
        size++;
        newHead.next = head;
        head = newHead;
        return;
    }
    
    public void addAtTail(int val) {
        Node newElement = new Node(val);
        Node temp = head;
        if(head == null){
            head = newElement;
            tail = newElement;
            size++;
            return;
        }
        tail.next = newElement;
        tail = newElement;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }

        Node newElement = new Node(val);
        Node temp = head;
        for(int j = 0; j < index - 1; j++){
            temp = temp.next;
        }
        newElement.next = temp.next;
        temp.next = newElement;
        size++;

    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }
        if(index == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
            size--;
            return;
        }
        Node temp = head;
        for(int j = 0; j < index - 1; j++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(temp.next == null){
            tail = temp;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */