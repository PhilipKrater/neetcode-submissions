class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] sCount = new int[26];
        int[] tCount = new int[26];
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for(char i : sChar){
            sCount[i-'a']++;
        } 

        for(char i : tChar){
            tCount[i-'a']++;
        }
        if(Arrays.equals(sCount, tCount)){
            return true;
        }
        return false;
    }
}
