/*
 * @lc app=leetcode id=3954 lang=java
 *
 * [3954] Sum of Compatible Numbers in Range I
 */

class Solution {
public int sumOfGoodIntegers(int n, int k) {
    return IntStream.rangeClosed(Math.max(n - k, 1), n + k).filter(i -> (n & i) == 0).sum();
}
}
