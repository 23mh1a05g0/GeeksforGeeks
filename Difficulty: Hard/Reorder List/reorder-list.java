/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public void reorderList(Node head) {
        // code here
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node second = slow.next;
        Node prev = slow.next = null;
        while(second != null){
            Node temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
        
        Node first = head;
        second = prev;
        while(second != null){
            Node temp1 = first.next;
            Node temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}