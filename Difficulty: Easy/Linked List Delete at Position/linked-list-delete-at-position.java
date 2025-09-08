// User function Template for Java

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Delete {
    Node deleteAtPosition(Node head, int pos) {
        // your code here
        if(pos ==1){
            return head.next;
        }
        Node temp = head;
        int count = 1;
        while(temp!=null && count < pos-1){
            temp = temp.next;
            count++;
        }
        if(temp!=null && temp.next!=null){
            temp.next = temp.next.next;
        }
        return head;
    }
}
