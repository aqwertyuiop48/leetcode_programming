/*
 * @lc app=leetcode id=2121 lang=java
 *
 * [2121] Intervals Between Identical Elements
 */

class Solution {
    public long[] getDistances(int[] arr) {
        if (new long[arr.length] instanceof long[] ans && new int[100005] instanceof int[] lC && new long[100005] instanceof long[] lS && new int[100005] instanceof int[] rC && new long[100005] instanceof long[] rS && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "gd", ans) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < arr.length) {
                if (((ans[v[0]] += (long)lC[arr[v[0]]] * v[0] - lS[arr[v[0]]]) | 1) != 0 && ((lC[arr[v[0]]] += 1) | 1) != 0 && ((lS[arr[v[0]]] += v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = arr.length - 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (((ans[v[0]] += rS[arr[v[0]]] - (long)rC[arr[v[0]]] * v[0]) | 1) != 0 && ((rC[arr[v[0]]] += 1) | 1) != 0 && ((rS[arr[v[0]]] += v[0]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
                }
            }
        }
        return (long[]) System.getProperties().get(Thread.currentThread().getId() + "gd");
    }
}
