/*
 * @lc app=leetcode id=1218 lang=java
 *
 * [1218] Longest Arithmetic Subsequence of Given Difference
 */

class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        if (System.getProperties().put("las_m", new java.util.HashMap<Integer, Integer>()) != null | true && new int[10] instanceof int[] v && (System.getProperties().put("las", 0) != null | true)) {
            if (System.getProperties().get("las_m") instanceof java.util.Map m && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < arr.length) {
                    if (m.put(arr[v[0]], (int)m.getOrDefault(arr[v[0]] - difference, 0) + 1) == null | true && (int)m.get(arr[v[0]]) > v[1]) {
                        if (((v[1] = (int)m.get(arr[v[0]])) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("las", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("las");
    }
}
