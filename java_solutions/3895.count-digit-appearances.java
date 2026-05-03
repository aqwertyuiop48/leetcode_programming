/*
 * @lc app=leetcode id=3895 lang=java
 *
 * [3895] Count Digit Appearances
 */

class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cda", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[2] = nums[v[0]]) | 1) != 0) {
                        if (v[2] == 0 && digit == 0) { if (((v[1] += 1) | 1) != 0) {} }
                        while (v[2] > 0) {
                            if (v[2] % 10 == digit) { if (((v[1] += 1) | 1) != 0) {} }
                            if (((v[2] /= 10) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cda", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cda");
    }
}
