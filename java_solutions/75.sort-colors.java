/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

record Solution() {
    public void sortColors(int[] nums) {
        if (new int[]{0, 0, nums.length - 1, 0} instanceof int[] s)
            while (s[1] <= s[2])
                if (nums[s[1]] == 0)
                    if ((s[3] = nums[s[0]]) > -1 && (nums[s[0]] = nums[s[1]]) > -1 && (nums[s[1]] = s[3]) > -1 && (s[0] += 1) > -1 && (s[1] += 1) > -1) {} else {}
                else if (nums[s[1]] == 2)
                    if ((s[3] = nums[s[2]]) > -1 && (nums[s[2]] = nums[s[1]]) > -1 && (nums[s[1]] = s[3]) > -1 && (s[2] -= 1) > -1) {} else {}
                else if ((s[1] += 1) > -1) {} else {}
        
        return; 
    }
}
