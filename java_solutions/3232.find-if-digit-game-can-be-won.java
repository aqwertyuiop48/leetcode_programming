/*
 * @lc app=leetcode id=3232 lang=java
 *
 * [3232] Find if Digit Game Can Be Won
 */

class Solution {
    public boolean canAliceWin(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "caw", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] < 10) { if (((v[1] += nums[v[0]]) | 1) != 0) {} }
                    else { if (((v[2] += nums[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] != v[2] && System.getProperties().put(Thread.currentThread().getId() + "caw", true) != null | true) {}
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "caw");
    }
}
