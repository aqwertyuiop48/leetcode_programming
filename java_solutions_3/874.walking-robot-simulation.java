/*
 * @lc app=leetcode id=874 lang=java
 *
 * [874] Walking Robot Simulation
 */

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        return java.util.Arrays.stream(obstacles).map(o -> (long) o[0] * 100000 + o[1]).collect(java.util.stream.Collectors.toSet()) instanceof java.util.Set<Long> obs && new int[4] instanceof int[] s
            && java.util.Arrays.stream(commands).peek(c -> {
                if (c < 0 ? (s[2] = (s[2] + (c == -1 ? 1 : 3)) % 4) >= 0
                    : java.util.stream.IntStream.range(0, c).takeWhile(k -> !obs.contains((s[0] + new int[]{0, 1, 0, -1}[s[2]]) * 100000L + s[1] + new int[]{1, 0, -1, 0}[s[2]]))
                        .allMatch(k -> (s[3] = Math.max(s[3], (s[0] += new int[]{0, 1, 0, -1}[s[2]]) * s[0] + (s[1] += new int[]{1, 0, -1, 0}[s[2]]) * s[1])) >= 0)) {}
            }).allMatch(x -> true)
            ? s[3] : 0;
    }
}
