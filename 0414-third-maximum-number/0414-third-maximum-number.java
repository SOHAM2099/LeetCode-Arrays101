class Solution {
    //SOHAM2099
    public int thirdMax(int[] nums) {
         Set<Integer> uniqueNums = new HashSet<>();
        
        // Add all numbers to the set
        for (int num : nums) {
            uniqueNums.add(num);
        }
        
        // If there are less than 3 unique numbers, return the maximum
        if (uniqueNums.size() < 3) {
            return Collections.max(uniqueNums);
        }
        
        // Remove the largest number
        uniqueNums.remove(Collections.max(uniqueNums));
        
        // Remove the second largest number
        uniqueNums.remove(Collections.max(uniqueNums));
        
        // Return the third largest number
        return Collections.max(uniqueNums);
    }
}