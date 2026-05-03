/*
 * @lc app=leetcode id=3720 lang=java
 *
 * [3720] Lexicographically Smallest Permutation Greater Than Target
 */

class Solution {
    public String lexGreaterPermutation(String s, String target) {
        if (new int[26] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lgp", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) { if (((cnt[s.charAt(v[0]++) - 'a'] += 1) | 1) != 0) {} }
                if (((v[0] = s.length() - 1) | 1) != 0 && ((v[9] = 0) | 1) != 0) {
                    while (v[0] >= 0 && v[9] == 0) {
                        if (new int[26] instanceof int[] curCnt && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                            while (v[1] < 26) { if (((curCnt[v[1]] = cnt[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                            if (((v[1] = 0) | 1) != 0) {
                                while (v[1] < v[0] && v[2] == 1) {
                                    if (curCnt[target.charAt(v[1]) - 'a'] > 0) { if (((curCnt[target.charAt(v[1]) - 'a'] -= 1) | 1) != 0) {} }
                                    else { if (((v[2] = 0) | 1) != 0) {} }
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                            if (v[2] == 1) {
                                if (((v[3] = target.charAt(v[0]) - 'a' + 1) | 1) != 0 && ((v[4] = -1) | 1) != 0) {
                                    while (v[3] < 26 && v[4] == -1) {
                                        if (curCnt[v[3]] > 0) { if (((v[4] = v[3]) | 1) != 0) {} }
                                        if (((v[3] += 1) | 1) != 0) {}
                                    }
                                    if (v[4] != -1) {
                                        if (new Object[]{new char[s.length()]} instanceof Object[] o && o[0] instanceof char[] res && ((v[5] = 0) | 1) != 0) {
                                            while (v[5] < v[0]) { if (((res[v[5]] = target.charAt(v[5])) | 1) != 0 && ((v[5] += 1) | 1) != 0) {} }
                                            if (((res[v[0]] = (char)(v[4] + 'a')) | 1) != 0 && ((curCnt[v[4]] -= 1) | 1) != 0 && ((v[5] = v[0] + 1) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                                while (v[6] < 26) {
                                                    while (curCnt[v[6]] > 0) { if (((res[v[5]++] = (char)(v[6] + 'a')) | 1) != 0 && ((curCnt[v[6]] -= 1) | 1) != 0) {} }
                                                    if (((v[6] += 1) | 1) != 0) {}
                                                }
                                                if (System.getProperties().put(Thread.currentThread().getId() + "lgp", new String(res)) != null | true) { if (((v[9] = 1) | 1) != 0) {} }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (((v[0] -= 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "lgp");
    }
}
