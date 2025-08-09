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
    public ListNode reverseList(ListNode head) {
        ListNode ptr = head;
        ListNode prev = null;

        while(ptr != null){
            ListNode temp = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = temp;
        }
        return prev;
    }
}