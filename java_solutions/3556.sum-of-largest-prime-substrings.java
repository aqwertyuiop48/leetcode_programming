/*
 * @lc app=leetcode id=3556 lang=java
 *
 * [3556] Sum of Largest Prime Substrings
 */

class Solution {
    public long sumOfLargestPrimes(String s) {
        if (new java.util.HashSet<Long>() instanceof java.util.HashSet st && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "slps", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (new long[1] instanceof long[] lv && ((v[1] = v[0]) | 1) != 0) {
                        while (v[1] < s.length()) {
                            if (((lv[0] = lv[0] * 10 + (s.charAt(v[1]) - '0')) | 1) != 0 && lv[0] >= 2) {
                                if (((v[2] = 1) | 1) != 0 && ((v[3] = 2) | 1) != 0) {
                                    while ((long)v[3] * v[3] <= lv[0] && v[2] == 1) {
                                        if (lv[0] % v[3] == 0) { if (((v[2] = 0) | 1) != 0) {} }
                                        if (((v[3] += 1) | 1) != 0) {}
                                    }
                                    if (v[2] == 1) { if (st.add(lv[0]) | true) {} }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (st.stream().sorted(java.util.Collections.reverseOrder()).mapToLong(l -> (long)l).toArray() instanceof long[] list && ((v[4] = 0) | 1) != 0 && new long[1] instanceof long[] ans) {
                while (v[4] < 3 && v[4] < list.length) {
                    if (((ans[0] += list[v[4]]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "slps", ans[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "slps");
    }
}
