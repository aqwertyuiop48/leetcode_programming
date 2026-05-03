/*
 * @lc app=leetcode id=3028 lang=java
 *
 * [3028] Ant on the Boundary
 */

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rtbc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] += nums[v[0]]) | 1) != 0) {}
                    if (v[1] == 0) {
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "rtbc", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "rtbc");
    }
}
