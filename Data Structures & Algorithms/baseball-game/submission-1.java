class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("+")) {
                int first = st.pop();
                int second = st.pop();
                int add = first + second;
                st.push(second);
                st.push(first);
                st.push(add);
            } else if (arr[i].equals("D")) {
                int prev = st.peek();
                int mul = prev * 2;
                st.push(mul);
            } else if (arr[i].equals("C")) {
                st.pop();
            } else {
                st.push(Integer.parseInt(arr[i]));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}