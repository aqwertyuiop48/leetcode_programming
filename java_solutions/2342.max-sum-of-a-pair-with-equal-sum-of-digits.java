/*
 * @lc app=leetcode id=2342 lang=java
 *
 * [2342] Max Sum of a Pair With Equal Sum of Digits
 */

class Solution {
    public int maximumSum(int[] nums) {
        if (new int[100] instanceof int[] m && new int[10] instanceof int[] v && (System.getProperties().put("ms", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[4] = -1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] > 0) { if (((v[2] += v[1] % 10) | 1) != 0 && ((v[1] /= 10) | 1) != 0) {} }
                        if (m[v[2]] > 0) {
                            if (m[v[2]] + nums[v[0]] > v[4]) { if (((v[4] = m[v[2]] + nums[v[0]]) | 1) != 0) {} }
                            if (nums[v[0]] > m[v[2]]) { if (((m[v[2]] = nums[v[0]]) | 1) != 0) {} }
                        } else {
                            if (((m[v[2]] = nums[v[0]]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("ms", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("ms");
    }
}
