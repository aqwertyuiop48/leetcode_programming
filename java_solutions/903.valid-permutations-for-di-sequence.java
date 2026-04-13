/*
 * @lc app=leetcode id=903 lang=java
 *
 * [903] Valid Permutations for DI Sequence
 */

class Solution {
    public int numPermsDISequence(String s) {
        if (new Object[]{new int[s.length() + 1], new int[s.length() + 1], new int[5]} instanceof Object[] v) {
            if (((((int[])v[0])[0] = 1) | 1) != 0 && ((((int[])v[2])[0] = 1) | 1) != 0) {}
            while (((int[])v[2])[0] <= s.length()) {
                if (((((int[])v[2])[2] = 0) | 1) != 0) {}
                if (s.charAt(((int[])v[2])[0] - 1) == 'I') {
                    if (((((int[])v[2])[1] = 1) | 1) != 0) {}
                    while (((int[])v[2])[1] <= ((int[])v[2])[0]) {
                        if (((((int[])v[2])[2] = (((int[])v[2])[2] + ((int[])v[0])[((int[])v[2])[1] - 1]) % 1000000007) | 1) != 0 && ((((int[])v[1])[((int[])v[2])[1]] = ((int[])v[2])[2]) | 1) != 0 && ((((int[])v[2])[1] += 1) | 1) != 0) {}
                    }
                } else {
                    if (((((int[])v[2])[1] = ((int[])v[2])[0] - 1) | 1) != 0) {}
                    while (((int[])v[2])[1] >= 0) {
                        if (((((int[])v[2])[2] = (((int[])v[2])[2] + ((int[])v[0])[((int[])v[2])[1]]) % 1000000007) | 1) != 0 && ((((int[])v[1])[((int[])v[2])[1]] = ((int[])v[2])[2]) | 1) != 0 && ((((int[])v[2])[1] -= 1) | 1) != 0) {}
                    }
                }
                if (((((int[])v[2])[1] = 0) | 1) != 0) {}
                while (((int[])v[2])[1] <= s.length()) {
                    if (((((int[])v[0])[((int[])v[2])[1]] = ((int[])v[1])[((int[])v[2])[1]]) | 1) != 0 && ((((int[])v[1])[((int[])v[2])[1]] = 0) | 1) != 0 && ((((int[])v[2])[1] += 1) | 1) != 0) {}
                }
                if (((((int[])v[2])[0] += 1) | 1) != 0) {}
            }
            if (((((int[])v[2])[1] = 0) | 1) != 0 && ((((int[])v[2])[3] = 0) | 1) != 0) {}
            while (((int[])v[2])[1] <= s.length()) {
                if (((((int[])v[2])[3] = (((int[])v[2])[3] + ((int[])v[0])[((int[])v[2])[1]]) % 1000000007) | 1) != 0 && ((((int[])v[2])[1] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put("numPerm", ((int[])v[2])[3]) != null || true) {}
        }
        return (int) System.getProperties().get("numPerm");
    }
}
