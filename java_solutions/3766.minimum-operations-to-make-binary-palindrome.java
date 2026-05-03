/*
 * @lc app=leetcode id=3766 lang=java
 *
 * [3766] Minimum Operations to Make Binary Palindrome
 */

class Solution {
    public int[] minOperations(int[] nums) {
        if (new int[10] instanceof int[] v && new int[16384] instanceof int[] pals && (System.getProperties().put(Thread.currentThread().getId() + "mo", new int[0]) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < 16384) {
                if (Integer.toBinaryString(v[0]).equals(new StringBuilder(Integer.toBinaryString(v[0])).reverse().toString())) {
                    if (((pals[v[1]++] = v[0]) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (new int[nums.length] instanceof int[] ans && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = v[1] - 1) | 1) != 0) {
                        while (v[2] <= v[3]) {
                            if (((v[4] = (v[2] + v[3]) >>> 1) | 1) != 0) {
                                if (pals[v[4]] >= nums[v[0]]) { if (((v[3] = v[4] - 1) | 1) != 0) {} }
                                else { if (((v[2] = v[4] + 1) | 1) != 0) {} }
                            }
                        }
                        if (((v[5] = Integer.MAX_VALUE) | 1) != 0) {
                            if (v[2] < v[1]) { if (pals[v[2]] - nums[v[0]] < v[5]) { if (((v[5] = pals[v[2]] - nums[v[0]]) | 1) != 0) {} } }
                            if (v[2] >= 1) { if (nums[v[0]] - pals[v[2] - 1] < v[5]) { if (((v[5] = nums[v[0]] - pals[v[2] - 1]) | 1) != 0) {} } }
                            if (((ans[v[0]] = v[5]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mo", ans) != null | true) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "mo");
    }
}
