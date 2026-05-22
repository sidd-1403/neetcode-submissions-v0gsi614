class Solution {
    public List<String> generateParenthesis(int n) {
        // your code goes here
        List<String> list = new ArrayList<>();
        para(list, "", 0, 0, n);
        return list;
    }

    private void para(List<String> list, String ans, int c1, int c2, int n) {
        if (c1 == n && c2 == n) {
            list.add(ans);
            return;
        }
        if (c1 != n) {
            para(list, ans + '(', c1 + 1, c2, n);
        }
        if (c2 != n && c2 < c1) {
            para(list, ans + ')', c1, c2 + 1, n);
        }
    }
}
