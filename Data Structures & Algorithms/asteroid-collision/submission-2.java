class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            if (st.isEmpty()) {
                st.push(asteroids[i]);
            }

            // collision
            else if (asteroids[i] < 0 && st.peek() > 0) {

                int absValue = Math.abs(asteroids[i]);

                // remove smaller positive asteroids
                while (!st.isEmpty() && st.peek() > 0 && absValue > st.peek()) {
                    st.pop();
                }

                // equal size destroy both
                if (!st.isEmpty() && absValue == st.peek()) {
                    st.pop();
                }

                // current asteroid survives
                else if (st.isEmpty() || st.peek() < 0) {
                    st.push(asteroids[i]);
                }
            }

            // no collision
            else {
                st.push(asteroids[i]);
            }
        }

        int[] arr = new int[st.size()];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }

        return arr;
    }
    
}