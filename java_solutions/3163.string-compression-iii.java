/*
 * @lc app=leetcode id=3163 lang=java
 *
 * [3163] String Compression III
 */

class Solution {
    public String compressedString(String word) {
        if (new Object[]{new char[word.length() * 2]} instanceof Object[] o && o[0] instanceof char[] c && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sc3", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < word.length()) {
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = word.charAt(v[0])) | 1) != 0) {
                        while (v[0] < word.length() && word.charAt(v[0]) == v[3] && v[2] < 9) {
                            if (((v[2] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                        }
                        if (((c[v[1]++] = (char)(v[2] + '0')) | 1) != 0 && ((c[v[1]++] = (char)v[3]) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "sc3", new String(c, 0, v[1])) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "sc3");
    }
}
