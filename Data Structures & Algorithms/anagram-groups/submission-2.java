class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> myMap= new HashMap<>();
        
        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            myMap.putIfAbsent(sorted, new ArrayList<>());
            myMap.get(sorted).add(s);
        }
        return new ArrayList<>(myMap.values());
    }
}
