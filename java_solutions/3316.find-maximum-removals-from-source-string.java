/*
 * @lc app=leetcode id=3316 lang=java
 *
 * [3316] Find Maximum Removals From Source String
 */

class Solution {
    public int maxRemovals(String source, String pattern, int[] targetIndices) {
        if (new int[pattern.length() + 1] instanceof int[] dp && new int[pattern.length() + 1] instanceof int[] ndp && new boolean[source.length()] instanceof boolean[] isT && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mrem", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < targetIndices.length) {
                    if ((isT[targetIndices[v[0]]] = true) && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= pattern.length()) { if (((dp[v[0]++] = -999999) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < source.length()) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= pattern.length()) { if (((ndp[v[1]++] = -999999) | 1) != 0) {} }
                    }
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= pattern.length()) {
                            if (dp[v[1]] != -999999) {
                                if (dp[v[1]] + (isT[v[0]] ? 1 : 0) > ndp[v[1]]) { if (((ndp[v[1]] = dp[v[1]] + (isT[v[0]] ? 1 : 0)) | 1) != 0) {} }
                                if (v[1] < pattern.length() && source.charAt(v[0]) == pattern.charAt(v[1])) {
                                    if (dp[v[1]] > ndp[v[1] + 1]) { if (((ndp[v[1] + 1] = dp[v[1]]) | 1) != 0) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] <= pattern.length()) { if (((dp[v[1]] = ndp[v[1]++]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mrem", dp[pattern.length()]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mrem");
    }
}
