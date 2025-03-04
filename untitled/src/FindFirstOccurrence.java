public class FindFirstOccurrence {
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) {
            return 0; // If needle is empty, return 0
        }
        return haystack.indexOf(needle); // Use indexOf method
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println("Index of first occurrence: " + strStr(haystack, needle)); // Output: 2
    }
}
