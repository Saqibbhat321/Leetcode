public class JumpGame2 {


        // Method to find the minimum number of jumps to reach the last index
        public static int  jump(int[] nums) {
            // Initialize jumps to count the number of jumps required
            int jumps = 0;
            // Initialize currentEnd to keep track of the end of the current jump range
            int currentEnd = 0;
            // Initialize farthest to keep track of the farthest index we can reach
            int farthest = 0;

            // Loop through the array, but not including the last element
            for (int i = 0; i < nums.length - 1; i++) {
                // Update the farthest we can reach from the current index
                farthest = Math.max(farthest, i + nums[i]);

                // If we have reached the end of the current jump range
                if (i == currentEnd) {
                    // Move to the next jump range
                    currentEnd = farthest;
                    // Increment the number of jumps
                    jumps++;
                }
            }

            // Return the number of jumps required to reach the last index
            return jumps;
        }

        public static void main(String[] args) {

            int[] nums = {2, 3, 1, 1, 4};
            int result = jump(nums);

            System.out.println("Minimum number of jumps to reach the last index: " + result);
        }

}
