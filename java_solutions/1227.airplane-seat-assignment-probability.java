/*
 * @lc app=leetcode id=1227 lang=java
 *
 * [1227] Airplane Seat Assignment Probability
 */

class Solution {
    public double nthPersonGetsNthSeat(int n) {
        return n == 1 ? 1.0d : 0.5d;
    }
}
