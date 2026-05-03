/*
 * @lc app=leetcode id=3424 lang=java
 *
 * [3424] Minimum Cost to Make Arrays Identical
 */

class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        if (new long[5] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mca", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < arr.length) { if (((lv[0] += Math.abs(arr[v[0]] - brr[v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            }
            if ((arr = java.util.Arrays.stream(arr).sorted().toArray()) != null && (brr = java.util.Arrays.stream(brr).sorted().toArray()) != null) {
                if (((v[0] = 0) | 1) != 0 && ((lv[1] = k) | 1) != 0) {
                    while (v[0] < arr.length) { if (((lv[1] += Math.abs(arr[v[0]] - brr[v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mca", Math.min(lv[0], lv[1])) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mca");
    }
}
