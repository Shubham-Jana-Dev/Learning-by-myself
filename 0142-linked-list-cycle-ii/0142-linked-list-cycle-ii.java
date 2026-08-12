/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(fastPointer == slowPointer){
                break;
            }
        }
            
        if(fastPointer == slowPointer){
            fastPointer = head;
        while(fastPointer != slowPointer){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        return fastPointer;
        }
        return null;
    }
}