/*
 * @lc app=leetcode id=2861 lang=java
 *
 * [2861] Maximum Number of Alloys
 */

class Solution {
    public int maxNumberOfAlloys(int n, int k, int budget, java.util.List<java.util.List<Integer>> composition, java.util.List<Integer> stock, java.util.List<Integer> cost) {
        if (new long[10] instanceof long[] lv && new int[10] instanceof int[] v && (System.getProperties().put("mna", 0) != null | true)) {
            if (((lv[0] = 0) | 1) != 0 && ((lv[1] = 200000000) | 1) != 0) {
                while (lv[0] <= lv[1]) {
                    if (((lv[2] = lv[0] + (lv[1] - lv[0]) / 2) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[0] < k) {
                            if (((lv[3] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                while (v[2] < n) {
                                    if (((lv[4] = Math.max(0L, (long)composition.get(v[0]).get(v[2]) * lv[2] - stock.get(v[2]))) | 1) != 0) {
                                        if (((lv[3] += lv[4] * cost.get(v[2])) | 1) != 0) {}
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (lv[3] <= budget) { if (((v[1] = 1) | 1) != 0 && ((v[0] = k) | 1) != 0) {} }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (v[1] == 1) { if (System.getProperties().put("mna", (int)lv[2]) != null | true && ((lv[0] = lv[2] + 1) | 1) != 0) {} }
                        else { if (((lv[1] = lv[2] - 1) | 1) != 0) {} }
                    }
                }
            }
        }
        return (int) System.getProperties().get("mna");
    }
}
