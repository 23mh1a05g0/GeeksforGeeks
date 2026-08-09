class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-3;i++){
            for(int j = i+1;j<arr.length-2;j++){
                if(i > 0 && arr[i] == arr[i-1]) continue;
                if(j > i + 1 && arr[j] == arr[j-1]) continue;
                int left = j+1;
                int right = arr.length-1;
                while(left < right){
                    long sum = (long) arr[i] + arr[j] +
                                      arr[left] + arr[right];
                    if(sum < target) left++;
                    else if(sum > target) right--;
                    else{
                        res.add(new ArrayList<>(Arrays.asList(
    arr[i],
    arr[j],
    arr[left],
    arr[right]
)));
                            left++;
                            right--;
                        while(left < right && arr[left] == arr[left-1]) left++;
                        while(left < right && arr[right] == arr[right + 1]) right--;
                    }
                }
            }
        }
        return res;
    }
}