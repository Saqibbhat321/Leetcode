import java.util.Map;
import java.util.HashMap;

public class TwoSumExample {

    public static int[] twoSum(int target, int[] arr) {
        Map<Integer, Integer> mapStore = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
          // We should check for complement BEFORE putting current element in map
            // Otherwise, we might use the same element twice (when target = 2*arr[i])
            int complement = target - arr[i];
            
            if (mapStore.containsKey(complement)) {
                return new int[]{mapStore.get(complement), i};
            }
            
            // Correct position to put the current element in the map
            mapStore.put(arr[i], i);
        }
            return null; 
    }

    public static void main(String[] args) {
        int target = 10;
        int[] arr = {2, 3, 5, 7, 8};
        
        int[] result = twoSum(target, arr);
        if (result != null) {
            System.out.println("Indices: " + java.util.Arrays.toString(result));
            System.out.println("Values: " + arr[result[0]] + " + " + arr[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found");
        }
    }
}
