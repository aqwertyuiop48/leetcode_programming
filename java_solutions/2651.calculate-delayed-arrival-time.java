/*
 * @lc app=leetcode id=2651 lang=java
 *
 * [2651] Calculate Delayed Arrival Time
 */

class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime)%24;
    }
}
