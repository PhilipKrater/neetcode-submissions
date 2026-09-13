class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> intMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int diff = target - nums[i];
            Integer index = intMap.get(diff);

            if(index != null){
                return new int[]{index, i};
            }

            else{
                intMap.put(nums[i],i);
            }
        }
        return new int [0];
    }
}
