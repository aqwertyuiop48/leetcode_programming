/*
 * @lc app=leetcode id=3524 lang=java
 *
 * [3524] Find X Value of Array I
 */

class Solution {
    public long[] resultArray(int[] nums, int k) {
        if (new long[k] instanceof long[] ans && new int[k] instanceof int[] cur && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fxv", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (new int[k] instanceof int[] nxt && ((nxt[nums[v[0]] % k] += 1) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < k) {
                            if (cur[v[1]] > 0) { if (((nxt[(v[1] * (nums[v[0]] % k)) % k] += cur[v[1]]) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < k) { if (((ans[v[1]] += nxt[v[1]]) | 1) != 0 && ((cur[v[1]] = nxt[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (long[]) System.getProperties().get(Thread.currentThread().getId() + "fxv");
    }
}
