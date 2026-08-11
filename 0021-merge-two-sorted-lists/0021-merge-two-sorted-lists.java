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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list2 == null && list1 != null) {
            return list1;
        } else if (list2 != null && list1 == null) {
            return list2;
        }
        ListNode resultList = new ListNode(101);
        ListNode currentList = resultList;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentList.next = list1;
                list1 = list1.next;
            } else {
                currentList.next = list2;
                list2 = list2.next;
            }

            currentList = currentList.next;
        }
        if (list1 != null)
            currentList.next = list1;
        if (list2 != null)
            currentList.next = list2;
        return resultList.next;
    }
}