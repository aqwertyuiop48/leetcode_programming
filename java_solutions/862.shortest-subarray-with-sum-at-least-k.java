/*
 * @lc app=leetcode id=862 lang=java
 *
 * [862] Shortest Subarray with Sum at Least K
 */

class Solution {
    public int shortestSubarray(int[] nums, int k) {
        if (new Object[]{new long[nums.length + 1], new int[nums.length + 1], new int[10]} instanceof Object[] v) {
            if (((((int[])v[2])[0] = 0) | 1) != 0) {}
            while (((int[])v[2])[0] < nums.length) {
                if (((((long[])v[0])[((int[])v[2])[0] + 1] = ((long[])v[0])[((int[])v[2])[0]] + nums[((int[])v[2])[0]]) | 1) != 0 && ((((int[])v[2])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[2])[1] = 0) | 1) != 0 && ((((int[])v[2])[2] = 0) | 1) != 0 && ((((int[])v[2])[3] = nums.length + 1) | 1) != 0 && ((((int[])v[2])[0] = 0) | 1) != 0) {}
            while (((int[])v[2])[0] <= nums.length) {
                while (((int[])v[2])[1] < ((int[])v[2])[2] && ((long[])v[0])[((int[])v[2])[0]] - ((long[])v[0])[((int[])v[1])[((int[])v[2])[1]]] >= k) {
                    if (((((int[])v[2])[4] = ((int[])v[2])[0] - ((int[])v[1])[((int[])v[2])[1]]) | 1) != 0) {}
                    if (((int[])v[2])[4] < ((int[])v[2])[3]) {
                        if (((((int[])v[2])[3] = ((int[])v[2])[4]) | 1) != 0) {}
                    }
                    if (((((int[])v[2])[1] += 1) | 1) != 0) {}
                }
                while (((int[])v[2])[1] < ((int[])v[2])[2] && ((long[])v[0])[((int[])v[2])[0]] <= ((long[])v[0])[((int[])v[1])[((int[])v[2])[2] - 1]]) {
                    if (((((int[])v[2])[2] -= 1) | 1) != 0) {}
                }
                if (((((int[])v[1])[((int[])v[2])[2]++] = ((int[])v[2])[0]) | 1) != 0 && ((((int[])v[2])[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("ssa", ((int[])v[2])[3] == nums.length + 1 ? -1 : ((int[])v[2])[3]) != null || true) {}
        }
        return (int) System.getProperties().get("ssa");
    }
}
