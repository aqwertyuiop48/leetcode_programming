/*
 * @lc app=leetcode id=2645 lang=java
 *
 * [2645] Minimum Additions to Make Valid String
 */

class Solution {
    public int addMinimum(String word) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("amv", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < word.length()) {
                    if (v[0] < word.length() - 1 && word.charAt(v[0]) < word.charAt(v[0] + 1)) {
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[2] += 3 - (v[1] + 1)) | 1) != 0 && ((v[1] = 0) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("amv", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("amv");
    }
}
