class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        return isValidParenthesis(s, st);

    }

    public static boolean isValidParenthesis(String s, Stack<Character> st) {
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {

                if (st.isEmpty() || (c == ')' && st.peek() != '(') || (c == '}' && st.peek() != '{')
                        || (c == ']' && st.peek() != '[')) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        if (st.isEmpty())
            return true;

        return false;

    }
}