/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)return null;

        insertNodeInBetween(head);
        connectRandomNode(head);
        
        return connectCopyNodes(head);
    }

    public Node insertNodeInBetween(Node head){
        Node temp = head;

        while(temp != null){
            Node copyNode = new Node(temp.val);

            copyNode.next = temp.next;
            temp.next = copyNode;

            temp = copyNode.next;
        }

        return head;
    }

    public Node connectRandomNode(Node head){
        Node temp = head;

        while(temp != null){
            Node copyNode = temp.next;

            if(temp.random != null){
                copyNode.random = temp.random.next;
            }

            temp = temp.next.next;
        }

        return head;
    }

    public Node connectCopyNodes(Node head){
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        Node temp = head;

        while(temp != null){
            Node copyNode = temp.next;
            
            res.next = copyNode;
            res = copyNode;

            temp.next = copyNode.next;
            temp = temp.next;
        }

        return dummyNode.next;
    }
}