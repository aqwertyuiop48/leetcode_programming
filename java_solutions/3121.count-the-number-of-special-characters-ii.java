/*
 * @lc app=leetcode id=3121 lang=java
 *
 * [3121] Count the Number of Special Characters II
 */

class Solution {
    public int numberOfSpecialChars(String word) {
        if (new int[150] instanceof int[] posL && new int[150] instanceof int[] posU && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nsc2", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < 150) {
                    if (((posL[v[0]] = -1) | 1) != 0 && ((posU[v[0]] = -1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < word.length()) {
                        if (((v[2] = word.charAt(v[0])) | 1) != 0) {
                            if (v[2] >= 'a' && v[2] <= 'z') {
                                if (((posL[v[2]] = v[0]) | 1) != 0) {}
                            } else {
                                if (posU[v[2]] == -1) { if (((posU[v[2]] = v[0]) | 1) != 0) {} }
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 'a') | 1) != 0) {
                        while (v[0] <= 'z') {
                            if (posL[v[0]] != -1 && posU[v[0] - 32] != -1 && posL[v[0]] < posU[v[0] - 32]) {
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "nsc2", v[1]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nsc2");
    }
}
