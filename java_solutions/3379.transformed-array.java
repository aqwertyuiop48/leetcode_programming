/*
 * @lc app=leetcode id=3379 lang=java
 *
 * [3379] Transformed Array
 */

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        if (new int[nums.length] instanceof int[] res && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cta", res) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = nums.length) | 1) != 0) {
                while (v[0] < v[1]) {
                    if (((res[v[0]] = nums[(((v[0] + nums[v[0]]) % v[1]) + v[1]) % v[1]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "cta");
    }
}
