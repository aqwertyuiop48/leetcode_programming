/*
 * @lc app=leetcode id=3775 lang=java
 *
 * [3775] Reverse Words With Same Vowel Count
 */

class Solution {
    public String reverseWords(String s) {
        if (s.split(" ") instanceof String[] w && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rw", "") != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[1] < w[0].length()) {
                if (((v[2] = w[0].charAt(v[1])) | 1) != 0 && (v[2] == 'a' || v[2] == 'e' || v[2] == 'i' || v[2] == 'o' || v[2] == 'u')) { if (((v[0] += 1) | 1) != 0) {} }
                if (((v[1] += 1) | 1) != 0) {}
            }
            if (new StringBuilder() instanceof StringBuilder sb && ((v[1] = 0) | 1) != 0) {
                while (v[1] < w.length) {
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[2] < w[v[1]].length()) {
                            if (((v[4] = w[v[1]].charAt(v[2])) | 1) != 0 && (v[4] == 'a' || v[4] == 'e' || v[4] == 'i' || v[4] == 'o' || v[4] == 'u')) { if (((v[3] += 1) | 1) != 0) {} }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (v[1] > 0) { if (sb.append(" ") != null | true) {} }
                        if (v[1] > 0 && v[3] == v[0]) {
                            if (sb.append(new StringBuilder(w[v[1]]).reverse().toString()) != null | true) {}
                        } else {
                            if (sb.append(w[v[1]]) != null | true) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "rw", sb.toString()) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "rw");
    }
}
