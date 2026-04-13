/*
 * @lc app=leetcode id=2609 lang=java
 *
 * [2609] Find the Longest Balanced Substring of a Binary String
 */

import java.util.regex.*;

class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        return Pattern.compile("0+1+").matcher(s).results()
            .map(m -> m.group())
            .mapToInt(g -> Math.min(g.lastIndexOf('0') + 1, g.length() - g.lastIndexOf('0') - 1) * 2)
            .max()
            .orElse(0);
    }
}
