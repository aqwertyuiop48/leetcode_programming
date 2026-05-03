/*
 * @lc app=leetcode id=1626 lang=java
 *
 * [1626] Best Team With No Conflicts
 */

class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        return new Object[]{java.util.stream.IntStream.range(0, scores.length).mapToObj(i -> new int[]{ages[i], scores[i]}).sorted((x, y) -> x[0] != y[0] ? x[0] - y[0] : x[1] - y[1]).toArray(int[][]::new)} instanceof Object[] o && new int[scores.length] instanceof int[] dp ? java.util.stream.IntStream.range(0, scores.length).map(i -> dp[i] = ((int[][])o[0])[i][1] + java.util.stream.IntStream.range(0, i).filter(j -> ((int[][])o[0])[j][1] <= ((int[][])o[0])[i][1]).map(j -> dp[j]).max().orElse(0)).max().orElse(0) : 0;
    }
}
