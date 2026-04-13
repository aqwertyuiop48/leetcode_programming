/*
 * @lc app=leetcode id=657 lang=java
 *
 * [657] Robot Return to Origin
 */

class Solution {
    public boolean judgeCircle(String moves) {
        return moves.chars().filter(c -> c == 'U').count() == moves.chars().filter(c -> c == 'D').count() && moves.chars().filter(c -> c == 'L').count() == moves.chars().filter(c -> c == 'R').count();
    }
}
