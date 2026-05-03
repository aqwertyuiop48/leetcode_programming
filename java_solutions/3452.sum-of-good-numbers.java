/*
 * @lc app=leetcode id=3452 lang=java
 *
 * [3452] Sum of Good Numbers
 */

class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sgn", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (((v[2] = 1) | 1) != 0) {
                        if (v[0] >= k && nums[v[0]] <= nums[v[0] - k]) { if (((v[2] = 0) | 1) != 0) {} }
                        if (v[0] + k < nums.length && nums[v[0]] <= nums[v[0] + k]) { if (((v[2] = 0) | 1) != 0) {} }
                        if (v[2] == 1) { if (((v[1] += nums[v[0]]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "sgn", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sgn");
    }
}
