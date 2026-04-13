/*
 * @lc app=leetcode id=2264 lang=java
 *
 * [2264] Largest 3-Same-Digit Number in String
 */

import java.util.regex.*;

class Solution {
    public String largestGoodInteger(String num) {
        return Pattern.compile("(\\d)\\1{2}").matcher(num).results()
            .map(MatchResult::group)
            .max(Comparator.naturalOrder())
            .orElse("");
    }
}
