/*
 * @lc app=leetcode id=1977 lang=java
 *
 * [1977] Number of Ways to Separate Numbers
 */

class Solution {
    public int numberOfCombinations(String num) {
        if (num.charAt(0) != '0' && (System.getProperties().put("ans1977", 0) != null || true) && new Object[]{new int[num.length() + 1][num.length() + 1], new int[num.length()][num.length() + 1]} instanceof Object[] state && new int[]{num.length() - 1, num.length() - 1, 0, 1, 0, 0, 0} instanceof int[] v) {
            while(v[0] >= 0) {
                if (((v[1] = num.length() - 1) | 1) != 0) {
                    while(v[1] >= 0) {
                        if (num.charAt(v[0]) == num.charAt(v[1])) {
                            if (((((int[][])state[0])[v[0]][v[1]] = 1 + ((int[][])state[0])[v[0] + 1][v[1] + 1]) | 1) != 0) {}
                        }
                        if (((v[1] -= 1) | 1) != 0) {}
                    }
                }
                if (((v[0] -= 1) | 1) != 0) {}
            }
            if (((v[2] = 0) | 1) != 0) {
                while (v[2] < num.length()) {
                    if (((v[3] = 1) | 1) != 0) {
                        while (v[3] <= num.length()) {
                            if (v[3] > v[2] + 1) {
                                if (((((int[][])state[1])[v[2]][v[3]] = ((int[][])state[1])[v[2]][v[2] + 1]) | 1) != 0) {}
                            } else {
                                if (((((int[][])state[1])[v[2]][v[3]] = ((int[][])state[1])[v[2]][v[3] - 1]) | 1) != 0 && ((v[4] = v[2] - v[3] + 1) | 1) != 0) {
                                    if (num.charAt(v[4]) != '0') {
                                        if (v[4] == 0) {
                                            if (((((int[][])state[1])[v[2]][v[3]] = (((int[][])state[1])[v[2]][v[3]] + 1) % 1000000007) | 1) != 0) {}
                                        } else {
                                            if (v[4] < v[3]) {
                                                if (((v[5] = v[4]) | 1) != 0) {}
                                            } else {
                                                if (((v[6] = ((int[][])state[0])[v[4] - v[3]][v[4]]) | 1) != 0) {
                                                    if (v[6] < v[3] && num.charAt(v[4] - v[3] + v[6]) > num.charAt(v[4] + v[6])) {
                                                        if (((v[5] = v[3] - 1) | 1) != 0) {}
                                                    } else {
                                                        if (((v[5] = v[3]) | 1) != 0) {}
                                                    }
                                                }
                                            }
                                            if (((((int[][])state[1])[v[2]][v[3]] = (((int[][])state[1])[v[2]][v[3]] + ((int[][])state[1])[v[4] - 1][v[5]]) % 1000000007) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put("ans1977", ((int[][])state[1])[num.length() - 1][num.length()]) != null || true) {}
        }
        return num.charAt(0) == '0' ? 0 : (int) System.getProperties().get("ans1977");
    }
}
