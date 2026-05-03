/*
 * @lc app=leetcode id=1222 lang=java
 *
 * [1222] Queens That Can Attack the King
 */

class Solution {
    public java.util.List<java.util.List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        if (new int[8][8] instanceof int[][] b && System.getProperties().put("qak", new java.util.ArrayList<java.util.List<Integer>>()) != null | true && new int[10] instanceof int[] v) {
            if (System.getProperties().get("qak") instanceof java.util.List ans && ((v[0] = 0) | 1) != 0) {
                while (v[0] < queens.length) { if (((b[queens[v[0]][0]][queens[v[0]++][1]] = 1) | 1) != 0) {} }
                if (new int[]{-1, -1, -1, 0, 0, 1, 1, 1} instanceof int[] dx && new int[]{-1, 0, 1, -1, 1, -1, 0, 1} instanceof int[] dy && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < 8) {
                        if (((v[1] = king[0] + dx[v[0]]) | 1) != 0 && ((v[2] = king[1] + dy[v[0]]) | 1) != 0) {
                            while (v[1] >= 0 && v[1] < 8 && v[2] >= 0 && v[2] < 8) {
                                if (b[v[1]][v[2]] == 1) { if (ans.add(java.util.Arrays.asList(v[1], v[2])) | true && ((v[1] = -1) | 1) != 0) {} }
                                else { if (((v[1] += dx[v[0]]) | 1) != 0 && ((v[2] += dy[v[0]]) | 1) != 0) {} }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (java.util.List<java.util.List<Integer>>) System.getProperties().get("qak");
    }
}
