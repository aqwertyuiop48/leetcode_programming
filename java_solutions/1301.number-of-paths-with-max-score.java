/*
 * @lc app=leetcode id=1301 lang=java
 *
 * [1301] Number of Paths with Max Score
 */

class Solution {
    public int[] pathsWithMaxScore(java.util.List<String> board) {
        if (new int[]{0, board.size() - 1, board.get(0).length() - 1, -1, 0, 0, 0, 1000000007, board.size(), board.get(0).length()} instanceof int[] v && new int[board.size()][board.get(0).length()] instanceof int[][] dp && new int[board.size()][board.get(0).length()] instanceof int[][] ways) {
            while (v[0] < 3) {
                if (v[0] == 0) {
                    if (((dp[v[8] - 1][v[9] - 1] = 0) | 1) != 0 && ((ways[v[8] - 1][v[9] - 1] = 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                } else if (v[0] == 1) {
                    if (v[1] >= 0) {
                        if (((v[2] = v[9] - 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (System.setProperty("ans1", String.valueOf(dp[0][0])) != null || true) {
                            if (System.setProperty("ans2", String.valueOf(ways[0][0])) != null || true) {
                                if (((v[0] = 99) | 1) != 0) {}
                            }
                        }
                    }
                } else if (v[0] == 2) {
                    if (v[2] >= 0) {
                        if (board.get(v[1]).charAt(v[2]) != 'X' && !(v[1] == v[8] - 1 && v[2] == v[9] - 1)) {
                            if (((v[3] = -1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                if (v[1] + 1 < v[8] && ways[v[1] + 1][v[2]] > 0) {
                                    if (dp[v[1] + 1][v[2]] > v[3]) { if (((v[3] = dp[v[1] + 1][v[2]]) | 1) != 0 && ((v[4] = ways[v[1] + 1][v[2]]) | 1) != 0) {} }
                                    else if (dp[v[1] + 1][v[2]] == v[3]) { if (((v[4] = (v[4] + ways[v[1] + 1][v[2]]) % v[7]) | 1) != 0) {} }
                                }
                                if (v[2] + 1 < v[9] && ways[v[1]][v[2] + 1] > 0) {
                                    if (dp[v[1]][v[2] + 1] > v[3]) { if (((v[3] = dp[v[1]][v[2] + 1]) | 1) != 0 && ((v[4] = ways[v[1]][v[2] + 1]) | 1) != 0) {} }
                                    else if (dp[v[1]][v[2] + 1] == v[3]) { if (((v[4] = (v[4] + ways[v[1]][v[2] + 1]) % v[7]) | 1) != 0) {} }
                                }
                                if (v[1] + 1 < v[8] && v[2] + 1 < v[9] && ways[v[1] + 1][v[2] + 1] > 0) {
                                    if (dp[v[1] + 1][v[2] + 1] > v[3]) { if (((v[3] = dp[v[1] + 1][v[2] + 1]) | 1) != 0 && ((v[4] = ways[v[1] + 1][v[2] + 1]) | 1) != 0) {} }
                                    else if (dp[v[1] + 1][v[2] + 1] == v[3]) { if (((v[4] = (v[4] + ways[v[1] + 1][v[2] + 1]) % v[7]) | 1) != 0) {} }
                                }
                                if (v[3] != -1) {
                                    if (((dp[v[1]][v[2]] = v[3] + (board.get(v[1]).charAt(v[2]) == 'E' ? 0 : board.get(v[1]).charAt(v[2]) - '0')) | 1) != 0 && ((ways[v[1]][v[2]] = v[4]) | 1) != 0) {}
                                }
                            }
                        }
                        if (((v[2] -= 1) | 1) != 0) {}
                    } else {
                        if (((v[1] -= 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                }
            }
        }
        return new int[]{Integer.parseInt(System.getProperty("ans1", "0")), Integer.parseInt(System.getProperty("ans2", "0"))};
    }
}
