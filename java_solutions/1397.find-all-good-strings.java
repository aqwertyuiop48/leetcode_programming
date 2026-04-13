/*
 * @lc app=leetcode id=1397 lang=java
 *
 * [1397] Find All Good Strings
 */

class Solution {
    public int findGoodStrings(int n, String s1, String s2, String evil) {
        if (new int[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0} instanceof int[] v && new Object[]{new int[evil.length()], new int[n + 1][evil.length() + 1][4]} instanceof Object[] obj) {
            while (v[0] < 10) {
                if (v[0] == 0) {
                    if (v[1] < evil.length()) {
                        if (evil.charAt(v[1]) == evil.charAt(v[2])) {
                            if (((((int[])obj[0])[v[1]] = v[2] + 1) | 1) != 0 && ((v[2] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        } else if (v[2] > 0) {
                            if (((v[2] = ((int[])obj[0])[v[2] - 1]) | 1) != 0) {}
                        } else {
                            if (((((int[])obj[0])[v[1]] = 0) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[3] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) { 
                    if (v[3] < evil.length()) {
                        if (((v[4] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((v[1] = n - 1) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[4] < 4) {
                        if (((((int[][][])obj[1])[n][v[3]][v[4]] = 1) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((v[3] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 3) { 
                    if (v[1] >= 0) {
                        if (((v[2] = 0) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    } else {
                        if (((n = ((int[][][])obj[1])[0][0][3]) | 1) != 0 && ((v[0] = 99) | 1) != 0) {}
                    }
                } else if (v[0] == 4) { 
                    if (v[2] < evil.length()) {
                        if (((v[3] = 0) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                    } else {
                        if (((v[1] -= 1) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    }
                } else if (v[0] == 5) { 
                    if (v[3] < 4) {
                        if (((v[4] = (v[3] & 1) != 0 ? s1.charAt(v[1]) : 'a') | 1) != 0 && ((v[5] = (v[3] & 2) != 0 ? s2.charAt(v[1]) : 'z') | 1) != 0 && ((v[6] = v[4]) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 6) { 
                    if (v[6] <= v[5]) {
                        if (((v[7] = v[2]) | 1) != 0 && ((v[0] = 7) | 1) != 0) {}
                    } else {
                        if (((v[3] += 1) | 1) != 0 && ((v[0] = 5) | 1) != 0) {}
                    }
                } else if (v[0] == 7) { 
                    if (v[7] > 0 && evil.charAt(v[7]) != v[6]) {
                        if (((v[7] = ((int[])obj[0])[v[7] - 1]) | 1) != 0) {}
                    } else {
                        if (evil.charAt(v[7]) == v[6]) {
                            if (((v[7] += 1) | 1) != 0) {}
                        }
                        if (((v[8] = ((v[3] & 1) != 0 && v[6] == v[4] ? 1 : 0) | ((v[3] & 2) != 0 && v[6] == v[5] ? 2 : 0)) | 1) != 0) {
                            if (((((int[][][])obj[1])[v[1]][v[2]][v[3]] = (int)((((int[][][])obj[1])[v[1]][v[2]][v[3]] + ((int[][][])obj[1])[v[1] + 1][v[7]][v[8]]) % 1000000007)) | 1) != 0) {
                                if (((v[6] += 1) | 1) != 0 && ((v[0] = 6) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return n;
    }
}
