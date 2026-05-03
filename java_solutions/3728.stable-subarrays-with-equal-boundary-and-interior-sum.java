/*
 * @lc app=leetcode id=3728 lang=java
 *
 * [3728] Stable Subarrays With Equal Boundary and Interior Sum
 */

class Solution {
    public long countStableSubarrays(int[] capacity) {
        if (new int[10] instanceof int[] v && new java.util.HashMap<String, Integer>() instanceof java.util.HashMap map && new long[capacity.length + 1] instanceof long[] s && (System.getProperties().put(Thread.currentThread().getId() + "css", 0L) != null | true) && ((v[0] = 0) | 1) != 0 && new long[1] instanceof long[] ans) {
            while (v[0] < capacity.length) {
                if (((s[v[0] + 1] = s[v[0]] + capacity[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (((v[0] = 2) | 1) != 0) {
                while (v[0] < capacity.length) {
                    if (((v[1] = v[0] - 2) | 1) != 0 && new String[]{capacity[v[1]] + "," + (capacity[v[1]] + s[v[1] + 1])} instanceof String[] keyL) {
                        if (map.put(keyL[0], (int)map.getOrDefault(keyL[0], 0) + 1) == null | true) {}
                    }
                    if (new String[]{capacity[v[0]] + "," + s[v[0]]} instanceof String[] keyR) {
                        if (((ans[0] += (int)map.getOrDefault(keyR[0], 0)) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "css", ans[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "css");
    }
}
