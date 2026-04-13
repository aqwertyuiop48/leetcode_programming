/*
 * @lc app=leetcode id=2399 lang=java
 *
 * [2399] Check Distances Between Same Letters
 */

class Solution {
    public boolean checkDistances(String s, int[] dist) {
        return IntStream.range(0, 26)
            .filter(i -> s.indexOf(i + 'a') != -1)
            .allMatch(i -> s.lastIndexOf(i + 'a') - s.indexOf(i + 'a') - 1 == dist[i]);
    }
}
