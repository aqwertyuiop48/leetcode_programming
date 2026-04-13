/*
 * @lc app=leetcode id=1649 lang=java
 *
 * [1649] Create Sorted Array through Instructions
 */

class Solution {
    public int createSortedArray(int[] instructions) {
        if (new int[]{0, instructions.length, 0, 0, 0, 0, 0, 0} instanceof int[] v && new int[100005] instanceof int[] bit) {
            while (v[0] < v[1]) {
                if (((v[3] = 0) | 1) != 0 && ((v[5] = instructions[v[0]] - 1) | 1) != 0) {
                    while (v[5] > 0) {
                        if (((v[3] += bit[v[5]]) | 1) != 0 && ((v[5] -= v[5] & -v[5]) | 1) != 0) {}
                    }
                }
                if (((v[4] = 0) | 1) != 0 && ((v[5] = instructions[v[0]]) | 1) != 0) {
                    while (v[5] > 0) {
                        if (((v[4] += bit[v[5]]) | 1) != 0 && ((v[5] -= v[5] & -v[5]) | 1) != 0) {}
                    }
                }
                if (((v[4] = v[6] - v[4]) | 1) != 0 && ((v[2] = (v[2] + Math.min(v[3], v[4])) % 1000000007) | 1) != 0 && ((v[5] = instructions[v[0]]) | 1) != 0) {
                    while (v[5] <= 100000) {
                        if (((bit[v[5]] += 1) | 1) != 0 && ((v[5] += v[5] & -v[5]) | 1) != 0) {}
                    }
                }
                if (((v[6] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (((instructions[0] = v[2]) | 1) != 0) {}
        }
        return instructions[0];
    }
}
