public class StringPalindrome {

    public static boolean IsPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true; //Empty strings and null are Considered Palindromes
        }
        //Remove non-alphanumeric and lowercase
        String cleansedStr = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int first = 0;
        int last = cleansedStr.length() - 1;
        while (first < last) {
            if (cleansedStr.charAt(first) != cleansedStr.charAt(last)) {

                return false;

            }
            first++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] str = {"hello", "mAdam", "olO"," ",null};
        for (String i : str) {
            if (IsPalindrome(i)) {
                System.out.println(i + " is a palindrome string");
            } else {
                System.out.println(i + " is not a palindrome string");
            }
        }
    }
}
