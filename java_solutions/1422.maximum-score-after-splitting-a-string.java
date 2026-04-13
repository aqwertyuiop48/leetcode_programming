/*
 * @lc app=leetcode id=1422 lang=java
 *
 * [1422] Maximum Score After Splitting a String
 */

class Solution {
    public int maxScore(String s) {
        return IntStream.range(1, s.length())
            .map(i -> (int) s.substring(0, i).chars().filter(c -> c == '0').count() 
                      + (int) s.substring(i).chars().filter(c -> c == '1').count())
            .max()
            .orElse(0);
    }
}
