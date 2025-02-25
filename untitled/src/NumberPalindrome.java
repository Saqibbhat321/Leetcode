public class NumberPalindrome {

    public static boolean Ispalindrome(int number)
    {
        if(number<0)
        {
            number=Math.abs(number);

        }
        int originalNum=number;
        int reversedNum = 0;
        while(number>0)
        {
            int lastDigit=number%10; //obtains last digit
            reversedNum = (reversedNum*10)+lastDigit; // add last digit to reversedNum
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
