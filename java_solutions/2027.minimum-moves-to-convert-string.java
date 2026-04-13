/*
 * @lc app=leetcode id=2027 lang=java
 *
 * [2027] Minimum Moves to Convert String
 */

class Solution {
    public int minimumMoves(String s) {
        return IntStream.range(0, s.length())
            .collect(() -> new int[]{0, -1}, 
                     (st, i) -> st[0] = (s.charAt(i) == 'X' && i > st[1]) ? (st[1] = i + 2) * 0 + st[0] + 1 : st[0], 
                     (a, b) -> {})[0];
    }
}
