/* A binary tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null){
            return ans;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
                Node temp = queue.poll();
                ans.add(temp.data);
                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
            }
        return ans;
    }
}