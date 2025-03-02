public class IntegerToRoman {
    public String intToRoman(int num) {
        // Arrays to hold the Roman numeral symbols and their values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        // Iterate over the values and symbols
        for (int i = 0; i < values.length; i++) {
            // Append the symbol while the value fits into num
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        IntegerToRoman integerToRoman = new IntegerToRoman();

        // Test cases
        int number1 = 3;     // III
        int number2 = 4;     // IV
        int number3 = 9;     // IX
        int number4 = 58;    // LVIII
        int number5 = 1994;  // MCMXCIV

        System.out.println("Integer: " + number1 + " => Roman: " + integerToRoman.intToRoman(number1));
        System.out.println("Integer: " + number2 + " => Roman: " + integerToRoman.intToRoman(number2));
        System.out.println("Integer: " + number3 + " => Roman: " + integerToRoman.intToRoman(number3));
        System.out.println("Integer: " + number4 + " => Roman: " + integerToRoman.intToRoman(number4));
        System.out.println("Integer: " + number5 + " => Roman: " + integerToRoman.intToRoman(number5));
    }
}
