//Given an integer array nums sorted in non-decreasing order, remove some duplicates
// in-place such that each unique element appears at most twice.The relative order
// of the elements should be kept the same.

public class RemoveDuplicatesSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        {
            RemoveDuplicatesSortedArray2 solution = new RemoveDuplicatesSortedArray2();

            int[] nums = {1, 1, 1, 2, 2, 2, 3};
            int length = solution.removeDuplicates(nums);

            System.out.println("Number of elements after removing duplicates: " + length);
            System.out.print("Array after removing duplicates looks like below: ");
            for (int i = 0; i < length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
