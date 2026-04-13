/*
 * @lc app=leetcode id=1704 lang=java
 *
 * [1704] Determine if String Halves Are Alike
 */

class Solution {
    public boolean halvesAreAlike(String s) {
        return IntStream.range(0, s.length() / 2)
            .map(i -> ("aeiouAEIOU".indexOf(s.charAt(i)) >= 0 ? 1 : 0) 
                    - ("aeiouAEIOU".indexOf(s.charAt(i + s.length() / 2)) >= 0 ? 1 : 0))
            .sum() == 0;
    }
}
