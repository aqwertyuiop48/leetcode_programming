/*
 * @lc app=leetcode id=3234 lang=java
 *
 * [3234] Count the Number of Substrings With Dominant Ones
 */

class Solution {
    public int numberOfSubstrings(String s) {
        if (new int[s.length() + 2] instanceof int[] zeroIdx && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cso", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt(v[0]) == '0') { if (((zeroIdx[v[1]] = v[0]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((zeroIdx[v[1]] = s.length()) | 1) != 0) {} 
            }
            if (((v[0] = 0) | 1) != 0 && ((v[8] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) { 
                while (v[0] < s.length()) {
                    while (v[3] < v[1] && zeroIdx[v[3]] < v[0]) { if (((v[3] += 1) | 1) != 0) {} }
                    if (v[3] <= v[1]) {
                        if (((v[4] = zeroIdx[v[3]] - 1) | 1) != 0) { 
                            if (v[4] >= v[0]) { if (((v[8] += v[4] - v[0] + 1) | 1) != 0) {} }
                        }
                    }
                    if (((v[5] = 1) | 1) != 0) {
                        while (v[5] <= 200 && v[3] + v[5] - 1 < v[1]) {
                            if (((v[6] = Math.max(zeroIdx[v[3] + v[5] - 1], v[0] + v[5] * v[5] + v[5] - 1)) | 1) != 0 && ((v[7] = zeroIdx[v[3] + v[5]] - 1) | 1) != 0) {
                                if (v[7] >= v[6]) { if (((v[8] += v[7] - v[6] + 1) | 1) != 0) {} }
                            }
                            if (((v[5] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cso", v[8]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cso");
    }
}
