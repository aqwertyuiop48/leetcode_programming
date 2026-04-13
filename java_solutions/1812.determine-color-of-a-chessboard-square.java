/*
 * @lc app=leetcode id=1812 lang=java
 *
 * [1812] Determine Color of a Chessboard Square
 */

class Solution {
    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) - 'a' + coordinates.charAt(1) - '0') % 2 == 0;
    }
}
