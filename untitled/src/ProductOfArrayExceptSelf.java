//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except
//nums[i].

//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.


public class ProductOfArrayExceptSelf{
    // Time complexity of this solution is O(n) 
    
    public static int[] productExceptSelf(int[] nums) {
        

        int n = nums.length;
        
        // Initialize an array 'left' to store the product of all elements to the left of each index
        int[] left = new int[n];
        left[0] = 1;  // The product of elements to the left of index 0 is 1 (nothing on the left)
        
        // Fill the 'left' array where each element is the product of all elements before that index
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];  // Current left[i] = left[i-1] * nums[i-1]
        }
        
        // Initialize an array 'right' to store the product of all elements to the right of each index
        int[] right = new int[n];
        right[n - 1] = 1;  // The product of elements to the right of the last index is 1 (nothing on the right)
        
        // Fill the 'right' array where each element is the product of all elements after that index
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];  // Current right[i] = right[i+1] * nums[i+1]
        }
        
        int[] ans = new int[n];
        
        // Multiply the corresponding elements from the 'left' and 'right' arrays to get the final result
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];  
        }
    
        return ans;
    }
    
    public static void main(String[] args) {
        
       
        int[] nums = {1, 2, 3, 4};

        System.out.println(java.util.Arrays.toString(productExceptSelf(nums)));
    }
}
