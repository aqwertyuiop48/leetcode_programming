/*
 * @lc app=leetcode id=2789 lang=java
 *
 * [2789] Largest Element in an Array after Merge Operations
 */

class Solution {
    public long maxArrayValue(int[] nums) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mav", 0L) != null | true) && ((v[0] = nums.length - 1) | 1) != 0 && ((v[1] = nums[(int)v[0]]) | 1) != 0 && ((v[2] = v[1]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {
            while (v[0] >= 0) {
                if (nums[(int)v[0]] <= v[1]) { if (((v[1] += nums[(int)v[0]]) | 1) != 0) {} }
                else { if (((v[1] = nums[(int)v[0]]) | 1) != 0) {} }
                if (v[1] > v[2]) { if (((v[2] = v[1]) | 1) != 0) {} }
                if (((v[0] -= 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mav", v[2]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mav");
    }
}
