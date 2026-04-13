/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

class Solution {
    public int hammingWeight(int n) {
        return (int) Arrays.stream(Integer.toString(n,2).split("")).filter(i->i.equals("1")).count();
    }
}
