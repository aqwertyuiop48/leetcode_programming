/*
 * @lc app=leetcode id=3039 lang=java
 *
 * [3039] Apply Operations to Make String Empty
 */

class Solution {
    public String lastNonEmptyString(String s) {
        if (new int[26] instanceof int[] cnt && new int[26] instanceof int[] last && new Object[]{new char[s.length()]} instanceof Object[] o && o[0] instanceof char[] c && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lne", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((v[2] = s.charAt(v[0]) - 'a') | 1) != 0) {
                        if (((cnt[v[2]] += 1) | 1) != 0 && ((last[v[2]] = v[0]) | 1) != 0) {
                            if (cnt[v[2]] > v[1]) { if (((v[1] = cnt[v[2]]) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                    while (v[0] < s.length()) {
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] < 26) {
                                if (cnt[v[3]] == v[1] && last[v[3]] == v[0]) {
                                    if (((c[v[4]++] = (char)(v[3] + 'a')) | 1) != 0) {}
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "lne", new String(c, 0, v[4])) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "lne");
    }
}
