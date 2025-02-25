import java.util.Arrays;

class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;         // Counter for keeping track of elements other than val
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveElement remove = new RemoveElement();

        int[] nums = {3, 2, 2, 3, 4, 2, 5, 3};
        int val = 3;

        System.out.println("Original array: " + Arrays.toString(nums));
        int newLength = remove.removeElement(nums, val);

        System.out.println("Array after removing " + val + ": " + Arrays.toString(Arrays.copyOf(nums, newLength)));
        System.out.println("New length: " + newLength);
    }
}
