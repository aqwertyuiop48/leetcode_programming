/*
 * @lc app=leetcode id=2971 lang=java
 *
 * [2971] Find Polygon With the Largest Perimeter
 */

class Solution {
    public long largestPerimeter(int[] nums) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "lp", -1L) != null | true) && (nums = java.util.Arrays.stream(nums).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (v[0] >= 2 && v[1] > nums[(int)v[0]]) { if (((v[2] = v[1] + nums[(int)v[0]]) | 1) != 0) {} }
                if (((v[1] += nums[(int)v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (v[2] > 0) { if (System.getProperties().put(Thread.currentThread().getId() + "lp", v[2]) != null | true) {} }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "lp");
    }
}
