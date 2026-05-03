/*
 * @lc app=leetcode id=1154 lang=java
 *
 * [1154] Day of the Year
 */

class Solution {
    public int dayOfYear(String date) {
        return java.time.LocalDate.parse(date).getDayOfYear();
    }
}
