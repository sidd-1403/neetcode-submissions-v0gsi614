class Solution {
    public int lengthOfLastWord(String s) {
    int count=0;
    int i=s.length()-1;

    while(i>=0 && Character.isWhitespace(s.charAt(i)))
    {
        i--;
    }

    while(i>=0 && Character.isLetter(s.charAt(i)))
    {
        count++;
        i--;
    }
     return count;

    }
}