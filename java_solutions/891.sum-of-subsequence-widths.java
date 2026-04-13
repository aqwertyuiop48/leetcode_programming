/*
 * @lc app=leetcode id=891 lang=java
 *
 * [891] Sum of Subsequence Widths
 */

class Solution {
    public int sumSubseqWidths(int[] nums) {
        if (new Object[]{new long[1], new long[nums.length], new int[100005], new int[5]} instanceof Object[] v) {
            if (((((long[])v[1])[0] = 1) | 1) != 0 && ((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < nums.length) {
                if (((int[])v[3])[0] > 0) {
                    if (((((long[])v[1])[((int[])v[3])[0]] = (((long[])v[1])[((int[])v[3])[0] - 1] * 2) % 1000000007L) | 1) != 0) {}
                }
                if (((((int[])v[2])[nums[((int[])v[3])[0]]] += 1) | 1) != 0 && ((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[3])[0] = 0) | 1) != 0 && ((((int[])v[3])[1] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] <= 100000) {
                while (((int[])v[2])[((int[])v[3])[0]] > 0) {
                    if (((nums[((int[])v[3])[1]++] = ((int[])v[3])[0]) | 1) != 0 && ((((int[])v[2])[((int[])v[3])[0]] -= 1) | 1) != 0) {}
                }
                if (((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[3])[0] = 0) | 1) != 0) {}
            while (((int[])v[3])[0] < nums.length) {
                if (((((long[])v[0])[0] = (((long[])v[0])[0] + nums[((int[])v[3])[0]] * ((long[])v[1])[((int[])v[3])[0]] - nums[((int[])v[3])[0]] * ((long[])v[1])[nums.length - 1 - ((int[])v[3])[0]]) % 1000000007L) | 1) != 0 && ((((int[])v[3])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("ssw", (int) ((((long[])v[0])[0] + 1000000007L) % 1000000007L)) != null || true) {}
        }
        return (int) System.getProperties().get("ssw");
    }
}
