/*
 * @lc app=leetcode id=3653 lang=java
 *
 * [3653] XOR After Range Multiplication Queries I
 */

class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "xaq", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (((v[1] = queries[v[0]][0]) | 1) != 0 && ((v[2] = queries[v[0]][1]) | 1) != 0 && ((v[3] = queries[v[0]][2]) | 1) != 0 && ((v[4] = queries[v[0]][3]) | 1) != 0) {
                        while (v[1] <= v[2]) {
                            if (((nums[v[1]] = (int)(((long)nums[v[1]] * v[4]) % 1000000007)) | 1) != 0 && ((v[1] += v[3]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((v[5] ^= nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (System.getProperties().put(Thread.currentThread().getId() + "xaq", v[5]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "xaq");
    }
}
