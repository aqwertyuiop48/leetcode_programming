/*
 * @lc app=leetcode id=1184 lang=java
 *
 * [1184] Distance Between Bus Stops
 */

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        return Math.min(Arrays.stream(distance, Math.min(start,destination), Math.max(start,destination)).sum(),
                Arrays.stream(distance).sum() - Arrays.stream(distance, Math.min(start,destination), Math.max(start,destination)).sum());

    }
}
