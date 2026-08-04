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
    public ListNode insertionSortList(ListNode head) {

        if(head == null || head.next == null)return head;
        
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode l1 = insertionSortList(head);
        ListNode l2 = insertionSortList(second);

        return merge(l1, l2);
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode ptr = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                ptr.next = l1;
                l1 = l1.next;
            }
            else{
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }

        while(l1 != null){
            ptr.next = l1;
            l1 = l1.next;
            ptr = ptr.next;
        }

        while(l2 != null){
            ptr.next = l2;
            l2 = l2.next;
            ptr = ptr.next;
        }

        return dummy.next;
    }
}