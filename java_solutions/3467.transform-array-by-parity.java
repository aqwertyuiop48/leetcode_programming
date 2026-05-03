/*
 * @lc app=leetcode id=3467 lang=java
 *
 * [3467] Transform Array by Parity
 */

class Solution {
    public int[] transformArray(int[] nums) {
        if (new int[nums.length] instanceof int[] res && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "tap", res) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] % 2 == 0) { if (((v[1] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (v[0] >= v[1]) { if (((res[v[0]] = 1) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "tap");
    }
}
