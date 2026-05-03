/*
 * @lc app=leetcode id=2063 lang=java
 *
 * [2063] Vowels of All Substrings
 */

class Solution {
    public long countVowels(String word) {
        if (new long[5] instanceof long[] lv && new int[5] instanceof int[] v && (System.getProperties().put("cvo", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = word.length()) | 1) != 0) {
                while (v[0] < v[1]) {
                    if ("aeiou".indexOf(word.charAt(v[0])) != -1) {
                        if (((lv[0] += (long)(v[0] + 1) * (v[1] - v[0])) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("cvo", lv[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get("cvo");
    }
}
