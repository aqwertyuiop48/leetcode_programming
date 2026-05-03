/*
 * @lc app=leetcode id=3356 lang=java
 *
 * [3356] Zero Array Transformation II
 */

class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mza2", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = queries.length) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                while (v[6] < nums.length) { if (nums[v[6]] > 0) { if (((v[7] = 1) | 1) != 0) {} } if (((v[6] += 1) | 1) != 0) {} }
                if (v[7] == 0) { if (System.getProperties().put(Thread.currentThread().getId() + "mza2", 0) != null | true && ((v[0] = v[1] + 1) | 1) != 0) {} }
                while (v[0] <= v[1]) {
                    if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && new int[nums.length + 1] instanceof int[] diff && ((v[3] = 0) | 1) != 0) {
                        while (v[3] < v[2]) {
                            if (((diff[queries[v[3]][0]] += queries[v[3]][2]) | 1) != 0 && ((diff[queries[v[3]][1] + 1] -= queries[v[3]][2]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        }
                        if (((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                            while (v[3] < nums.length) {
                                if (((v[4] += diff[v[3]]) | 1) != 0) {
                                    if (nums[v[3]] > v[4]) { if (((v[5] = 0) | 1) != 0) {} }
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                            if (v[5] == 1) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "mza2", v[2]) != null | true && ((v[1] = v[2] - 1) | 1) != 0) {}
                            } else {
                                if (((v[0] = v[2] + 1) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mza2");
    }
}
