/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        return Optional.of(IntStream.of(g).sorted().toArray()).map(sortedG -> Optional.of(new int[1]).map(p -> (int) (IntStream.of(s).sorted().filter(cookie -> p[0] < sortedG.length && cookie >= sortedG[p[0]] && ++p[0] > 0).count() * 0 + p[0])).get()).get();
    }
}
