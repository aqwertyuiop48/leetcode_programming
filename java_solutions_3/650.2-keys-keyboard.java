/*
 * @lc app=leetcode id=650 lang=java
 *
 * [650] 2 Keys Keyboard
 */

class Solution {
    public int minSteps(int n) {
        return n == 1 ? 0 : java.util.stream.IntStream.rangeClosed(2, n).filter(d -> n % d == 0).limit(1).map(d -> d + minSteps(n / d)).sum();
    }
}
