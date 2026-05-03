/*
 * @lc app=leetcode id=3529 lang=java
 *
 * [3529] Count Cells in Overlapping Horizontal and Vertical Substrings
 */

class Solution {
    public int countCells(char[][] g, String p) {
        if (new int[10] instanceof int[] v && new long[10] instanceof long[] L && p.length() <= g.length * g[0].length && new char[g.length * g[0].length] instanceof char[] sr && new char[g.length * g[0].length] instanceof char[] sc && new int[g.length * g[0].length + 1] instanceof int[] diffH && new int[g.length * g[0].length + 1] instanceof int[] diffV && new boolean[g.length * g[0].length] instanceof boolean[] h && new boolean[g.length * g[0].length] instanceof boolean[] ver && (System.getProperties().put(Thread.currentThread().getId() + "ccRK", 0) != null | true)) {
            
            if (((v[2] = g.length) | 1) != 0 && ((v[3] = g[0].length) | 1) != 0 && ((v[4] = p.length()) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while(v[0] < v[2]) {
                    if (((v[1] = 0) | 1) != 0) {
                        while(v[1] < v[3]) {
                            if (((sr[v[0] * v[3] + v[1]] = g[v[0]][v[1]]) | 1) != 0 && ((sc[v[1] * v[2] + v[0]] = g[v[0]][v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            
            if (((L[0] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while(v[0] < v[4]) {
                    if (((L[0] = (L[0] * 67 + p.charAt(v[0])) % 1000000007) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            
            if (((L[1] = 1) | 1) != 0 && ((L[2] = 67) | 1) != 0 && ((v[0] = v[4]) | 1) != 0) {
                while(v[0] > 0) {
                    if ((v[0] & 1) == 1) { if (((L[1] = (L[1] * L[2]) % 1000000007) | 1) != 0) {} }
                    if (((L[2] = (L[2] * L[2]) % 1000000007) | 1) != 0 && ((v[0] >>= 1) | 1) != 0) {}
                }
            }
            
            if (((L[2] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while(v[0] < v[4]) {
                    if (((L[2] = (L[2] * 67 + sr[v[0]]) % 1000000007) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (L[2] == L[0]) { if (((diffH[0] += 1) | 1) != 0 && ((diffH[v[4]] -= 1) | 1) != 0) {} }
                if (((v[0] = v[4]) | 1) != 0) {
                    while(v[0] < v[2] * v[3]) {
                        if (((L[2] = (L[2] * 67 - (sr[v[0] - v[4]] * L[1]) % 1000000007 + 1000000007) % 1000000007) | 1) != 0 && ((L[2] = (L[2] + sr[v[0]]) % 1000000007) | 1) != 0) {
                            if (L[2] == L[0]) {
                                if (((diffH[v[0] - v[4] + 1] += 1) | 1) != 0 && ((diffH[v[0] - v[4] + 1 + v[4]] -= 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while(v[0] < v[2] * v[3]) {
                        if (((v[1] += diffH[v[0]]) | 1) != 0 && ((h[v[0]] = v[1] > 0) | true) && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
            
            if (((L[2] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while(v[0] < v[4]) {
                    if (((L[2] = (L[2] * 67 + sc[v[0]]) % 1000000007) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (L[2] == L[0]) { if (((diffV[0] += 1) | 1) != 0 && ((diffV[v[4]] -= 1) | 1) != 0) {} }
                if (((v[0] = v[4]) | 1) != 0) {
                    while(v[0] < v[2] * v[3]) {
                        if (((L[2] = (L[2] * 67 - (sc[v[0] - v[4]] * L[1]) % 1000000007 + 1000000007) % 1000000007) | 1) != 0 && ((L[2] = (L[2] + sc[v[0]]) % 1000000007) | 1) != 0) {
                            if (L[2] == L[0]) {
                                if (((diffV[v[0] - v[4] + 1] += 1) | 1) != 0 && ((diffV[v[0] - v[4] + 1 + v[4]] -= 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while(v[0] < v[2] * v[3]) {
                        if (((v[1] += diffV[v[0]]) | 1) != 0 && ((ver[v[0]] = v[1] > 0) | true) && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
            
            if (((v[0] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                while(v[0] < v[2]) {
                    if (((v[1] = 0) | 1) != 0) {
                        while(v[1] < v[3]) {
                            if (h[v[0] * v[3] + v[1]] && ver[v[1] * v[2] + v[0]]) {
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ccRK", v[5]) != null | true) {}
            }
        }
        return (int) System.getProperties().getOrDefault(Thread.currentThread().getId() + "ccRK", 0);
    }
}
