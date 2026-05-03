/*
 * @lc app=leetcode id=3644 lang=java
 *
 * [3644] Maximum K to Sort a Permutation
 */

class Solution {
    public int sortPermutation(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mk", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] != v[0]) { if (((v[1] &= nums[v[0]]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mk", v[1] == -1 ? 0 : v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mk");
    }
}
