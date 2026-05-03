/*
 * @lc app=leetcode id=3800 lang=java
 *
 * [3800] Minimum Cost to Make Two Binary Strings Equal
 */

class Solution {
    public long minimumCost(String s, String t, int flipCost, int swapCost, int crossCost) {
        if (new long[2] instanceof long[] diff && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mc", 0L) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (s.charAt(v[0]) != t.charAt(v[0])) { if (((diff[s.charAt(v[0]) - '0'] += 1) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[1] = (int)Math.max(diff[0], diff[1])) | 1) != 0 && ((v[2] = (int)Math.min(diff[0], diff[1])) | 1) != 0 && new long[1] instanceof long[] ans) {
                if (((ans[0] = (diff[0] + diff[1]) * flipCost) | 1) != 0) {
                    if ((long)v[2] * swapCost + (long)(v[1] - v[2]) * flipCost < ans[0]) { if (((ans[0] = (long)v[2] * swapCost + (long)(v[1] - v[2]) * flipCost) | 1) != 0) {} }
                    if (((v[3] = (v[1] + v[2]) / 2) | 1) != 0) {
                        if ((long)(v[3] - v[2]) * crossCost + (long)v[3] * swapCost + (long)(v[1] + v[2] - v[3] * 2) * flipCost < ans[0]) {
                            if (((ans[0] = (long)(v[3] - v[2]) * crossCost + (long)v[3] * swapCost + (long)(v[1] + v[2] - v[3] * 2) * flipCost) | 1) != 0) {}
                        }
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mc", ans[0]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mc");
    }
}
