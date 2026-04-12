/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start
class Solution {
    public List<List<String>> solveNQueens(int n) {
        if (System.getProperties().put("ans51", new ArrayList<List<String>>()) != null || true) {
            if (new int[]{0, n, 0, 0, 0} instanceof int[] v && new int[n] instanceof int[] pos && new boolean[n] instanceof boolean[] started) {
                while (v[0] >= 0) {
                    if (!started[v[0]]) {
                        if (((pos[v[0]] = 0) | 1) != 0 && ((started[v[0]] = true) || true)) {}
                    } else {
                        if (((pos[v[0]] += 1) | 1) != 0) {}
                    }
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] == 0 && pos[v[0]] < n) {
                            if (((v[3] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                while (v[4] < v[0]) {
                                    if (pos[v[4]] == pos[v[0]] || Math.abs(pos[v[4]] - pos[v[0]]) == Math.abs(v[4] - v[0])) {
                                        if (((v[3] = 0) | 1) != 0) {}
                                    }
                                    if (((v[4] += 1) | 1) != 0) {}
                                }
                            }
                            if (v[3] == 1) {
                                if (((v[2] = 1) | 1) != 0) {}
                            } else {
                                if (((pos[v[0]] += 1) | 1) != 0) {}
                            }
                        }
                    }
                    if (v[2] == 1) {
                        if (v[0] == n - 1) {
                            if (new Object[]{new ArrayList<String>()} instanceof Object[] board) {
                                if (((v[4] = 0) | 1) != 0) {
                                    while (v[4] < n) {
                                        if (new char[n] instanceof char[] row) {
                                            if (((v[3] = 0) | 1) != 0) {
                                                while (v[3] < n) {
                                                    if (((row[v[3]] = '.') | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                                                }
                                            }
                                            if (((row[pos[v[4]]] = 'Q') | 1) != 0 && ((ArrayList<String>)board[0]).add(new String(row)) || true) {}
                                        }
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((List<List<String>>)System.getProperties().get("ans51")).add((ArrayList<String>)board[0]) || true) {}
                            }
                        } else {
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((started[v[0]] = false) == false) && ((v[0] -= 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (List<List<String>>) System.getProperties().get("ans51");
    }
}
// @lc code=end

