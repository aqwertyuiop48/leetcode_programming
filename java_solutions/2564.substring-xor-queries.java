/*
 * @lc app=leetcode id=2564 lang=java
 *
 * [2564] Substring XOR Queries
 */

class Solution {
    public int[][] substringXorQueries(String s, int[][] queries) {
        if (new int[queries.length][2] instanceof int[][] ans && new int[10] instanceof int[] v && System.getProperties().put("sxq", new java.util.HashMap<Integer, int[]>()) != null | true) {
            if (System.getProperties().get("sxq") instanceof java.util.Map m && ((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] < 31 && v[0] + v[1] < s.length()) {
                            if (((v[2] = (v[2] << 1) | (s.charAt(v[0] + v[1]) - '0')) | 1) != 0) {
                                if (!m.containsKey(v[2])) { if (m.put(v[2], new int[]{v[0], v[0] + v[1]}) == null | true) {} }
                            }
                            if (s.charAt(v[0]) == '0') { if (((v[1] = 32) | 1) != 0) {} }
                            else { if (((v[1] += 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < queries.length) {
                        if (m.containsKey(queries[v[0]][0] ^ queries[v[0]][1])) { if (((ans[v[0]] = (int[])m.get(queries[v[0]][0] ^ queries[v[0]][1])) != null | true)) {} }
                        else { if (((ans[v[0]] = new int[]{-1, -1}) != null | true)) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
            if (System.getProperties().put("sxqa", ans) != null | true) {}
        }
        return (int[][]) System.getProperties().get("sxqa");
    }
}
