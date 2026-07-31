class Solution {
    static String decToBinary(int n) {
        // code here
        String binary = "";
        while(n != 0){
            binary = (n & 1) + binary;
            n = n >> 1;
        }
        return binary;
    }
}