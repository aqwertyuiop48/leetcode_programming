/*
 * @lc app=leetcode id=3354 lang=java
 *
 * [3354] Make Array Elements Equal to Zero
 */

class Solution {
    public int countValidSelections(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cvs", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] += nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (nums[v[0]] != 0) {
                            if (((v[2] += nums[v[0]]) | 1) != 0 && ((v[1] -= nums[v[0]]) | 1) != 0) {}
                        } else {
                            if (v[2] == v[1]) { if (((v[3] += 2) | 1) != 0) {} }
                            else if (Math.abs(v[2] - v[1]) == 1) { if (((v[3] += 1) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "cvs", v[3]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cvs");
    }
}
