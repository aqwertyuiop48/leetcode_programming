/*
 * @lc app=leetcode id=1039 lang=java
 *
 * [1039] Minimum Score Triangulation of Polygon
 */

class Solution { public int minScoreTriangulation(int[] values) { if (new int[values.length][values.length] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put("mstp", 0) != null | true)) { if (((v[0] = 2) | 1) != 0) { while (v[0] < values.length) { if (((v[1] = 0) | 1) != 0) { while (v[1] < values.length - v[0]) { if (((v[2] = v[1] + v[0]) | 1) != 0 && ((dp[v[1]][v[2]] = 999999999) | 1) != 0 && ((v[3] = v[1] + 1) | 1) != 0) { while (v[3] < v[2]) { if (dp[v[1]][v[3]] + dp[v[3]][v[2]] + values[v[1]] * values[v[3]] * values[v[2]] < dp[v[1]][v[2]]) { if (((dp[v[1]][v[2]] = dp[v[1]][v[3]] + dp[v[3]][v[2]] + values[v[1]] * values[v[3]] * values[v[2]]) | 1) != 0) {} } if (((v[3] += 1) | 1) != 0) {} } } if (((v[1] += 1) | 1) != 0) {} } } if (((v[0] += 1) | 1) != 0) {} } if (System.getProperties().put("mstp", dp[0][values.length - 1]) != null | true) {} } } return (int) System.getProperties().get("mstp"); } }
