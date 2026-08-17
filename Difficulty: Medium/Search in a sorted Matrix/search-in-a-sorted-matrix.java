class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int row = mat.length;
        int col = mat[0].length;
        int left = 0;
        int right = row * col -1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int r = mid / col;
            int c = mid % col;
            if(mat[r][c] > x){
                right = mid - 1;
            }else if(mat[r][c] < x){
                left = mid + 1;
            }else{
                return true;
            }
        }
        return false;
        
    }
}
