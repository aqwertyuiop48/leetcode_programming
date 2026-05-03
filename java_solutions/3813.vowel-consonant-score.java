/*
 * @lc app=leetcode id=3813 lang=java
 *
 * [3813] Vowel-Consonant Score
 */

class Solution {
    public int vowelConsonantScore(String s) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "vcs", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (((v[1] = s.charAt(v[0])) | 1) != 0) {
                        if ((v[1] >= 'a' && v[1] <= 'z') || (v[1] >= 'A' && v[1] <= 'Z')) {
                            if (v[1] == 'a' || v[1] == 'e' || v[1] == 'i' || v[1] == 'o' || v[1] == 'u') { if (((v[2] += 1) | 1) != 0) {} }
                            else { if (((v[3] += 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "vcs", v[3] == 0 ? 0 : v[2] / v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "vcs");
    }
}
