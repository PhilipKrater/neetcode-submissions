class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> prove = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if (prove.contains(nums[i])){
                return true;
            }
            prove.add(nums[i]);
        }
        return false;
    }
}