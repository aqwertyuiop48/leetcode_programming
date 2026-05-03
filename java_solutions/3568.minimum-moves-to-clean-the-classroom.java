/*
 * @lc app=leetcode id=3568 lang=java
 *
 * [3568] Minimum Moves to Clean the Classroom
 */

class Solution {
    public int minMoves(String[] classroom, int energy) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap rcm && new int[classroom.length][classroom[0].length()][1 << 10] instanceof int[][][] be && new java.util.LinkedList<int[]>() instanceof java.util.LinkedList q && new int[]{0, -1, 0, 1, 0} instanceof int[] dirs && (System.getProperties().put(Thread.currentThread().getId() + "mmcc", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < classroom.length) {
                    if (((v[2] = 0) | 1) != 0) {
                        while (v[2] < classroom[0].length()) {
                            if (((v[4] = 0) | 1) != 0) {
                                while (v[4] < (1 << 10)) { if (((be[v[0]][v[2]][v[4]++] = -1) | 1) != 0) {} }
                            }
                            if (classroom[v[0]].charAt(v[2]) == 'L') {
                                if (rcm.put(v[0] * 100 + v[2], v[1]++) == null | true) {}
                            } else if (classroom[v[0]].charAt(v[2]) == 'S') {
                                if (((v[5] = v[0]) | 1) != 0 && ((v[6] = v[2]) | 1) != 0) {}
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[7] = (1 << v[1]) - 1) | 1) != 0 && q.offer(new int[]{v[5], v[6], 0, energy, 0}) | true) {
                while (!q.isEmpty() && (int)System.getProperties().get(Thread.currentThread().getId() + "mmcc") == -1) {
                    if (q.poll() instanceof int[] s) {
                        if (((v[8] = classroom[s[0]].charAt(s[1]) == 'L' ? (s[2] | (1 << (int)rcm.get(s[0] * 100 + s[1]))) : s[2]) | 1) != 0) {
                            if (v[8] == v[7]) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "mmcc", s[4]) != null | true) {}
                            } else {
                                if (((v[9] = classroom[s[0]].charAt(s[1]) == 'R' ? energy - 1 : s[3] - 1) | 1) != 0 && v[9] >= 0) {
                                    if (((v[2] = 0) | 1) != 0) {
                                        while (v[2] < 4) {
                                            if (((v[0] = s[0] + dirs[v[2]]) | 1) != 0 && ((v[1] = s[1] + dirs[v[2] + 1]) | 1) != 0) {
                                                if (v[0] >= 0 && v[0] < classroom.length && v[1] >= 0 && v[1] < classroom[0].length() && classroom[v[0]].charAt(v[1]) != 'X') {
                                                    if (be[v[0]][v[1]][v[8]] < v[9]) {
                                                        if (((be[v[0]][v[1]][v[8]] = v[9]) | 1) != 0 && q.offer(new int[]{v[0], v[1], v[8], v[9], s[4] + 1}) | true) {}
                                                    }
                                                }
                                            }
                                            if (((v[2] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mmcc");
    }
}
