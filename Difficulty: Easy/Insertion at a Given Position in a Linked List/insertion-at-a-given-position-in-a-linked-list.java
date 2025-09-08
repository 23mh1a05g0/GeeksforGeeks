/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        // code here
        Node newnode = new Node(val);
        if(pos == 1){
            newnode.next = head;
            return newnode;
        }
        Node temp = head;
        int count = 1;
        while(temp!=null && count < pos-1){
            temp = temp.next;
            count++;
        }
        if(temp!=null){
            newnode.next= temp.next;
            temp.next = newnode;
            
        }
        return head;
    }
}