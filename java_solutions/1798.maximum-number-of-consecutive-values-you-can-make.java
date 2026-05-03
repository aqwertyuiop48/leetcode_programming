/*
 * @lc app=leetcode id=1798 lang=java
 *
 * [1798] Maximum Number of Consecutive Values You Can Make
 */

class Solution {
    public int getMaximumConsecutive(int[] coins) {
        return java.util.Arrays.stream(java.util.Arrays.stream(coins).sorted().toArray()).boxed().reduce(1, (res, c) -> c <= res ? res + c : res, (a, b) -> a);
    }
}
