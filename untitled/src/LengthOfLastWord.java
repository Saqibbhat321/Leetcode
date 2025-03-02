class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int wordLength =0;
        for(int i =s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!= ' ')
            {
                wordLength++;
            }else {
                break;
            }

        }
        return wordLength;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String s = "   Hello this  is Saqib   ";
        System.out.println("Length of last word is: "+lengthOfLastWord.lengthOfLastWord(s));
    }
}