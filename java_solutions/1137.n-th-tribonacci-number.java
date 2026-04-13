/*
 * @lc app=leetcode id=1137 lang=java
 *
 * [1137] N-th Tribonacci Number
 */

class Solution {
    public int tribonacci(int n) {
        return n == 0 ? 0 : n <= 2 ? 1 : Stream.iterate(new int[]{0, 1, 1}, i -> new int[]{i[1], i[2], i[0] + i[1] + i[2]})
            .limit(n - 1)
            .reduce((first, second) -> second)
            .map(state -> state[2])
            .orElse(0);
    }
}
