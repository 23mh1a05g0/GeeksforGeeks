/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummy = new Node(0);
        Node node = dummy;
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                node.next = head1;
                head1 = head1.next;
            }else{
                node.next = head2;
                head2 = head2.next;
            }
            node = node.next;
        }
        if(head1 != null){
            node.next = head1;
        }else{
            node.next = head2;
        }
        return dummy.next;
    }
}