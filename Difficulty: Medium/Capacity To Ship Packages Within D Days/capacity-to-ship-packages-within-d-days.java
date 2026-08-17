class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int D) {
        // code here
        int left = 0;
        int right = 0;
        for(int weight : arr){
            left = Math.max(left,weight);
            right += weight;
        }
        
        while(left < right){
            int mid = left + (right - left) / 2;
            int currweight = 0;
            int daysUsed = 1;
            for(int weight : arr){
                if(currweight + weight <= mid){
                    currweight += weight;
                }else{
                    daysUsed++;
                    currweight = weight;
                }
            }
            if(daysUsed <= D){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}