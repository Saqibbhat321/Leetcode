class RomanToInteger {
    public static int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;

    }

    public static void main(String[] args) {

        // Test cases
        String roman1 = "III";
        String roman2 = "IV";
        String roman3 = "IX";
        String roman4 = "LVIII";
        String roman5 = "MCMXCIV";

        System.out.println("Roman: " + roman1 + " => Integer: " + romanToInt(roman1));
        System.out.println("Roman: " + roman2 + " => Integer: " + romanToInt(roman2));
        System.out.println("Roman: " + roman3 + " => Integer: " + romanToInt(roman3));
        System.out.println("Roman: " + roman4 + " => Integer: " + romanToInt(roman4));
        System.out.println("Roman: " + roman5 + " => Integer: " + romanToInt(roman5));
    }
}
