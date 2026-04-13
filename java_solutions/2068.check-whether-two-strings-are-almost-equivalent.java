/*
 * @lc app=leetcode id=2068 lang=java
 *
 * [2068] Check Whether Two Strings are Almost Equivalent
 */

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        return IntStream.range('a', 'z' + 1)
            .allMatch(c -> Math.abs(
                word1.chars().filter(ch -> ch == c).count() - 
                word2.chars().filter(ch -> ch == c).count()
            ) <= 3);
    }
}
