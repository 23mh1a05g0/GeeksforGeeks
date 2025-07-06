// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                arr1.add(arr.get(i));
            }
            else{
                arr2.add(arr.get(i));
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        int P = 0 , N = 0;
        while(P < arr1.size() && N < arr2.size()){
            result.add(arr1.get(P++));
            result.add(arr2.get(N++));
        }
        
        while(P < arr1.size()){
            result.add(arr1.get(P++));
        }
        while(N < arr2.size()){
            result.add(arr2.get(N++));
        }
        
        arr.clear();
        arr.addAll(result);
    }
}