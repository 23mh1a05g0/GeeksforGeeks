class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int row = grid.length;
        int col = grid[0].length;
        
        int islands = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 'L'){
                    islands++;
                    dfs(grid,i,j);
                }
            }
        }
        return islands;
    }
    
    int[] dr = {-1,-1,-1,0,0,1,1,1};
    int[] dc = {-1,0,1,-1,1,-1,0,1};
    
    
    private void dfs(char[][] grid,int row, int col){
        if(row < 0 || row >= grid.length ||
           col < 0 || col >= grid[0].length ||
           grid[row][col] == 'W'){
               return;
           }
           grid[row][col] = 'W';
           
           for(int i=0;i<8;i++){
               dfs(grid,row+dr[i],col+dc[i]);
           }
    }
}