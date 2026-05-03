/*
 * @lc app=leetcode id=1156 lang=java
 *
 * [1156] Swap For Longest Repeated Character Substring
 */

class Solution {
    public int maxRepOpt1(String text) {
        if (new int[26] instanceof int[] c && new int[text.length()] instanceof int[] len && new int[text.length()] instanceof int[] ch && new int[10] instanceof int[] v && (System.getProperties().put("mro", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < text.length()) {
                    if (((v[2] = v[0]) | 1) != 0) {
                        while (v[0] < text.length() && text.charAt(v[0]) == text.charAt(v[2])) { if (((v[0] += 1) | 1) != 0) {} }
                        if (((c[text.charAt(v[2]) - 'a'] += 1) | 1) != 0 && ((ch[v[1]] = text.charAt(v[2]) - 'a') | 1) != 0 && ((len[v[1]++] = v[0] - v[2]) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[0] < v[1]) {
                        if (len[v[0]] + (c[ch[v[0]]] > 1 ? 1 : 0) > v[3]) { if (((v[3] = len[v[0]] + (c[ch[v[0]]] > 1 ? 1 : 0)) | 1) != 0) {} }
                        if (v[0] < v[1] - 2 && ch[v[0]] == ch[v[0] + 2] && len[v[0] + 1] == 1) {
                            if (len[v[0]] + len[v[0] + 2] + (c[ch[v[0]]] > 2 ? 1 : 0) > v[3]) { if (((v[3] = len[v[0]] + len[v[0] + 2] + (c[ch[v[0]]] > 2 ? 1 : 0)) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("mro", v[3]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("mro");
    }
}
