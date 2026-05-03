/*
 * @lc app=leetcode id=3300 lang=java
 *
 * [3300] Minimum Element After Replacement With Digit Sum
 */

class Solution {
    public int minElement(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "me", 999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[2] = 999999) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = 0) | 1) != 0 && ((v[3] = nums[v[0]]) | 1) != 0) {
                        while (v[3] > 0) {
                            if (((v[1] += v[3] % 10) | 1) != 0 && ((v[3] /= 10) | 1) != 0) {}
                        }
                        if (v[1] < v[2]) { if (((v[2] = v[1]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "me", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "me");
    }
}
