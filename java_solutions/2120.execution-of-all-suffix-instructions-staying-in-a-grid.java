/*
 * @lc app=leetcode id=2120 lang=java
 *
 * [2120] Execution of All Suffix Instructions Staying in a Grid
 */

class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        if (new int[s.length()] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ei", ans) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (((v[1] = v[0]) | 1) != 0 && ((v[2] = startPos[0]) | 1) != 0 && ((v[3] = startPos[1]) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                    while (v[1] < s.length() && v[5] == 1) {
                        if (s.charAt(v[1]) == 'U') { if (((v[2] -= 1) | 1) != 0) {} }
                        else if (s.charAt(v[1]) == 'D') { if (((v[2] += 1) | 1) != 0) {} }
                        else if (s.charAt(v[1]) == 'L') { if (((v[3] -= 1) | 1) != 0) {} }
                        else if (s.charAt(v[1]) == 'R') { if (((v[3] += 1) | 1) != 0) {} }
                        
                        if (v[2] >= 0 && v[2] < n && v[3] >= 0 && v[3] < n) { if (((v[4] += 1) | 1) != 0) {} }
                        else { if (((v[5] = 0) | 1) != 0) {} }
                        
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                    if (((ans[v[0]] = v[4]) | 1) != 0) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "ei");
    }
}
