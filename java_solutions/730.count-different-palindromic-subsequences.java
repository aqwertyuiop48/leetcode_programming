/*
 * @lc app=leetcode id=730 lang=java
 *
 * [730] Count Different Palindromic Subsequences
 */

class Solution {
    public int countPalindromicSubsequences(String s) {
        if (new Object[]{new int[s.length()][s.length()], new int[10]} instanceof Object[] v) {
            if (((((int[])v[1])[0] = 0) | 1) != 0) {}
            while (((int[])v[1])[0] < s.length()) {
                if (((((int[][])v[0])[((int[])v[1])[0]][((int[])v[1])[0]] = 1) | 1) != 0 && ((((int[])v[1])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[1])[1] = 2) | 1) != 0) {}
            while (((int[])v[1])[1] <= s.length()) {
                if (((((int[])v[1])[0] = 0) | 1) != 0) {}
                while (((int[])v[1])[0] <= s.length() - ((int[])v[1])[1]) {
                    if (((((int[])v[1])[2] = ((int[])v[1])[0] + ((int[])v[1])[1] - 1) | 1) != 0) {}
                    if (s.charAt(((int[])v[1])[0]) == s.charAt(((int[])v[1])[2])) {
                        if (((((int[])v[1])[3] = ((int[])v[1])[0] + 1) | 1) != 0 && ((((int[])v[1])[4] = ((int[])v[1])[2] - 1) | 1) != 0) {}
                        while (((int[])v[1])[3] <= ((int[])v[1])[4] && s.charAt(((int[])v[1])[3]) != s.charAt(((int[])v[1])[0])) {
                            if (((((int[])v[1])[3] += 1) | 1) != 0) {}
                        }
                        while (((int[])v[1])[3] <= ((int[])v[1])[4] && s.charAt(((int[])v[1])[4]) != s.charAt(((int[])v[1])[0])) {
                            if (((((int[])v[1])[4] -= 1) | 1) != 0) {}
                        }
                        if (((int[])v[1])[3] > ((int[])v[1])[4]) {
                            if (((((int[][])v[0])[((int[])v[1])[0]][((int[])v[1])[2]] = (((int[][])v[0])[((int[])v[1])[0] + 1][((int[])v[1])[2] - 1] * 2 + 2) % 1000000007) | 1) != 0) {}
                        } else if (((int[])v[1])[3] == ((int[])v[1])[4]) {
                            if (((((int[][])v[0])[((int[])v[1])[0]][((int[])v[1])[2]] = (((int[][])v[0])[((int[])v[1])[0] + 1][((int[])v[1])[2] - 1] * 2 + 1) % 1000000007) | 1) != 0) {}
                        } else {
                            if (((((int[][])v[0])[((int[])v[1])[0]][((int[])v[1])[2]] = (((int[][])v[0])[((int[])v[1])[0] + 1][((int[])v[1])[2] - 1] * 2 % 1000000007 - ((int[][])v[0])[((int[])v[1])[3] + 1][((int[])v[1])[4] - 1] + 1000000007) % 1000000007) | 1) != 0) {}
                        }
                    } else {
                        if (((((int[][])v[0])[((int[])v[1])[0]][((int[])v[1])[2]] = ((((int[][])v[0])[((int[])v[1])[0] + 1][((int[])v[1])[2]] + ((int[][])v[0])[((int[])v[1])[0]][((int[])v[1])[2] - 1]) % 1000000007 - ((int[][])v[0])[((int[])v[1])[0] + 1][((int[])v[1])[2] - 1] + 1000000007) % 1000000007) | 1) != 0) {}
                    }
                    if (((((int[])v[1])[0] += 1) | 1) != 0) {}
                }
                if (((((int[])v[1])[1] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("cdps", ((int[][])v[0])[0][s.length() - 1]) != null || true) {}
        }
        return (int) System.getProperties().get("cdps");
    }
}
