class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (ans > (nums[j] - nums[i])) {
                    continue;
                } else {
                    if (nums[j] > nums[i]) {
                        ans = nums[j] - nums[i];
                    }
                }
            }
        }
        return ans;
    }
}