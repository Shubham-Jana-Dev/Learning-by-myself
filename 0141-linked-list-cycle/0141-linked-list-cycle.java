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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode runPointer = head.next;
        ListNode fixedPointer = head;
        // boolean result = true;
        while(runPointer != null && runPointer.next != null){
            if(runPointer == fixedPointer){
                return true;
            }
            runPointer = runPointer.next.next;
            fixedPointer = fixedPointer.next;
        }
        return false;

    }
}