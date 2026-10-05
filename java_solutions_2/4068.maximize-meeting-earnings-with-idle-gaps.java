/*
 * @lc app=leetcode id=4068 lang=java
 *
 * [4068] Maximize Meeting Earnings with Idle Gaps
 */

class Solution {
    public long maxEarnings(int[][] meetings) {
        return java.util.Arrays.stream(meetings).sorted(java.util.Comparator.comparingInt(a -> a[1])).collect(() -> new long[][]{new long[meetings.length + 1], new long[meetings.length + 1], {1, 0}}, (acc, m) -> java.util.Optional.of(m[2] + Math.max(0, m[0] + acc[1][(acc[0][0] = -1) + (acc[1][0] = Long.MIN_VALUE / 2) == 0 ? 0 : java.util.Arrays.binarySearch(acc[0], 0, (int) acc[2][0], (long) m[0] + 1) < 0 ? ~java.util.Arrays.binarySearch(acc[0], 0, (int) acc[2][0], (long) m[0] + 1) - 1 : java.util.Arrays.binarySearch(acc[0], 0, (int) acc[2][0], (long) m[0] + 1) - 1])).filter(r -> (acc[2][1] = Math.max(acc[2][1], r)) > -1).filter(r -> r - m[1] > acc[1][(int) acc[2][0] - 1]).ifPresent(r -> acc[1][(int) (acc[0][(int) acc[2][0]] = m[1]) * 0 + (int) acc[2][0]++] = r - m[1]), (a, b) -> {})[2][1];
    }
}
