/*
 * @lc app=leetcode id=696 lang=java
 *
 * [696] Count Binary Substrings
 */

class Solution {
    public int countBinarySubstrings(String s) {
        return java.util.Arrays.stream(s.split("(?<=0)(?=1)|(?<=1)(?=0)")).mapToInt(String::length).toArray() instanceof int[] r
            ? java.util.stream.IntStream.range(1, r.length).map(i -> Math.min(r[i - 1], r[i])).sum() : 0;
    }
}
