class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> prove = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if (prove.containsValue(nums[i])){
                return true;
            }
            prove.put(nums[i] , nums[i]);
        }
        return false;
    }
}