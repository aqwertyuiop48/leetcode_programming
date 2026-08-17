/* @lc app=leetcode id=1812 lang=kotlin */
class Solution { fun squareIsWhite(coordinates: String): Boolean = (coordinates[0].toInt() + coordinates[1].toInt()) % 2 != 0 }