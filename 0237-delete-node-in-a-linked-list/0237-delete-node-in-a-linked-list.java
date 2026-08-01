/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // while(node.next != null){
        node.val = node.next.val;
        node.next = node.next.next;
        // node = node.next;
        
        // }
        // if(node)
    }
    // public ListNode delLast(ListNode node){
    //     ListNode temp = node;
    //     while(temp.next != null){
    //         temp = temp.next;
    //     }
    //     return temp;
    // }
}