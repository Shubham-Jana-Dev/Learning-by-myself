/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node temp = head;
        while(temp != null){
            if(temp.child != null){
                Node childHead = temp.child;
                Node childTail = temp.child;
                while(childTail.next != null){
                childTail = childTail.next;
                }

                childTail.next = temp.next;
                if(temp.next != null){
                temp.next.prev = childTail; 
                }
                temp.next = childHead;
                childHead.prev = temp;

                temp.child = null;

                // temp.child.next = temp.next;
                // if(temp.next != null){
                // temp.next.prev = temp.child;
                // }
            }
            temp = temp.next; 
            
        }
        return head;
    }
}