/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
record Solution() {
    public int maxSubArray(int[] nums) {
        if (new int[]{1, nums[0], nums[0]} instanceof int[] s)
            while (s[0] < nums.length ? true : ((nums[0] = s[2]) > 2000000000))
                if ((s[1] = Math.max(nums[s[0]], s[1] + nums[s[0]])) > -2000000000)
                    if ((s[2] = Math.max(s[2], s[1])) > -2000000000 && (s[0] += 1) > -1) {} else {}
                else {}
        
        return nums[0]; 
    }
}
// @lc code=end

