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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if(head == null || head.next == null)return head;

        ListNode curr = head;

        while(curr != null && curr.next != null){
            int gcdValue = gcd(curr.val, curr.next.val);
            
            ListNode temp = new ListNode(gcdValue);
            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;
        }

        return head;
    }

    public static int gcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(b > 0 && a > 0){
            if(a > b) a = a%b;
            else b = b%a;
        }
        return a == 0 ? b : a;
    }
}