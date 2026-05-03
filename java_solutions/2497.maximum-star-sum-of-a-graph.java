/*
 * @lc app=leetcode id=2497 lang=java
 *
 * [2497] Maximum Star Sum of a Graph
 */

class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        if (System.getProperties().put("mss_a", new java.util.ArrayList[vals.length]) != null | true && System.getProperties().get("mss_a") instanceof java.util.List[] a && new int[10] instanceof int[] v && (System.getProperties().put("mss", -999999999) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < vals.length) { if (((a[v[0]++] = new java.util.ArrayList<Integer>()) != null | true)) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < edges.length) {
                        if (vals[edges[v[0]][1]] > 0) { if (a[edges[v[0]][0]].add(vals[edges[v[0]][1]]) | true) {} }
                        if (vals[edges[v[0]][0]] > 0) { if (a[edges[v[0]][1]].add(vals[edges[v[0]][0]]) | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 0) | 1) != 0) {
                        while (v[0] < vals.length) {
                            if (((a[v[0]] = (java.util.List)((java.util.List)a[v[0]]).stream().sorted(java.util.Collections.reverseOrder()).collect(java.util.stream.Collectors.toList())) != null | true) && ((v[1] = vals[v[0]]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                while (v[2] < Math.min(k, a[v[0]].size())) { if (((v[1] += (int)a[v[0]].get(v[2]++)) | 1) != 0) {} }
                                if (v[1] > (int)System.getProperties().get("mss")) { if (System.getProperties().put("mss", v[1]) != null | true) {} }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mss");
    }
}
