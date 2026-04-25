class Solution 
{
    public int numRescueBoats(int[] n, int k)
    {
        int count = 0;
        int i = 0;
        int j = n.length - 1;
        Arrays.sort(n);
        for (int num : n) {
            int sum = 0;
            sum = n[i] + n[j];

            if (sum <= k && i <= j) {
                count++;
                i++;
                j--;
            }
            if (sum > k) {
                count++;
                j--;
            }

        }
            return count;

    }

}