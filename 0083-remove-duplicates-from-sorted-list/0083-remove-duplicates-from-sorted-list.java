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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        while(temp != null){
            if(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            }
            temp = temp.next;
        }

        ListNode temp2 = head;
        while(temp2 != null){
        if(temp2.next != null){
        if(temp2.val == temp2.next.val){
        deleteDuplicates(head);
        }}
        temp2 = temp2.next;
        }
            return head;
    }
}