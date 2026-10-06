/*
 * @lc app=leetcode id=942 lang=java
 *
 * [942] DI String Match
 */

class Solution {
    public int[] diStringMatch(String s) {
        return new int[]{0, s.length()} instanceof int[] p
            ? java.util.stream.IntStream.concat(s.chars().map(c -> c == 'I' ? p[0]++ : p[1]--), java.util.stream.IntStream.of(0).map(z -> p[0])).toArray() : null;
    }
}
