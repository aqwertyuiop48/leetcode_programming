/*
 * @lc app=leetcode id=3861 lang=java
 *
 * [3861] Minimum Capacity Box
 */

class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mcb", -1) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 2000000000) | 1) != 0 && ((v[2] = -1) | 1) != 0) {
            while (v[0] < capacity.length) {
                if (capacity[v[0]] >= itemSize && capacity[v[0]] < v[1]) {
                    if (((v[1] = capacity[v[0]]) | 1) != 0 && ((v[2] = v[0]) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mcb", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mcb");
    }
}
