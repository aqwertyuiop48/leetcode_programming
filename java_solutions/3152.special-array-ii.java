/*
 * @lc app=leetcode id=3152 lang=java
 *
 * [3152] Special Array II
 */

class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        if (new int[nums.length] instanceof int[] p && new boolean[queries.length] instanceof boolean[] res && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sa2", res) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < nums.length) {
                    if ((nums[v[0]] % 2) == (nums[v[0] - 1] % 2)) {
                        if (((p[v[0]] = p[v[0] - 1] + 1) | 1) != 0) {}
                    } else {
                        if (((p[v[0]] = p[v[0] - 1]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < queries.length) {
                        if (p[queries[v[0]][1]] - p[queries[v[0]][0]] == 0) {
                            // Fixed line below: direct boolean assignment as the condition
                            if (res[v[0]] = true) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (boolean[]) System.getProperties().get(Thread.currentThread().getId() + "sa2");
    }
}
