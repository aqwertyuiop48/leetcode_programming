/* @lc app=leetcode id=2037 lang=kotlin */
class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int = seats.sorted().zip(students.sorted()).sumOf { (a, b) -> Math.abs(a - b) }
}