/*
 * @lc app=leetcode id=3745 lang=java
 *
 * [3745] Maximize Expression of Three Elements
 */

class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "me3", 0) != null | true)) {
            if (((v[0] = -999999999) | 1) != 0 && ((v[1] = -999999999) | 1) != 0 && ((v[2] = 999999999) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[3] < nums.length) {
                    if (nums[v[3]] > v[0]) { if (((v[1] = v[0]) | 1) != 0 && ((v[0] = nums[v[3]]) | 1) != 0) {} }
                    else if (nums[v[3]] > v[1]) { if (((v[1] = nums[v[3]]) | 1) != 0) {} }
                    if (nums[v[3]] < v[2]) { if (((v[2] = nums[v[3]]) | 1) != 0) {} }
                    if (((v[3] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "me3", v[0] + v[1] - v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "me3");
    }
}
