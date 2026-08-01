class Solution {
    public int countValidSelections(int[] nums) {
        int total = 0;
        for (int x : nums) {
            total += x;
        }

        int leftSum = 0;
        int ans = 0;

        for (int x : nums) {
            if (x != 0) {
                leftSum += x;
            } else {
                int diff = Math.abs(2 * leftSum - total);

                if (diff == 0) {
                    ans += 2;
                } else if (diff == 1) {
                    ans += 1;
                }
            }
        }

        return ans;
    }
}