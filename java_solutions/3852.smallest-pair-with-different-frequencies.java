/*
 * @lc app=leetcode id=3852 lang=java
 *
 * [3852] Smallest Pair With Different Frequencies
 */

class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        if (new int[105] instanceof int[] freq && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mdfp", new int[]{-1, -1}) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((freq[nums[v[0]]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[1] = 200) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] <= 100 && v[2] == 0) {
                    if (freq[v[0]] > 0) { if (((v[1] = v[0]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[2] == 1 && ((v[0] = v[1] + 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] <= 100 && v[2] == 0) {
                        if (freq[v[0]] > 0 && freq[v[0]] != freq[v[1]]) {
                            if (System.getProperties().put(Thread.currentThread().getId() + "mdfp", new int[]{v[1], v[0]}) != null | true && ((v[2] = 1) | 1) != 0) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "mdfp");
    }
}
