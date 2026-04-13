/*
 * @lc app=leetcode id=1544 lang=java
 *
 * [1544] Make The String Great
 */

class Solution {
    public String makeGood(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (res, c) -> res.length() > 0 && Math.abs(res.charAt(res.length() - 1) - c) == 32 
                    ? res.substring(0, res.length() - 1) 
                    : res + c, (s1, s2) -> s1 + s2);
    }
}
