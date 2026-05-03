/*
 * @lc app=leetcode id=2733 lang=java
 *
 * [2733] Neither Minimum nor Maximum
 */

class Solution {
    public int findNonMinOrMax(int[] nums) {
        return nums.length < 3 ? -1 : new Object[]{java.util.Arrays.stream(nums).limit(3).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] s ? s[1] : -1;
    }
}
