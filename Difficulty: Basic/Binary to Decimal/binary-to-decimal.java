class Solution {
    public int binaryToDecimal(String b) {
        // code here
        int dec = 0;
        for(int i=0;i<b.length();i++){
            int bit = b.charAt(i) - '0';
            dec = dec * 2 + bit;
        }
        return dec;
        
    }
}