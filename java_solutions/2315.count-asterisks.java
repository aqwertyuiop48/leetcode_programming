/*
 * @lc app=leetcode id=2315 lang=java
 *
 * [2315] Count Asterisks
 */

class Solution {
    public int countAsterisks(String s) {
        return IntStream.range(0, s.split("\\|", -1).length)
            .filter(i -> i % 2 == 0)
            .map(i -> (int) s.split("\\|", -1)[i].chars().filter(c -> c == '*').count())
            .sum();
    }
}
