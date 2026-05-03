/*
 * @lc app=leetcode id=1209 lang=java
 *
 * [1209] Remove All Adjacent Duplicates in String II
 */

class Solution {
    public String removeDuplicates(String s, int k) {
        if (new char[s.length()] instanceof char[] st && new int[s.length()] instanceof int[] count && new int[10] instanceof int[] v && new Object[]{new StringBuilder()} instanceof Object[] o && o[0] instanceof StringBuilder sb) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (v[1] >= 0 && st[v[1]] == s.charAt(v[0])) {
                        if (((count[v[1]] += 1) | 1) != 0 && count[v[1]] == k) { if (((v[1] -= 1) | 1) != 0) {} }
                    } else {
                        if (((st[++v[1]] = s.charAt(v[0])) | 1) != 0 && ((count[v[1]] = 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] <= v[1]) {
                        if (((v[2] = 0) | 1) != 0) { while (v[2] < count[v[0]]) { if (sb.append(st[v[0]]) != null | true && ((v[2] += 1) | 1) != 0) {} } }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("raa", sb.toString()) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get("raa");
    }
}
