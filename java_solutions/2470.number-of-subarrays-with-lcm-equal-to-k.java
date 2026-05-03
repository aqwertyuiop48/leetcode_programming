/*
 * @lc app=leetcode id=2470 lang=java
 *
 * [2470] Number of Subarrays With LCM Equal to K
 */

class Solution {
    public int subarrayLCM(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sl", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = v[0]) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                    while (v[2] < nums.length && v[5] == 1) {
                        if (((v[3] = v[1]) | 1) != 0 && ((v[4] = nums[v[2]]) | 1) != 0) {
                            while (v[4] != 0) { if (((v[6] = v[4]) | 1) != 0 && ((v[4] = v[3] % v[4]) | 1) != 0 && ((v[3] = v[6]) | 1) != 0) {} }
                            if (((v[1] = (v[1] / v[3]) * nums[v[2]]) | 1) != 0) {
                                if (v[1] == k) { if (((v[7] += 1) | 1) != 0) {} }
                                else if (v[1] > k || k % v[1] != 0) { if (((v[5] = 0) | 1) != 0) {} }
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "sl", v[7]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sl");
    }
}
