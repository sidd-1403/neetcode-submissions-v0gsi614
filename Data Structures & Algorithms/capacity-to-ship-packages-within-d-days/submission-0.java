class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = 1;
        for (int num : weights) {
            low = Math.max(low, num);
        }
        for (int sum : weights) {
            high += sum;
        }
        int answer = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = possibleCapacity(mid, weights);

            if (result <= days) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    private int possibleCapacity(int mid, int[] weights) {
        int sum = 0;
        int daysUsed = 1;

        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] <= mid) {
                sum += weights[i];
            } else {
                daysUsed++;
                sum = weights[i];
            }
        }
        return daysUsed;
    }
}
