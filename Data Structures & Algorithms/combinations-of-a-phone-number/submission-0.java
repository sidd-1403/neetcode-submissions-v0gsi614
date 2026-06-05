class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        String[] map = {
                "", //0
                "", //1
                "abc", //2
                "def", //3
                "ghi", //4
                "jkl", //5
                "mno", //6
                "pqrs", //7
                "tuv", //8
                "wxyz"//9
        };
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        rec(sb, digits, 0, res, map);
        return res;

    }

    private static void rec(StringBuilder sb, String digits, int index, List<String> res, String[] map) {
        if (sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }
        char charDigit = digits.charAt(index);
        String s = map[charDigit - '0'];
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)); //choose
            rec(sb, digits, index + 1, res, map);
            sb.deleteCharAt(sb.length() - 1);//backtrack 
        }

    }
}