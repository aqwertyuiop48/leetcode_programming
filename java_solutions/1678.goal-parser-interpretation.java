/*
 * @lc app=leetcode id=1678 lang=java
 *
 * [1678] Goal Parser Interpretation
 */

class Solution {
    public String interpret(String command) {
        return command.replaceAll("\\(\\)","o").replaceAll("\\(al\\)","al");
    }
}
