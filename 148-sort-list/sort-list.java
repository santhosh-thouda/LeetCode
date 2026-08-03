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
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(second);

        return merge(l1, l2);
    }

    public ListNode merge(ListNode list1, ListNode list2){
        
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ptr.next = list1;
                list1 = list1.next;
            }
            else{
                ptr.next = list2;
                list2 = list2.next;
            }
            ptr = ptr.next;
        }

        if(list1 != null){
            ptr.next = list1;
        }

        if(list2 != null){
            ptr.next = list2;
        }

        return dummy.next;
    }
}