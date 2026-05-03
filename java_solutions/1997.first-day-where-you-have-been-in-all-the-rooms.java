/*
 * @lc app=leetcode id=1997 lang=java
 *
 * [1997] First Day Where You Have Been in All the Rooms
 */

class Solution {
    public int firstDayBeenInAllRooms(int[] nextVisit) {
        return (int) java.util.stream.IntStream.range(1, nextVisit.length).collect(() -> new long[nextVisit.length], (dp, i) -> dp[i] = (dp[i - 1] * 2 - dp[nextVisit[i - 1]] + 1000000009) % 1000000007, (a, b) -> {})[nextVisit.length - 1];
    }
}
