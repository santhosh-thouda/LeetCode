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
        
        Stack <Integer> stk = new Stack<>();

        ListNode ptr = head;
        while(ptr != null){
            stk.push(ptr.val);
            ptr = ptr.next;
        }

        ptr = head;
        while(ptr != null){
            ptr.val = stk.pop();
            ptr = ptr.next;
        }
        return head;
    }
}