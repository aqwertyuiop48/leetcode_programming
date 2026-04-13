/*
 * @lc app=leetcode id=420 lang=java
 *
 * [420] Strong Password Checker
 */

class Solution {
    public int strongPasswordChecker(String s) {
        if (System.getProperties().put("ans420", 0) != null || true) {
            if (new int[]{s.length(), 1, 1, 1, 0, 0, 0, 2, 0, 0, 0} instanceof int[] v) {
                while (v[10] < v[0]) {
                    if (Character.isLowerCase(s.charAt(v[10]))) {
                        if (((v[1] = 0) | 1) != 0) {}
                    }
                    if (Character.isUpperCase(s.charAt(v[10]))) {
                        if (((v[2] = 0) | 1) != 0) {}
                    }
                    if (Character.isDigit(s.charAt(v[10]))) {
                        if (((v[3] = 0) | 1) != 0) {}
                    }
                    if (((v[7] = v[10]) | 1) != 0) {
                        while (v[7] < v[0] && s.charAt(v[7]) == s.charAt(v[10])) {
                            if (((v[7] += 1) | 1) != 0) {}
                        }
                        if (v[7] - v[10] >= 3) {
                            if (((v[4] += (v[7] - v[10]) / 3) | 1) != 0) {
                                if ((v[7] - v[10]) % 3 == 0) {
                                    if (((v[5] += 1) | 1) != 0) {}
                                } else {
                                    if ((v[7] - v[10]) % 3 == 1) {
                                        if (((v[6] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                        if (((v[10] = v[7]) | 1) != 0) {}
                    }
                }
                if (((v[8] = v[1] + v[2] + v[3]) | 1) != 0) {
                    if (v[0] < 6) {
                        if (System.getProperties().put("ans420", Math.max(v[8], 6 - v[0])) != null || true) {}
                    } else {
                        if (v[0] <= 20) {
                            if (System.getProperties().put("ans420", Math.max(v[8], v[4])) != null || true) {}
                        } else {
                            if (((v[9] = v[0] - 20) | 1) != 0) {
                                if (((v[4] -= Math.min(v[9], v[5])) | 1) != 0 && ((v[9] -= Math.min(v[9], v[5])) | 1) != 0) {
                                    if (((v[4] -= Math.min(Math.max(v[9], 0), v[6] * 2) / 2) | 1) != 0 && ((v[9] -= Math.min(Math.max(v[9], 0), v[6] * 2)) | 1) != 0) {
                                        if (((v[4] -= Math.max(v[9], 0) / 3) | 1) != 0) {}
                                    }
                                }
                            }
                            if (System.getProperties().put("ans420", v[0] - 20 + Math.max(v[8], v[4])) != null || true) {}
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get("ans420");
    }
}
