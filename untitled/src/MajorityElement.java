public class MajorityElement {

    // Using Boyer-Moore Voting Algorithm.

    public static int majorityElement(int nums[]) {

        int count = 0;
        int candidate = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0 && candidate != nums[i]) {
                candidate = nums[i];
                count = 1;
            } else if (candidate == nums[i]) {
                count++;
            } else
                count--;
        }
        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        int result = majorityElement(nums);
        System.out.println("The majority element is in the given array is : " + result);
    }
}