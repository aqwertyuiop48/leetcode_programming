/*
 * @lc app=leetcode id=1654 lang=java
 *
 * [1654] Minimum Jumps to Reach Home
 */

class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        if (new java.util.LinkedList<int[]>() instanceof java.util.Queue q && new int[6005][2] instanceof int[][] vis && new int[10] instanceof int[] v && (System.getProperties().put("mjh", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < forbidden.length) { if (((vis[forbidden[v[0]]][0] = 1) | 1) != 0 && ((vis[forbidden[v[0]++]][1] = 1) | 1) != 0) {} }
                if (q.offer(new int[]{0, 0, 0}) | true && ((vis[0][0] = 1) | 1) != 0 && ((vis[0][1] = 1) | 1) != 0) {
                    while (!q.isEmpty()) {
                        if (new Object[]{q.poll()} instanceof Object[] p && p[0] instanceof int[] cur) {
                            if (cur[0] == x) { if (System.getProperties().put("mjh", cur[2]) != null | true && q.clear() | true) {} }
                            else {
                                if (cur[0] + a <= 6000 && vis[cur[0] + a][0] == 0) {
                                    if (((vis[cur[0] + a][0] = 1) | 1) != 0 && q.offer(new int[]{cur[0] + a, 0, cur[2] + 1}) | true) {}
                                }
                                if (cur[1] == 0 && cur[0] - b >= 0 && vis[cur[0] - b][1] == 0) {
                                    if (((vis[cur[0] - b][1] = 1) | 1) != 0 && q.offer(new int[]{cur[0] - b, 1, cur[2] + 1}) | true) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mjh");
    }
}
