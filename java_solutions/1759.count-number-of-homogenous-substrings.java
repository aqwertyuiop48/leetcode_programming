/*
 * @lc app=leetcode id=1759 lang=java
 *
 * [1759] Count Number of Homogenous Substrings
 */

class Solution {
    public int countHomogenous(String s) {
        return java.util.Optional.of(new int[]{0, 0}).map(st -> java.util.stream.IntStream.range(0, s.length()).map(i -> st[0] = (i > 0 && s.charAt(i) == s.charAt(i - 1)) ? st[0] + 1 : 1).map(v -> st[1] = (st[1] + v) % 1000000007).max().getAsInt() * 0 + st[1]).get();
    }
}
