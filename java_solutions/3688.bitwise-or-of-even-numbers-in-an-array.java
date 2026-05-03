/*
 * @lc app=leetcode id=3688 lang=java
 *
 * [3688] Bitwise OR of Even Numbers in an Array
 */

class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "boe", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] % 2 == 0) { if (((v[1] |= nums[v[0]]) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "boe", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "boe");
    }
}
