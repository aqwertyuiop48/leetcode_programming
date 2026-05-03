/*
 * @lc app=leetcode id=3867 lang=java
 *
 * [3867] Sum of GCD of Formed Pairs
 */

class Solution {
    public long gcdSum(int[] nums) {
        if (new int[10] instanceof int[] v && new long[10] instanceof long[] lv) {
            if (((v[0] = nums[0]) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < nums.length) {
                    if (nums[v[1]] > v[0]) { if (((v[0] = nums[v[1]]) | 1) != 0) {} }
                    if (((v[2] = nums[v[1]]) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {
                        while (v[3] != 0) { if (((v[4] = v[3]) | 1) != 0 && ((v[3] = v[2] % v[3]) | 1) != 0 && ((v[2] = v[4]) | 1) != 0) {} }
                        if (((nums[v[1]] = v[2]) | 1) != 0) {}
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (new Object[]{java.util.Arrays.stream(nums).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] s) {
                    if (((v[1] = 0) | 1) != 0 && ((v[5] = s.length - 1) | 1) != 0) {
                        while (v[1] < v[5]) {
                            if (((v[2] = s[v[1]++]) | 1) != 0 && ((v[3] = s[v[5]--]) | 1) != 0) {
                                while (v[3] != 0) { if (((v[4] = v[3]) | 1) != 0 && ((v[3] = v[2] % v[3]) | 1) != 0 && ((v[2] = v[4]) | 1) != 0) {} }
                                if (((lv[0] += v[2]) | 1) != 0) {}
                            }
                        }
                        if (System.getProperties().put("gcds", lv[0]) != null | true) {}
                    }
                }
            }
        }
        return (long) System.getProperties().get("gcds");
    }
}
