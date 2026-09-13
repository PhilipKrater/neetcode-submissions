class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> marked = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(marked.containsKey(target-nums[i])){
                return new int[]{marked.get(target-nums[i]),i};
            }
            else{
                marked.put(nums[i],i);
            }
        
       } 
       return new int[]{0,0};
    }
}
