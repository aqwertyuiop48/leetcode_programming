/*
 * @lc app=leetcode id=1185 lang=java
 *
 * [1185] Day of the Week
 */

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        return Optional.of(java.time.LocalDate.of(year, month, day).getDayOfWeek().name())
            .map(s -> s.charAt(0) + s.substring(1).toLowerCase())
            .get();
    }
}
