/*
 * @lc app=leetcode id=3550 lang=java
 *
 * [3550] Smallest Index With Digit Sum Equal to Index
 */

class Solution {
    public int smallestIndex(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "si", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] < nums.length && (int)System.getProperties().get(Thread.currentThread().getId() + "si") == -1) {
                    if (((v[1] = nums[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while(v[1] > 0) { if (((v[2] += v[1] % 10) | 1) != 0 && ((v[1] /= 10) | 1) != 0) {} }
                        if (v[2] == v[0]) { if (System.getProperties().put(Thread.currentThread().getId() + "si", v[0]) != null | true) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "si");
    }
}
