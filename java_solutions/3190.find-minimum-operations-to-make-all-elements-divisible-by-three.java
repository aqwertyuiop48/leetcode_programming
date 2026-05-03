/*
 * @lc app=leetcode id=3190 lang=java
 *
 * [3190] Find Minimum Operations to Make All Elements Divisible by Three
 */

class Solution {
    public int minimumOperations(int[] nums) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mno", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] % 3 != 0) {
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mno", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mno");
    }
}
