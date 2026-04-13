/*
 * @lc app=leetcode id=397 lang=java
 *
 * [397] Integer Replacement
 */

class Solution {
    public int integerReplacement(int n) {
        return (int) Stream.iterate(new long[]{(long)n, 0}, p -> p[0] % 2 == 0 ? new long[]{p[0] / 2, p[1] + 1} : (p[0] == 3 || p[0] % 4 == 1 ? new long[]{p[0] - 1, p[1] + 1} : new long[]{p[0] + 1, p[1] + 1})).filter(p -> p[0] == 1).findFirst().get()[1];
    }
}
