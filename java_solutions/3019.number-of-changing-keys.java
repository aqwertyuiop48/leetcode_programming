/*
 * @lc app=leetcode id=3019 lang=java
 *
 * [3019] Number of Changing Keys
 */

class Solution {
    public int countKeyChanges(String s) {
        return (int) IntStream.range(0, s.length() - 1)
            .filter(i -> Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i + 1)))
            .count();
    }
}
