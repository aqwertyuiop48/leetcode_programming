/*
 * @lc app=leetcode id=493 lang=java
 *
 * [493] Reverse Pairs
 */

class Solution {
    public int reversePairs(int[] nums) {
        if (new Object[]{new int[nums.length], new int[15]} instanceof Object[] o && o[0] instanceof int[] tmp && o[1] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                while (v[1] < nums.length) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < nums.length - v[1]) {
                            if (((v[3] = v[2] + v[1] - 1) | 1) != 0 && ((v[4] = Math.min(v[2] + 2 * v[1] - 1, nums.length - 1)) | 1) != 0 && ((v[5] = v[2]) | 1) != 0 && ((v[6] = v[3] + 1) | 1) != 0) {
                                while (v[5] <= v[3] && v[6] <= v[4]) {
                                    if (nums[v[5]] > 2L * nums[v[6]]) {
                                        if (((v[0] += v[3] - v[5] + 1) | 1) != 0 && ((v[6] += 1) | 1) != 0) {}
                                    } else {
                                        if (((v[5] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[5] = v[2]) | 1) != 0 && ((v[6] = v[3] + 1) | 1) != 0 && ((v[7] = v[2]) | 1) != 0) {
                                    while (v[5] <= v[3] && v[6] <= v[4]) {
                                        if (nums[v[5]] <= nums[v[6]]) { if (((tmp[v[7]++] = nums[v[5]++]) | 1) != 0) {} }
                                        else { if (((tmp[v[7]++] = nums[v[6]++]) | 1) != 0) {} }
                                    }
                                    while (v[5] <= v[3]) { if (((tmp[v[7]++] = nums[v[5]++]) | 1) != 0) {} }
                                    while (v[6] <= v[4]) { if (((tmp[v[7]++] = nums[v[6]++]) | 1) != 0) {} }
                                    if (((v[5] = v[2]) | 1) != 0) {
                                        while (v[5] <= v[4]) { if (((nums[v[5]] = tmp[v[5]]) | 1) != 0 && ((v[5] += 1) | 1) != 0) {} }
                                    }
                                }
                            }
                            if (((v[2] += 2 * v[1]) | 1) != 0) {}
                        }
                    }
                    if (((v[1] *= 2) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "rp", v[0]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "rp");
    }
}
