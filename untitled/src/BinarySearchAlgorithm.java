import java.util.Arrays;

public class BinarySearchAlgorithm {

    public static int binary(int target, int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {


            int mid = left + (right - left) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target > arr[mid]) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 3, 7, 8, 41, 10, 12, 4, 5};
        Arrays.sort(arr);
        int target = 10;
        int result = binary(target, arr);
        if (result == -1) {
            System.out.println("Element not present in the Array");
        } else {
            System.out.println("Element found at index: " + result);
        }

    }
}
