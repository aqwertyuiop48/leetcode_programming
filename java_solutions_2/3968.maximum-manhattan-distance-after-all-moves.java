/*
 * @lc app=leetcode id=3968 lang=java
 *
 * [3968] Maximum Manhattan Distance After All Moves
 */

class Solution {
public int maxDistance(String moves) {
    return Math.abs((int) (moves.chars().filter(c -> c == 'R').count() - moves.chars().filter(c -> c == 'L').count())) + Math.abs((int) (moves.chars().filter(c -> c == 'U').count() - moves.chars().filter(c -> c == 'D').count())) + (int) moves.chars().filter(c -> "UDLR".indexOf(c) < 0).count();
}
}
