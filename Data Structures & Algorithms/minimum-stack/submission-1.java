class MinStack {
  Stack<Integer> st;
  Stack<Integer> minStak;

  public MinStack() {
    st = new Stack<>();
    minStak = new Stack<>();
  }

  public void push(int val) {
    st.push(val);
    if (minStak.isEmpty() || val <= minStak.peek()) {
      minStak.push(val);
    }
  }

  public void pop() {
    int n = 0;
    if (!st.isEmpty()) {
      n = st.pop();
    }
    if (!minStak.isEmpty() && n == minStak.peek()) {
      minStak.pop();
    }
  }

  public int top() {
    if (st.isEmpty()) {
      return -1;
    }
    return st.peek();
  }

  public int getMin() {
    if (minStak.isEmpty()) {
      return -1;
    }
    return minStak.peek();
  }
}
