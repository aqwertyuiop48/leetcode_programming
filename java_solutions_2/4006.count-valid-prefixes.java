/*
 * @lc app=leetcode id=4006 lang=java
 *
 * [4006] Count Valid Prefixes
 */

class Solution {
    public int countValidPrefixes(String s) {
        return s.chars()
            .boxed()
            .reduce(new int[]{0, 0}, (acc, ch) -> java.util.stream.Stream.of(acc[0] + (ch == '1' ? 1 : -1))
                .map(cnt -> new int[]{cnt, acc[1] + (Math.abs(cnt) <= 1 ? 1 : 0)})
                .findFirst().get(), (a, b) -> a)[1];
    }
}
