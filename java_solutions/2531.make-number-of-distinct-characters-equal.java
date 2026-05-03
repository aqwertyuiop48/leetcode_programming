/*
 * @lc app=leetcode id=2531 lang=java
 *
 * [2531] Make Number of Distinct Characters Equal
 */

class Solution {
    public boolean isItPossible(String word1, String word2) {
        if (new int[26] instanceof int[] c1 && new int[26] instanceof int[] c2 && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ip", false) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < word1.length()) { if (((c1[word1.charAt(v[0]) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < word2.length()) { if (((c2[word2.charAt(v[0]) - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[0] < 26 && v[3] == 0) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < 26 && v[3] == 0) {
                                if (c1[v[0]] > 0 && c2[v[1]] > 0) {
                                    if (((c1[v[0]] -= 1) | 1) != 0 && ((c1[v[1]] += 1) | 1) != 0 && ((c2[v[1]] -= 1) | 1) != 0 && ((c2[v[0]] += 1) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                        while (v[4] < 26) {
                                            if (c1[v[4]] > 0) { if (((v[5] += 1) | 1) != 0) {} }
                                            if (c2[v[4]] > 0) { if (((v[6] += 1) | 1) != 0) {} }
                                            if (((v[4] += 1) | 1) != 0) {}
                                        }
                                        if (v[5] == v[6]) { if (System.getProperties().put(Thread.currentThread().getId() + "ip", true) != null | true && ((v[3] = 1) | 1) != 0) {} }
                                        if (((c1[v[0]] += 1) | 1) != 0 && ((c1[v[1]] -= 1) | 1) != 0 && ((c2[v[1]] += 1) | 1) != 0 && ((c2[v[0]] -= 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "ip");
    }
}
