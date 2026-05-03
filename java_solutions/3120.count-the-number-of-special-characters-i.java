/*
 * @lc app=leetcode id=3120 lang=java
 *
 * [3120] Count the Number of Special Characters I
 */

class Solution {
    public int numberOfSpecialChars(String word) {
        if (new int[150] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nsc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < word.length()) {
                    if (((v[word.charAt(v[0])] = 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[2] = 'a') | 1) != 0) {
                    while (v[2] <= 'z') {
                        if (v[v[2]] == 1 && v[v[2] - 32] == 1) {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "nsc", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nsc");
    }
}
