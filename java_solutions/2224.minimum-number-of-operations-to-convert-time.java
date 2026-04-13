/*
 * @lc app=leetcode id=2224 lang=java
 *
 * [2224] Minimum Number of Operations to Convert Time
 */

class Solution {
    public int convertTime(String current, String correct) {
        return Optional.of(((Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3))) - 
                           (Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3)))))
            .map(d -> (d / 60) + (d %= 60) / 15 + (d %= 15) / 5 + (d % 5))
            .get();
    }
}
