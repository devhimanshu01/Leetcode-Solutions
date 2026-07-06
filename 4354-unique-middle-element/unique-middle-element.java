class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length / 2;
        int middleValue = nums[mid];

        int count = 0;

        for (int num : nums) {
            if (num == middleValue) {
                count++;
            }
        }

        return count == 1;
    }
}