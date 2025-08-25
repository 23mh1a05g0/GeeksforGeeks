class Solution {
    public static boolean checkPangram(String s) {
        // code here
        s = s.toLowerCase();
        boolean[] seen = new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                int index = ch - 'a';
                seen[index] = true;
            }
        }
        for(boolean present : seen){
            if(!present){
                return false;
            }
        }
        return true;
    }
}