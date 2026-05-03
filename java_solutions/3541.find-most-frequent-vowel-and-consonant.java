/*
 * @lc app=leetcode id=3541 lang=java
 *
 * [3541] Find Most Frequent Vowel and Consonant
 */

class Solution {
    public int maxFreqSum(String s) {
        if (new int[26] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mfvc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while(v[0] < s.length()) { if (((cnt[s.charAt(v[0]) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while(v[0] < 26) {
                    if (v[0] == 0 || v[0] == 4 || v[0] == 8 || v[0] == 14 || v[0] == 20) {
                        if (cnt[v[0]] > v[1]) { if (((v[1] = cnt[v[0]]) | 1) != 0) {} }
                    } else {
                        if (cnt[v[0]] > v[2]) { if (((v[2] = cnt[v[0]]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mfvc", v[1] + v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mfvc");
    }
}
