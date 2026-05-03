/*
 * @lc app=leetcode id=3701 lang=java
 *
 * [3701] Compute Alternating Sum
 */

class Solution {
    public int alternatingSum(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "as", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (v[0] % 2 == 0) { if (((v[1] += nums[v[0]]) | 1) != 0) {} }
                else { if (((v[1] -= nums[v[0]]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "as", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "as");
    }
}
