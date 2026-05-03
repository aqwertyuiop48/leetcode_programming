/*
 * @lc app=leetcode id=1360 lang=java
 *
 * [1360] Number of Days Between Two Dates
 */

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return (int) Math.abs(java.time.LocalDate.parse(date1).toEpochDay() - java.time.LocalDate.parse(date2).toEpochDay());
    }
}
