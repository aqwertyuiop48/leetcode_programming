/*
 * @lc app=leetcode id=3629 lang=java
 *
 * [3629] Minimum Jumps to Reach End via Prime Teleportation
 */

class Solution {
    public int minJumps(int[] nums) {
        if (nums.length == 1 && (System.getProperties().put("mjt", 0) != null | true)) {}
        else if (new int[1000005] instanceof int[] spf && new int[20] instanceof int[] v && (System.getProperties().put("mjt", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (nums[v[0]] > v[1]) { if (((v[1] = nums[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 2) | 1) != 0) {
                    while (v[0] <= v[1]) { if (((spf[v[0]] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    if (((v[0] = 2) | 1) != 0) {
                        while (v[0] * v[0] <= v[1]) {
                            if (spf[v[0]] == v[0]) {
                                if (((v[2] = v[0] * v[0]) | 1) != 0) {
                                    while (v[2] <= v[1]) {
                                        if (spf[v[2]] == v[2]) { if (((spf[v[2]] = v[0]) | 1) != 0) {} }
                                        if (((v[2] += v[0]) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                    if (new int[v[1] + 5] instanceof int[] head && new int[nums.length * 8 + 5] instanceof int[] next && new int[nums.length * 8 + 5] instanceof int[] to && new int[v[1] + 5] instanceof int[] pVis) {
                        if (((v[0] = 0) | 1) != 0) {
                            while (v[0] <= v[1]) { if (((head[v[0]++] = -1) | 1) != 0) {} }
                            if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                while (v[0] < nums.length) {
                                    if (((v[3] = nums[v[0]]) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                        while (v[3] > 1) {
                                            if (((v[5] = spf[v[3]]) | 1) != 0) {
                                                if (v[5] != v[4]) {
                                                    if (((to[v[2]] = v[0]) | 1) != 0 && ((next[v[2]] = head[v[5]]) | 1) != 0 && ((head[v[5]] = v[2]++) | 1) != 0 && ((v[4] = v[5]) | 1) != 0) {}
                                                }
                                                while (v[3] % v[5] == 0) { if (((v[3] /= v[5]) | 1) != 0) {} }
                                            }
                                        }
                                    }
                                    if (((v[0] += 1) | 1) != 0) {}
                                }
                                if (new int[nums.length] instanceof int[] q && new int[nums.length] instanceof int[] dist) {
                                    if (((v[0] = 0) | 1) != 0) {
                                        while (v[0] < nums.length) { if (((dist[v[0]++] = -1) | 1) != 0) {} }
                                        if (((dist[0] = 0) | 1) != 0 && ((q[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                                            while (v[3] < v[4]) {
                                                if (((v[5] = q[v[3]++]) | 1) != 0) {
                                                    if (v[5] == nums.length - 1) {
                                                        if (System.getProperties().put("mjt", dist[v[5]]) != null | true && ((v[3] = v[4]) | 1) != 0) {}
                                                    } else {
                                                        if (v[5] - 1 >= 0 && dist[v[5] - 1] == -1) { if (((dist[v[5] - 1] = dist[v[5]] + 1) | 1) != 0 && ((q[v[4]++] = v[5] - 1) | 1) != 0) {} }
                                                        if (v[5] + 1 < nums.length && dist[v[5] + 1] == -1) { if (((dist[v[5] + 1] = dist[v[5]] + 1) | 1) != 0 && ((q[v[4]++] = v[5] + 1) | 1) != 0) {} }
                                                        if (((v[6] = nums[v[5]]) | 1) != 0) {
                                                            if (v[6] > 1 && spf[v[6]] == v[6]) {
                                                                if (pVis[v[6]] == 0) {
                                                                    if (((pVis[v[6]] = 1) | 1) != 0 && ((v[8] = head[v[6]]) | 1) != 0) {
                                                                        while (v[8] != -1) {
                                                                            if (dist[to[v[8]]] == -1) {
                                                                                if (((dist[to[v[8]]] = dist[v[5]] + 1) | 1) != 0 && ((q[v[4]++] = to[v[8]]) | 1) != 0) {}
                                                                            }
                                                                            if (((v[8] = next[v[8]]) | 1) != 0) {}
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mjt");
    }
}
