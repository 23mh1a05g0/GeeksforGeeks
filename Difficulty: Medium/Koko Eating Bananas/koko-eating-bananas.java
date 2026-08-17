class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int left = 1;
        int right = 0;
        for(int pile : arr){
            right = Math.max(right,pile);
        }
        int ans = right;
        while(left <= right){
            int mid = left + (right - left) / 2;
            long hr = 0;
            for(int pile : arr){
                hr += (pile + mid - 1) / mid;
            }
            
            if(hr <=k){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
    
}
