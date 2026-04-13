/*
 * @lc app=leetcode id=2269 lang=java
 *
 * [2269] Find the K-Beauty of a Number
 */

class Solution {
    public int divisorSubstrings(int num, int k) {
        return (int) IntStream.range(0, String.valueOf(num).length() - k + 1)
            .mapToObj(i -> String.valueOf(num).substring(i, i + k))
            .map(Integer::parseInt)
            .filter(n -> n != 0 && num % n == 0)
            .count();
    }
}
