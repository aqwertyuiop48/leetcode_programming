/*
 * @lc app=leetcode id=1486 lang=java
 *
 * [1486] XOR Operation in an Array
 */

class Solution {
    public int xorOperation(int n, int start) {
        return IntStream.range(0, n)
            .map(i -> start + 2 * i)
            .reduce(0, (a, b) -> a ^ b);
    }
}
