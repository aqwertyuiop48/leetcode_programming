/*
 * @lc app=leetcode id=2279 lang=java
 *
 * [2279] Maximum Bags With Full Capacity of Rocks
 */

class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mb", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < capacity.length) { if (((capacity[v[0]] -= rocks[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if ((capacity = java.util.Arrays.stream(capacity).sorted().toArray()) != null && ((v[0] = 0) | 1) != 0 && ((v[1] = additionalRocks) | 1) != 0) {
                while (v[0] < capacity.length && v[1] >= capacity[v[0]]) {
                    if (((v[1] -= capacity[v[0]]) | 1) != 0 && ((v[2] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mb", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mb");
    }
}
