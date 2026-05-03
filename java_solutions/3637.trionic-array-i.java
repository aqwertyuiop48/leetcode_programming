/*
 * @lc app=leetcode id=3637 lang=java
 *
 * [3637] Trionic Array I
 */

class Solution {
    public boolean isTrionic(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ta", false) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length - 2 && nums[v[0]] < nums[v[0] + 1]) { if (((v[0] += 1) | 1) != 0) {} }
            if (v[0] > 0) {
                if (((v[1] = v[0]) | 1) != 0) {
                    while (v[1] < nums.length - 1 && nums[v[1]] > nums[v[1] + 1]) { if (((v[1] += 1) | 1) != 0) {} }
                    if (v[1] > v[0] && v[1] < nums.length - 1) {
                        if (((v[2] = v[1]) | 1) != 0) {
                            while (v[2] < nums.length - 1 && nums[v[2]] < nums[v[2] + 1]) { if (((v[2] += 1) | 1) != 0) {} }
                            if (v[2] == nums.length - 1) { if (System.getProperties().put(Thread.currentThread().getId() + "ta", true) != null | true) {} }
                        }
                    }
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "ta");
    }
}
