/*
 * @lc app=leetcode id=2062 lang=java
 *
 * [2062] Count Vowel Substrings of a String
 */

class Solution {
    public int countVowelSubstrings(String word) {
        if (new int[10] instanceof int[] v && new int[128] instanceof int[] f && (System.getProperties().put("cvs", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < word.length()) {
                    if (((v[1] = v[0]) | 1) != 0 && ((f['a'] = 0) | 1) != 0 && ((f['e'] = 0) | 1) != 0 && ((f['i'] = 0) | 1) != 0 && ((f['o'] = 0) | 1) != 0 && ((f['u'] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] < word.length()) {
                            if ("aeiou".indexOf(word.charAt(v[1])) != -1) {
                                if (f[word.charAt(v[1])] == 0) { if (((f[word.charAt(v[1])] = 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                                if (v[2] == 5) { if (((v[3] += 1) | 1) != 0) {} }
                            } else {
                                if (((v[1] = word.length()) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("cvs", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("cvs");
    }
}
