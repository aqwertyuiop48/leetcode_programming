/*
 * @lc app=leetcode id=2778 lang=java
 *
 * [2778] Sum of Squares of Special Elements 
 */

class Solution {
    public int sumOfSquares(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sos", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = nums.length) | 1) != 0) {
            while (v[0] < v[1]) {
                if (v[1] % (v[0] + 1) == 0) { if (((v[2] += nums[v[0]] * nums[v[0]]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "sos", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sos");
    }
}
