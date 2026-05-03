/*
 * @lc app=leetcode id=1401 lang=java
 *
 * [1401] Circle and Rectangle Overlapping
 */

class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        return Math.pow(xCenter - Math.max(x1, Math.min(xCenter, x2)), 2) + Math.pow(yCenter - Math.max(y1, Math.min(yCenter, y2)), 2) <= radius * radius;
    }
}
