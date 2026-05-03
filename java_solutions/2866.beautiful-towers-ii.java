/*
 * @lc app=leetcode id=2866 lang=java
 *
 * [2866] Beautiful Towers II
 */

class Solution {
    public long maximumSumOfHeights(java.util.List<Integer> maxHeights) {
        if (new long[maxHeights.size()] instanceof long[] left && new long[maxHeights.size()] instanceof long[] right && new int[maxHeights.size()] instanceof int[] st && new int[15] instanceof int[] v && (System.getProperties().put("bt2", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0) {
                while (v[0] < maxHeights.size()) {
                    while (v[1] >= 0 && maxHeights.get(st[v[1]]) > maxHeights.get(v[0])) { if (((v[1] -= 1) | 1) != 0) {} }
                    if (v[1] == -1) { if (((left[v[0]] = (long)(v[0] + 1) * maxHeights.get(v[0])) | 1) != 0) {} }
                    else { if (((left[v[0]] = left[st[v[1]]] + (long)(v[0] - st[v[1]]) * maxHeights.get(v[0])) | 1) != 0) {} }
                    if (((st[++v[1]] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = maxHeights.size() - 1) | 1) != 0 && ((v[1] = -1) | 1) != 0) {
                    while (v[0] >= 0) {
                        while (v[1] >= 0 && maxHeights.get(st[v[1]]) > maxHeights.get(v[0])) { if (((v[1] -= 1) | 1) != 0) {} }
                        if (v[1] == -1) { if (((right[v[0]] = (long)(maxHeights.size() - v[0]) * maxHeights.get(v[0])) | 1) != 0) {} }
                        else { if (((right[v[0]] = right[st[v[1]]] + (long)(st[v[1]] - v[0]) * maxHeights.get(v[0])) | 1) != 0) {} }
                        if (((st[++v[1]] = v[0]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < maxHeights.size()) {
                        if (left[v[0]] + right[v[0]] - maxHeights.get(v[0]) > (long)System.getProperties().get("bt2")) { if (System.getProperties().put("bt2", left[v[0]] + right[v[0]] - maxHeights.get(v[0])) != null | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (long) System.getProperties().get("bt2");
    }
}
