// User function Template for Java

class Solution {
    int isPanagram(String S) {
        // code here
       S = S.toLowerCase();
       boolean[] seen = new boolean[26];
       for(int i=0;i<S.length();i++){
           char ch = S.charAt(i);
           if(Character.isLetter(ch)){
               int index = ch -'a';
               seen[index] = true;
           }
       }
       for(boolean present : seen){
           if(!present){
               return 0;
           }
       }
       return 1;
    }
}