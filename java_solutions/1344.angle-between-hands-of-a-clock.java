/*
 * @lc app=leetcode id=1344 lang=java
 *
 * [1344] Angle Between Hands of a Clock
 */

class Solution {
    public double angleClock(int hour, int minutes) {
        return Math.min(Math.abs((hour % 12) * 30.0 + minutes * 0.5 - minutes * 6.0), 360.0 - Math.abs((hour % 12) * 30.0 + minutes * 0.5 - minutes * 6.0));
    }
}
