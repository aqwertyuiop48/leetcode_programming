/*
 * @lc app=leetcode id=3871 lang=java
 *
 * [3871] Count Commas in Range II
 */

class Solution {
    public long countCommas(long n) {
        return java.util.stream.LongStream.iterate(1000L, t -> t <= n && t > 0, t -> t * 1000L).map(t -> n - t + 1).sum();
    }
}
