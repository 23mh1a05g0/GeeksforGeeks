class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Character> map_1 = new HashMap<>();
        HashMap<Character,Character> map_2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(map_1.containsKey(c1)){
                if(map_1.get(c1)!=c2) return false;
            }
            else{
                map_1.put(c1,c2);
            }
            if(map_2.containsKey(c2)){
                if(map_2.get(c2)!=c1) return false;
            }
            else{
                map_2.put(c2,c1);
            }
        }
        return true;
    }
}