class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        // Iterate through the array and mark the corresponding index as visited
        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]) - 1;  // Get the index corresponding to the number
            if (nums[num] > 0) {
                nums[num] = -nums[num];  // Negate the value at that index to mark it as visited
            }
        }
        
        // After processing, the positive numbers in the array correspond to the missing numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);  // Add the number (i+1) to the result list
            }
        }
        
        return result;
    }
}