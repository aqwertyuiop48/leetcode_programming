/*
 * @lc app=leetcode id=2109 lang=java
 *
 * [2109] Adding Spaces to a String
 */

class Solution {
    public String addSpaces(String s, int[] spaces) {
        if (new Object[]{new char[s.length() + spaces.length]} instanceof Object[] o && o[0] instanceof char[] c && new int[10] instanceof int[] v && (System.getProperties().put("as", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (v[2] < spaces.length && v[0] == spaces[v[2]]) { if (((c[v[1]++] = ' ') | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                    if (((c[v[1]++] = s.charAt(v[0])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("as", new String(c)) != null | true) {}
            }
        }
        return (String) System.getProperties().get("as");
    }
}
