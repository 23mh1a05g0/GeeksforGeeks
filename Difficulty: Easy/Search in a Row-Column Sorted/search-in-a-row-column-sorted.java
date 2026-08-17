class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // code here
        int row = mat.length;
        int col = mat[0].length;
        int r = 0;
        int c = col - 1;
        while(r < row & c >= 0){
            if(mat[r][c] > x){
                c--;
            }else if(mat[r][c] < x){
                r++;
            }else{
                return true;
            }
        }
        return false;
        
    }
}