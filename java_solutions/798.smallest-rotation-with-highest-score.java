/*
 * @lc app=leetcode id=798 lang=java
 *
 * [798] Smallest Rotation with Highest Score
 */

class Solution {
    public int bestRotation(int[] nums) {
        if (new int[]{0, 0, 0, 0} instanceof int[] v && new int[nums.length] instanceof int[] bad) {
            while (v[0] < nums.length) {
                if (((bad[(v[0] - nums[v[0]] + 1 + nums.length) % nums.length] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] += 1 - bad[v[0]]) | 1) != 0) {
                        if (v[1] > v[2]) {
                            if (((v[2] = v[1]) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((nums[0] = v[3]) | 1) != 0) {}
        }
        return nums[0];
    }
}
