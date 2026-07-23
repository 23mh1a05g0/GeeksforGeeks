class Solution {
    public ArrayList<Integer> largestValues(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node temp = queue.poll();
                level.add(temp.data);
                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
            }
            ans.add(Collections.max(level));
        }
        return ans;
    }
}