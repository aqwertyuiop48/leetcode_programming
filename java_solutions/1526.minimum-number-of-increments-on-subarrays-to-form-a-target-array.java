/*
 * @lc app=leetcode id=1526 lang=java
 *
 * [1526] Minimum Number of Increments on Subarrays to Form a Target Array
 */

class Solution {
    public int minNumberOperations(int[] target) {
        if (new int[]{1, target[0]} instanceof int[] v) {
            while (v[0] < target.length) {
                if (target[v[0]] > target[v[0] - 1]) {
                    if (((v[1] += target[v[0]] - target[v[0] - 1]) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((target[0] = v[1]) | 1) != 0) {}
        }
        return target[0];
    }
}
