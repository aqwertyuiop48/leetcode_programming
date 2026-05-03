/*
 * @lc app=leetcode id=3900 lang=java
 *
 * [3900] Longest Balanced Substring After One Swap
 */

class Solution {
    public int longestBalanced(String s) {
        if (new int[s.length() * 2 + 5] instanceof int[] p0 && new int[s.length() * 2 + 5] instanceof int[] p1 && new int[s.length() * 2 + 5] instanceof int[] p2 && new int[s.length() + 5] instanceof int[] za && new int[s.length() + 5] instanceof int[] oa && new int[20] instanceof int[] v && (System.getProperties().put("lbs", 0) != null | true)) {
            if (((v[0] = s.length()) | 1) != 0) {
                while (v[3] < v[0]) {
                    if (s.charAt(v[3]) == '0') { if (((v[1] += 1) | 1) != 0) {} } else { if (((v[2] += 1) | 1) != 0) {} }
                    if (((v[3] += 1) | 1) != 0) {}
                }
                while (v[8] < 2 * v[0] + 5) {
                    if (((p0[v[8]] = -2) | 1) != 0 && ((p1[v[8]] = -2) | 1) != 0 && ((p2[v[8]++] = -2) | 1) != 0) {}
                }
                if (((p0[v[0]] = -1) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[3] < v[0]) {
                        if (s.charAt(v[3]) == '0') { if (((v[4] += 1) | 1) != 0) {} } else { if (((v[5] += 1) | 1) != 0) {} }
                        if (((za[v[3] + 1] = v[4]) | 1) != 0 && ((oa[v[3] + 1] = v[5]) | 1) != 0 && ((v[6] = v[5] - v[4] + v[0]) | 1) != 0) {
                            if (p0[v[6]] == -2) { if (((p0[v[6]] = v[3]) | 1) != 0) {} }
                            if (p1[v[6]] == -2 && v[4] > 0) { if (((p1[v[6]] = v[3]) | 1) != 0) {} }
                            if (p2[v[6]] == -2 && v[5] > 0) { if (((p2[v[6]] = v[3]) | 1) != 0) {} }
                            
                            if (p0[v[6]] != -2 && v[3] - p0[v[6]] > v[7]) { if (((v[7] = v[3] - p0[v[6]]) | 1) != 0) {} }
                            
                            if (v[6] - 2 >= 0) {
                                if (((v[9] = p0[v[6] - 2]) | 1) != 0 && v[9] != -2) {
                                    if (v[1] - (v[4] - za[v[9] + 1]) > 0) {
                                        if (v[3] - v[9] > v[7]) { if (((v[7] = v[3] - v[9]) | 1) != 0) {} }
                                    } else {
                                        if (((v[9] = p1[v[6] - 2]) | 1) != 0 && v[9] != -2 && v[3] - v[9] > v[7]) { if (((v[7] = v[3] - v[9]) | 1) != 0) {} }
                                    }
                                }
                            }
                            if (v[6] + 2 < 2 * v[0] + 5) {
                                if (((v[9] = p0[v[6] + 2]) | 1) != 0 && v[9] != -2) {
                                    if (v[2] - (v[5] - oa[v[9] + 1]) > 0) {
                                        if (v[3] - v[9] > v[7]) { if (((v[7] = v[3] - v[9]) | 1) != 0) {} }
                                    } else {
                                        if (((v[9] = p2[v[6] + 2]) | 1) != 0 && v[9] != -2 && v[3] - v[9] > v[7]) { if (((v[7] = v[3] - v[9]) | 1) != 0) {} }
                                    }
                                }
                            }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("lbs", v[7]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("lbs");
    }
}
