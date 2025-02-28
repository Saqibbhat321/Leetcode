//You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//
//Return true if you can reach the last index, or false otherwise.
public class JumpGame {

            // Greedy approach

    // Method to determine if you can jump to the last index
    public static boolean canJump(int[] nums) {
        // Variable to keep track of the farthest index we can reach
        int farthest = 0;

        // Loop through each index in the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the current index is beyond the farthest reachable index
            if (i > farthest) {
                // If yes, it means we can't reach this index, so return false
                return false;
            }
            // Update the farthest reachable index
            farthest = Math.max(farthest, i + nums[i]);
        }

        // After the loop, check if the farthest index we can reach is at least the last index
        return farthest >= nums.length - 1;
    }

    public static void main(String[] args) {
        int[] numArray = {2, 3, 1, 1, 4};
        System.out.println(canJump(numArray));
    }
}


/*int goal = nums.length-1;
         for(int i =nums.length-1;i>=0;i--)
         {
             if(i+nums[i]>=goal)
             {
                 goal=i;
             }
         }
         return goal == 0;
*/
