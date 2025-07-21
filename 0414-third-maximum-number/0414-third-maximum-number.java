class Solution {
    public int thirdMax(int[] nums) {
        // Initialize three variables to track the maximum, second maximum, and third maximum.
        // Use Long.MIN_VALUE to correctly handle potential integer minimum values and negative numbers.
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        // Iterate through each number in the input array
        for (int num : nums) {
            // Case 1: Current number is the new maximum (distinct from max1)
            if (num > max1) {
                max3 = max2; // Old max2 becomes new max3
                max2 = max1; // Old max1 becomes new max2
                max1 = num;  // Current num is the new max1
            }
            // Case 2: Current number is between max1 and max2 (distinct from max2)
            else if (num > max2 && num != max1) {
                max3 = max2; // Old max2 becomes new max3
                max2 = num;  // Current num is the new max2
            }
            // Case 3: Current number is between max2 and max3 (distinct from max3)
            else if (num > max3 && num != max2 && num != max1) {
                max3 = num;  // Current num is the new max3
            }
        }

        // After iterating, check if max3 still holds its initial minimum value.
        // If true, it means there wasn't a distinct third maximum number.
        // In this case, the problem asks to return the maximum number.
        if (max3 == Long.MIN_VALUE) {
            return (int) max1; // Cast back to int as the return type is int
        } else {
            // Otherwise, max3 holds the distinct third maximum number.
            return (int) max3; // Cast back to int
        }
    }
}