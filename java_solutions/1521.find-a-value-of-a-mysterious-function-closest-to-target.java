/*
 * @lc app=leetcode id=1521 lang=java
 *
 * [1521] Find a Value of a Mysterious Function Closest to Target
 */

class Solution {
    public int closestToTarget(int[] arr, int target) {
        if (new int[]{0, Integer.MAX_VALUE, 1, 0, 0, 0, 0} instanceof int[] v && new int[22] instanceof int[] prefix) {
            if (((prefix[0] = -1) | 1) != 0) {
                while (v[0] < arr.length) {
                    if (v[6] == 0) {
                        if (((v[5] = arr[v[0]]) | 1) != 0 && ((v[3] = 1) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                            if (((v[6] = 1) | 1) != 0) {}
                        }
                    } else if (v[6] == 1) {
                        if (v[4] < v[2]) {
                            if (prefix[v[3] - 1] != (prefix[v[4]] & v[5])) {
                                if (((prefix[v[3]] = prefix[v[4]] & v[5]) | 1) != 0 && ((v[1] = Math.min(v[1], Math.abs(prefix[v[3]] - target))) | 1) != 0) {
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        } else {
                            if (((v[6] = 2) | 1) != 0) {}
                        }
                    } else if (v[6] == 2) {
                        if (prefix[v[3] - 1] != v[5]) {
                            if (((prefix[v[3]] = v[5]) | 1) != 0 && ((v[1] = Math.min(v[1], Math.abs(v[5] - target))) | 1) != 0) {
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] = v[3]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {
                            if (((v[6] = 0) | 1) != 0) {}
                        }
                    }
                }
                if (((target = v[1]) | 1) != 0) {}
            }
        }
        return target;
    }
}
