// User function Template for Java

class Solution {

    public static long maximizeSum(long a[], int n, int k) {
        // Your code goes here
        Arrays.sort(a);
        int i=0;
        while(i<n && k>0 && a[i]<0){
            a[i] = -a[i];
            i++;
            k--;
        }
        Arrays.sort(a);
        if(k%2==1){
            a[0] = -a[0];
        }
        
        long sum = 0;
        for(long val : a){
            sum =sum+val;
        }
        return sum;
    }
}