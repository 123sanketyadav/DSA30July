class Solution {

    Boolean[][] dp;

    public boolean canPartition(int[] nums) {

        int sum = 0;

        for (int x : nums)
            sum += x;

        if (sum % 2 != 0)
            return false;

        dp = new Boolean[nums.length][sum / 2 + 1];

        return solve(nums, 0, sum / 2);
    }

    boolean solve(int[] nums, int index, int target) {

        if (target == 0)
            return true;

        if (index == nums.length || target < 0)
            return false;

        if (dp[index][target] != null)
            return dp[index][target];

        boolean take = solve(nums, index + 1, target - nums[index]);
        boolean skip = solve(nums, index + 1, target);

        return dp[index][target] = take || skip;
    }
}