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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        ArrayList<Integer> revNumbers = new ArrayList<>();
        while(head != null){
            myNumbers.add(head.val);
            head = head.next;
        }
        for(int j = myNumbers.size() - 1;j>=0;j--){
            revNumbers.add(myNumbers.get(j));
        }
        if(revNumbers.equals(myNumbers)){
            return true;
        }
        return false;
    }
}