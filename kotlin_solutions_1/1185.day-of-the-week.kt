/*
 * @lc app=leetcode id=1185 lang=kotlin
 *
 * [1185] Day of the Week
 */

class Solution { fun dayOfTheWeek(day: Int, month: Int, year: Int): String = java.time.LocalDate.of(year, month, day).dayOfWeek.name.lowercase().replaceFirstChar { it.uppercase() } }