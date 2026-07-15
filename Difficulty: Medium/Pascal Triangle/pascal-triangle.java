class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> row = new ArrayList<>();
        
        int val = 1;
        row.add(val);
        
        for(int k=1;k<n;k++){
            val = val * (n-k)/k;
            row.add(val);
        }
        return row;
    }
}