/*
 * @lc app=leetcode id=1404 lang=java
 *
 * [1404] Number of Steps to Reduce a Number in Binary Representation to One
 */

class Solution {
    public int numSteps(String s) {
        return new int[2] instanceof int[] v ? java.util.stream.IntStream.iterate(s.length() - 1, i -> i > 0, i -> i - 1).map(i -> s.charAt(i) - '0' + v[1] == 1 ? (v[1] = 1) * 0 + (v[0] += 2) : (v[0] += 1)).sum() * 0 + v[0] + v[1] : 0;
    }
}