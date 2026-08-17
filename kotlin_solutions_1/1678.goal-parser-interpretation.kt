/*
 * @lc app=leetcode id=1678 lang=kotlin
 *
 * [1678] Goal Parser Interpretation
 */

class Solution { fun interpret(command: String): String = command.replace("()", "o").replace("(al)", "al") }