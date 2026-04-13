/*
 * @lc app=leetcode id=830 lang=java
 *
 * [830] Positions of Large Groups
 */

// semicolons : 1
import java.util.regex.*;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        return Pattern.compile("(.)\\1*").matcher(s).results()
            .filter(m -> m.end() - m.start() >= 3)
            .map(m -> Arrays.asList(m.start(), m.end() - 1))
            .toList();
    }
}
