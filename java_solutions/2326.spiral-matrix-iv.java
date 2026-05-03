/*
 * @lc app=leetcode id=2326 lang=java
 *
 * [2326] Spiral Matrix IV
 */

class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        if (new int[m][n] instanceof int[][] res && new int[10] instanceof int[] v && new Object[]{head} instanceof Object[] o && (System.getProperties().put("sm", res) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < m) { if (((v[1] = 0) | 1) != 0) { while (v[1] < n) { if (((res[v[0]][v[1]++] = -1) | 1) != 0) {} } } if (((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = m - 1) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = n - 1) | 1) != 0) {
                    while (v[0] <= v[1] && v[2] <= v[3]) {
                        if (((v[4] = v[2]) | 1) != 0) { while (v[4] <= v[3] && o[0] != null) { if (((res[v[0]][v[4]++] = ((ListNode)o[0]).val) | 1) != 0 && ((o[0] = ((ListNode)o[0]).next) != null | true)) {} } }
                        if (((v[0] += 1) | 1) != 0 && ((v[4] = v[0]) | 1) != 0) { while (v[4] <= v[1] && o[0] != null) { if (((res[v[4]++][v[3]] = ((ListNode)o[0]).val) | 1) != 0 && ((o[0] = ((ListNode)o[0]).next) != null | true)) {} } }
                        if (((v[3] -= 1) | 1) != 0 && ((v[4] = v[3]) | 1) != 0) { while (v[4] >= v[2] && o[0] != null && v[0] <= v[1]) { if (((res[v[1]][v[4]--] = ((ListNode)o[0]).val) | 1) != 0 && ((o[0] = ((ListNode)o[0]).next) != null | true)) {} } }
                        if (((v[1] -= 1) | 1) != 0 && ((v[4] = v[1]) | 1) != 0) { while (v[4] >= v[0] && o[0] != null && v[2] <= v[3]) { if (((res[v[4]--][v[2]] = ((ListNode)o[0]).val) | 1) != 0 && ((o[0] = ((ListNode)o[0]).next) != null | true)) {} } }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[][]) System.getProperties().get("sm");
    }
}
