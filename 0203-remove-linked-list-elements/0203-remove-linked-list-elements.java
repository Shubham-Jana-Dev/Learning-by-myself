/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        ListNode temp = head;
        if (temp.val == val && temp.next == null) {
            return null;
        }
        if (temp.val != val && temp.next == null) {
            return head;
        }
        while (temp != null) {
        while (temp != null && temp.val == val) {
            head = head.next;
            temp = head;
        }
        if(temp == null){
            return null;
        }while (temp != null) {
    if (temp.next != null && temp.next.val == val) {
        temp.next = temp.next.next; // Snip it! But don't move temp yet.
    } else {
        temp = temp.next; // Only move forward if we didn't delete anything.
    }
}
            
        }
        return head;
    }
}