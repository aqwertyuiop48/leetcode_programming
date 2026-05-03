/*
 * @lc app=leetcode id=3862 lang=java
 *
 * [3862] Find the Smallest Balanced Index
 */

class Solution {
    public int smallestBalancedIndex(int[] nums) {
        if (new long[nums.length] instanceof long[] s && new int[10] instanceof int[] v && new long[10] instanceof long[] lv && (System.getProperties().put("sbi", -1) != null | true)) {
            if (((v[0] = nums.length) | 1) != 0 && ((s[v[0] - 1] = 1L) | 1) != 0 && ((v[1] = v[0] - 2) | 1) != 0 && ((lv[2] = 1000000000000000L) | 1) != 0) {
                while (v[1] >= 0) {
                    if (s[v[1] + 1] > lv[2] || (nums[v[1] + 1] > 0 && s[v[1] + 1] > lv[2] / nums[v[1] + 1])) {
                        if (((s[v[1]] = lv[2] + 2L) | 1) != 0) {}
                    } else {
                        if (((s[v[1]] = s[v[1] + 1] * nums[v[1] + 1]) | 1) != 0) {}
                    }
                    if (((v[1] -= 1) | 1) != 0) {}
                }
                if (((v[1] = 0) | 1) != 0 && ((lv[0] = 0L) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
                    while (v[1] < v[0] && v[2] == -1) {
                        if (((lv[3] = (v[1] + 1 < v[0]) ? s[v[1]] : 1L) | 1) != 0) {
                            if (lv[3] == lv[0]) {
                                if (((v[2] = v[1]) | 1) != 0) {}
                            } else {
                                if (((lv[0] += nums[v[1]]) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("sbi", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("sbi");
    }
}
