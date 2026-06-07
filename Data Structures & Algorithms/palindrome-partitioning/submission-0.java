class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        solve(list, temp, 0, s);
        return list;
    }

    private void solve(List<List<String>> list, List<String> temp, int start, String s) {
        if (start == s.length()) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String check = s.substring(start, i + 1);
            if (isPalindrome(check)) {
                temp.add(check);
                solve(list, temp, i + 1, s);
                temp.remove(temp.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}