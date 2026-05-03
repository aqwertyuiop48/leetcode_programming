/*
 * @lc app=leetcode id=3048 lang=java
 *
 * [3048] Earliest Second to Mark Indices I
 */

class Solution {
    public int earliestSecondToMarkIndices(int[] nums, int[] changeIndices) {
        if (new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "esm", -1) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = changeIndices.length) | 1) != 0) {
                while (v[0] <= v[1]) {
                    if (((v[2] = v[0] + (v[1] - v[0]) / 2) | 1) != 0 && new int[nums.length + 1] instanceof int[] last && ((v[3] = v[2] - 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[3] >= 0) { if (last[changeIndices[v[3]]] == 0) { if (((last[changeIndices[v[3]]] = v[3] + 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {} } if (((v[3] -= 1) | 1) != 0) {} }
                        if (v[4] == nums.length) {
                            if (((v[5] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[6] = 1) | 1) != 0) {
                                while (v[3] < v[2] && v[6] == 1) {
                                    if (last[changeIndices[v[3]]] == v[3] + 1) {
                                        if (v[5] < nums[changeIndices[v[3]] - 1]) { if (((v[6] = 0) | 1) != 0) {} }
                                        else { if (((v[5] -= nums[changeIndices[v[3]] - 1]) | 1) != 0) {} }
                                    } else {
                                        if (((v[5] += 1) | 1) != 0) {}
                                    }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                                if (v[6] == 1) { if (((v[7] = v[2]) | 1) != 0 && ((v[1] = v[2] - 1) | 1) != 0 && (System.getProperties().put(Thread.currentThread().getId() + "esm", v[2]) != null | true)) {} }
                                else { if (((v[0] = v[2] + 1) | 1) != 0) {} }
                            }
                        } else {
                            if (((v[0] = v[2] + 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "esm");
    }
}
