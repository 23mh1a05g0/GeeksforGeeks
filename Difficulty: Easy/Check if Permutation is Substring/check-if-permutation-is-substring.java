class Solution {
    boolean search(String txt, String pat) {
        // Write your code here
        if(pat.length() > txt.length()) return false;
        
        int[] patcount = new int[26];
        int[] windowcount = new int[26];
        
        for(int i=0;i<pat.length();i++){
            patcount[pat.charAt(i)-'a']++;
        }
        
        int left = 0;
        for(int right = 0;right < txt.length();right++){
            windowcount[txt.charAt(right)-'a']++;
            
            if((right - left + 1) > pat.length()){
                windowcount[txt.charAt(left)-'a']--;
                left++;
            }
            
            if((right - left + 1) == pat.length()){
                if(Arrays.equals(patcount,windowcount)){
                    return true;
                }
            }
        }
        return false;
    }
}