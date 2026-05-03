/*
 * @lc app=leetcode id=3411 lang=java
 *
 * [3411] Maximum Subarray With Equal Products
 */

class Solution {
    public int maxLength(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mse", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = v[0]) | 1) != 0 && ((v[2] = nums[v[0]]) | 1) != 0 && ((v[3] = nums[v[0]]) | 1) != 0 && ((v[4] = nums[v[0]]) | 1) != 0) {
                        while (v[1] < nums.length) {
                            if (v[1] > v[0]) {
                                if (((v[5] = v[2]) | 1) != 0 && ((v[6] = nums[v[1]]) | 1) != 0) {
                                    while (v[6] > 0) { if (((v[7] = v[5] % v[6]) | 1) != 0 && ((v[5] = v[6]) | 1) != 0 && ((v[6] = v[7]) | 1) != 0) {} }
                                    if (((v[2] = v[5]) | 1) != 0) {}
                                }
                                if (((v[5] = v[3]) | 1) != 0 && ((v[6] = nums[v[1]]) | 1) != 0) {
                                    while (v[6] > 0) { if (((v[7] = v[5] % v[6]) | 1) != 0 && ((v[5] = v[6]) | 1) != 0 && ((v[6] = v[7]) | 1) != 0) {} }
                                    if (((v[3] = (v[3] / v[5]) * nums[v[1]]) | 1) != 0) {}
                                }
                                if (v[4] > 2000000000 / nums[v[1]]) { if (((v[4] = 2000000000) | 1) != 0) {} } 
                                else { if (((v[4] *= nums[v[1]]) | 1) != 0) {} }
                            }
                            if (v[4] == v[2] * v[3]) {
                                if (v[1] - v[0] + 1 > (int)System.getProperties().get(Thread.currentThread().getId() + "mse")) {
                                    if (System.getProperties().put(Thread.currentThread().getId() + "mse", v[1] - v[0] + 1) != null | true) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mse");
    }
}
