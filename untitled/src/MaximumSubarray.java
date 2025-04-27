class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
      //Time Complexity O(n) 
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentSum to either the current element itself or 
            // the current element added to the previous currentSum
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update maxSum to the maximum of itself or the new currentSum
            maxSum = Math.max(maxSum, currentSum);
        }
        
        // Return the maximum sum
        return maxSum;
    }
}
