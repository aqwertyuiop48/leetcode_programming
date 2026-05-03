/*
 * @lc app=leetcode id=1306 lang=java
 *
 * [1306] Jump Game III
 */

class Solution {
    public boolean canReach(int[] arr, int start) {
        if (new int[arr.length] instanceof int[] vis && new int[arr.length + 5] instanceof int[] q && new int[10] instanceof int[] v && (System.getProperties().put("cg", false) != null | true)) {
            if (((q[0] = start) | 1) != 0 && ((vis[start] = 1) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                while (v[0] < v[1]) {
                    if (((v[2] = q[v[0]++]) | 1) != 0) {
                        if (arr[v[2]] == 0) { if (System.getProperties().put("cg", true) != null | true && ((v[0] = v[1]) | 1) != 0) {} }
                        else {
                            if (v[2] + arr[v[2]] < arr.length && vis[v[2] + arr[v[2]]] == 0) { if (((vis[v[2] + arr[v[2]]] = 1) | 1) != 0 && ((q[v[1]++] = v[2] + arr[v[2]]) | 1) != 0) {} }
                            if (v[2] - arr[v[2]] >= 0 && vis[v[2] - arr[v[2]]] == 0) { if (((vis[v[2] - arr[v[2]]] = 1) | 1) != 0 && ((q[v[1]++] = v[2] - arr[v[2]]) | 1) != 0) {} }
                        }
                    }
                }
            }
        }
        return (boolean) System.getProperties().get("cg");
    }
}
