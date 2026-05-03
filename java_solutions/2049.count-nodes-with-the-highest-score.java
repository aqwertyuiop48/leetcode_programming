/*
 * @lc app=leetcode id=2049 lang=java
 *
 * [2049] Count Nodes With the Highest Score
 */

class Solution {
    public int countHighestScoreNodes(int[] parents) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "chn", 0) != null | true) && ((v[0] = parents.length) | 1) != 0) {
            if (new int[v[0]] instanceof int[] head && new int[v[0]] instanceof int[] to && new int[v[0]] instanceof int[] next && ((v[1] = 0) | 1) != 0) {
                while (v[1] < v[0]) { if (((head[v[1]] = -1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                if (((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[1] < v[0]) { if (((to[v[2]] = v[1]) | 1) != 0 && ((next[v[2]] = head[parents[v[1]]]) | 1) != 0 && ((head[parents[v[1]]] = v[2]++) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    if (new int[v[0]] instanceof int[] out && new int[v[0]] instanceof int[] size && new int[v[0]] instanceof int[] q && ((v[1] = 1) | 1) != 0) {
                        while (v[1] < v[0]) { if (((out[parents[v[1]]] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                        if (((v[1] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                            while (v[1] < v[0]) { if (out[v[1]] == 0) { if (((q[v[3]++] = v[1]) | 1) != 0) {} } if (((v[1] += 1) | 1) != 0) {} }
                            if (((v[1] = 0) | 1) != 0) {
                                while (v[1] < v[3]) {
                                    if (((v[4] = q[v[1]]) | 1) != 0 && ((size[v[4]] += 1) | 1) != 0 && v[4] != 0) {
                                        if (((size[parents[v[4]]] += size[v[4]]) | 1) != 0 && ((out[parents[v[4]]] -= 1) | 1) != 0 && out[parents[v[4]]] == 0) { if (((q[v[3]++] = parents[v[4]]) | 1) != 0) {} }
                                    }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                                if (new long[1] instanceof long[] maxS && ((maxS[0] = -1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                                    while (v[1] < v[0]) {
                                        if (((v[5] = head[v[1]]) | 1) != 0 && new long[]{1} instanceof long[] s) {
                                            while (v[5] != -1) { if (((s[0] *= size[to[v[5]]]) | 1) != 0 && ((v[5] = next[v[5]]) | 1) != 0) {} }
                                            if (v[0] - size[v[1]] > 0) { if (((s[0] *= (v[0] - size[v[1]])) | 1) != 0) {} }
                                            if (s[0] > maxS[0]) { if (((maxS[0] = s[0]) | 1) != 0 && ((v[6] = 1) | 1) != 0) {} }
                                            else if (s[0] == maxS[0]) { if (((v[6] += 1) | 1) != 0) {} }
                                        }
                                        if (((v[1] += 1) | 1) != 0) {}
                                    }
                                    if (System.getProperties().put(Thread.currentThread().getId() + "chn", v[6]) != null | true) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "chn");
    }
}
