public class RotateArray {


    public static void reverse(int nums[], int start, int last)
    {
        while(start< last)
        {
            int temp = nums[start];
            nums[start]= nums[last];
            nums[last]=temp;
            start++;
            last--;
        }
    }
    public static void rotate(int nums[], int k)
    {
        k %= nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
    }

    public static void main(String[] args) {
//        RotateArray rotateArray = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        System.out.println("Original array is : ");
        for(int num: nums)
        {
            System.out.print(num+ " ");
        }
        System.out.println();

        rotate(nums,k);

        System.out.println("Array after rotation is: ");
        for(int num: nums)
        {
            System.out.print(num+ " ");
        }
    }
}
