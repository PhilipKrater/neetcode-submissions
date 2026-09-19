class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> words = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] stringAtI = strs[i].toCharArray();
            Arrays.sort(stringAtI);
            String finished = new String(stringAtI);
            words.putIfAbsent(finished, new ArrayList<>());
            words.get(finished).add(strs[i]);
        }
        return new ArrayList<>(words.values());
    }
}
