class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int[] counts = new int[max - min + 1];
        for (int num : nums) {
            counts[num - min]++;
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                int freq = counts[i];
                if (bucket[freq] == null) {
                    bucket[freq] = new ArrayList<>();
                }
                bucket[freq].add(i + min);
            }
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index++] = num;
                    if (index == k) break;
                }
            }
        }
        return result;
    }
}