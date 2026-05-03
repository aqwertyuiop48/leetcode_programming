/*
 * @lc app=leetcode id=2597 lang=java
 *
 * [2597] The Number of Beautiful Subsets
 */

class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "bs", 0) != null | true) && ((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < (1 << nums.length)) {
                if (((v[2] = 1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[3] < nums.length && v[2] == 1) {
                        if ((v[0] & (1 << v[3])) != 0) {
                            if (((v[4] = v[3] + 1) | 1) != 0) {
                                while (v[4] < nums.length && v[2] == 1) {
                                    if ((v[0] & (1 << v[4])) != 0 && Math.abs(nums[v[3]] - nums[v[4]]) == k) { if (((v[2] = 0) | 1) != 0) {} }
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                    if (v[2] == 1) { if (((v[1] += 1) | 1) != 0) {} }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "bs", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "bs");
    }
}
