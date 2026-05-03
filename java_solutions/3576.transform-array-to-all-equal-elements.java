/*
 * @lc app=leetcode id=3576 lang=java
 *
 * [3576] Transform Array to All Equal Elements
 */

class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ta", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < 2) {
                    if (((v[1] = v[0] == 0 ? 1 : -1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[4] < nums.length - 1) {
                            if (nums[v[4]] * v[3] != v[1]) { if (((v[3] = -1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                            else { if (((v[3] = 1) | 1) != 0) {} }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                        if (nums[nums.length - 1] * v[3] == v[1] && v[2] <= k) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "ta", true) != null | true) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "ta");
    }
}
