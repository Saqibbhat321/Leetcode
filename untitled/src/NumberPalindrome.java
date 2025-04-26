public class NumberPalindrome {
//The time complexity is O(log n) (logarithmic in the number of digits). bcz loop runs once per digits
    public static boolean Ispalindrome(int number)
    {
        if(number<0)
        {
            number=Math.abs(number); // Handle negative numbers by converting to positive
        }
        if (number < 10) {
            return true; // Single-digit numbers are always palindromes
        }
        if (number % 10 == 0) {
            return false; // Numbers ending with 0 (except 0 itself) can't be palindromes
        }

        int originalNum=number;
        int reversedNum = 0;
        while(number>0)
        {
            int lastDigit=number%10; //obtains last digit
            reversedNum = (reversedNum*10)+lastDigit;//Multiply by 10 to shift existing digits left, then add the last digit
            number /=10; // Remove last digit from number
        }
        return originalNum == reversedNum;
    }
    public static void main(String[] args) {
    int [] numbers ={121,142,576,12321,-292};
    for(int n: numbers)
    {
        if(Ispalindrome(n))
        {
            System.out.println(n+" "+" is a palindrome");
        }
        else System.out.println(n+" is not a Palindrome");
    }
}

}








//Obtimized approach by check only half part
public class NumberPalindrome {
    // The time complexity is O(log n) (logarithmic in the number of digits) because loop runs once per digit
    public static boolean Ispalindrome(int number) {
        if(number < 0) {
            number = Math.abs(number); // Handle negative numbers by converting to positive
        }
        if (number < 10) {
            return true; // Single-digit numbers are always palindromes
        }
        if (number % 10 == 0) {
            return false; // Numbers ending with 0 (except 0 itself) can't be palindromes
        }
        
        int reversedNum = 0;
        while(number > reversedNum) {
            reversedNum = (reversedNum * 10) + (number % 10); // Multiply by 10 to shift digits left, then add last digit
            number /= 10; // Remove last digit from number
        }
        // Compare first half (number) with reversed second half (reversedNum)
        // For even digits: number == reversedNum
        // For odd digits: number == reversedNum/10 (ignore middle digit)
        return (number == reversedNum) || (number == reversedNum / 10);
    }

    public static void main(String[] args) {
        int[] numbers = {121, 142, 576, 12321, -292};
        for(int n : numbers) {
            if(Ispalindrome(n)) {
                System.out.println(n + " is a palindrome");
            } else {
                System.out.println(n + " is not a Palindrome");
            }
        }
    }
}
