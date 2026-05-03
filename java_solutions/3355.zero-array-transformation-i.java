/*
 * @lc app=leetcode id=3355 lang=java
 *
 * [3355] Zero Array Transformation I
 */

class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        if (new int[nums.length + 5] instanceof int[] d && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "zat", true) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < queries.length) {
                    if (((d[queries[v[0]][0]] += 1) | 1) != 0 && ((d[queries[v[0]][1] + 1] -= 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < nums.length && (boolean)System.getProperties().get(Thread.currentThread().getId() + "zat")) {
                        if (((v[1] += d[v[0]]) | 1) != 0) {
                            if (nums[v[0]] > v[1]) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "zat", false) != null | true) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "zat");
    }
}
