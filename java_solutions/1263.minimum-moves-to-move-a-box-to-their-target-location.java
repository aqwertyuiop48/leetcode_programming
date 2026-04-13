/*
 * @lc app=leetcode id=1263 lang=java
 *
 * [1263] Minimum Moves to Move a Box to Their Target Location
 */

class Solution {
    public int minPushBox(char[][] grid) {
        return Arrays.stream(new int[][]{new int[]{-1}}).peek(res -> {
            if (new int[]{grid.length, grid[0].length, 0, 0, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0} instanceof int[] v && new int[]{-1, 0, 1, 0, -1} instanceof int[] dirs && new PriorityQueue<int[]>((a, b) -> Integer.compare(a[0], b[0])) instanceof PriorityQueue pq && new HashSet<Long>() instanceof HashSet vis) {
                while (v[2] < v[0]) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] < v[1]) {
                            if (grid[v[2]][v[3]] == 'S') { if (((v[4] = v[2]) | 1) != 0 && ((v[5] = v[3]) | 1) != 0) {} }
                            if (grid[v[2]][v[3]] == 'B') { if (((v[6] = v[2]) | 1) != 0 && ((v[7] = v[3]) | 1) != 0) {} }
                            if (grid[v[2]][v[3]] == 'T') { if (((v[8] = v[2]) | 1) != 0 && ((v[9] = v[3]) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (pq.offer(new int[]{0, v[6], v[7], v[4], v[5]}) || true) {
                    while (!pq.isEmpty() && res[0] == -1) {
                        if (new Object[]{pq.poll()} instanceof Object[] st && ((int[])st[0]) instanceof int[] curr) {
                            if (curr[1] == v[8] && curr[2] == v[9]) {
                                if (((res[0] = curr[0]) | 1) != 0) {}
                            } else {
                                if (vis.add((((long)curr[1]) << 24) | (((long)curr[2]) << 16) | (((long)curr[3]) << 8) | curr[4])) {
                                    if (((v[10] = 0) | 1) != 0) {
                                        while (v[10] < 4) {
                                            if (((v[11] = curr[3] + dirs[v[10]]) | 1) != 0 && ((v[12] = curr[4] + dirs[v[10] + 1]) | 1) != 0) {
                                                if (v[11] >= 0 && v[11] < v[0] && v[12] >= 0 && v[12] < v[1] && grid[v[11]][v[12]] != '#') {
                                                    if (v[11] == curr[1] && v[12] == curr[2]) {
                                                        if (((v[13] = curr[1] + dirs[v[10]]) | 1) != 0 && ((v[14] = curr[2] + dirs[v[10] + 1]) | 1) != 0) {
                                                            if (v[13] >= 0 && v[13] < v[0] && v[14] >= 0 && v[14] < v[1] && grid[v[13]][v[14]] != '#') {
                                                                if (pq.offer(new int[]{curr[0] + 1, v[13], v[14], v[11], v[12]}) || true) {}
                                                            }
                                                        }
                                                    } else {
                                                        if (pq.offer(new int[]{curr[0], curr[1], curr[2], v[11], v[12]}) || true) {}
                                                    }
                                                }
                                            }
                                            if (((v[10] += 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }).findFirst().orElse(null)[0];
    }
}
