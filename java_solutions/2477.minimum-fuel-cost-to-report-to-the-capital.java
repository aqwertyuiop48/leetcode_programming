/*
 * @lc app=leetcode id=2477 lang=java
 *
 * [2477] Minimum Fuel Cost to Report to the Capital
 */

class Solution {
    public long minimumFuelCost(int[][] roads, int seats) {
        if (new int[roads.length + 5] instanceof int[] h && new int[roads.length * 2 + 5] instanceof int[] to && new int[roads.length * 2 + 5] instanceof int[] ne && new int[15] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("mfc", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= roads.length) { if (((h[v[0]++] = -1) | 1) != 0) {} }
                if (new int[roads.length + 5] instanceof int[] deg && new int[roads.length + 5] instanceof int[] people && new int[roads.length + 5] instanceof int[] q && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < roads.length) {
                        if (((to[v[1]] = roads[v[0]][1]) | 1) != 0 && ((ne[v[1]] = h[roads[v[0]][0]]) | 1) != 0 && ((h[roads[v[0]][0]] = v[1]++) | 1) != 0 && ((deg[roads[v[0]][0]] += 1) | 1) != 0) {}
                        if (((to[v[1]] = roads[v[0]][0]) | 1) != 0 && ((ne[v[1]] = h[roads[v[0]][1]]) | 1) != 0 && ((h[roads[v[0]][1]] = v[1]++) | 1) != 0 && ((deg[roads[v[0]][1]] += 1) | 1) != 0) {}
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[0] <= roads.length) {
                            if (((people[v[0]] = 1) | 1) != 0) {
                                if (v[0] != 0 && deg[v[0]] == 1) { if (((q[v[3]++] = v[0]) | 1) != 0) {} }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        while (v[2] < v[3]) {
                            if (((v[4] = q[v[2]++]) | 1) != 0) {
                                if (((lv[0] += (people[v[4]] + seats - 1) / seats) | 1) != 0 && ((v[5] = h[v[4]]) | 1) != 0) {
                                    while (v[5] != -1) {
                                        if (deg[to[v[5]]] > 0) {
                                            if (((deg[to[v[5]]] -= 1) | 1) != 0 && ((people[to[v[5]]] += people[v[4]]) | 1) != 0) {
                                                if (deg[to[v[5]]] == 1 && to[v[5]] != 0) { if (((q[v[3]++] = to[v[5]]) | 1) != 0) {} }
                                            }
                                        }
                                        if (((v[5] = ne[v[5]]) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (System.getProperties().put("mfc", lv[0]) != null | true) {}
                    }
                }
            }
        }
        return (long) System.getProperties().get("mfc");
    }
}
