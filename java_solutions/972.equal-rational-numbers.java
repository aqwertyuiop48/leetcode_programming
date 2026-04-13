/*
 * @lc app=leetcode id=972 lang=java
 *
 * [972] Equal Rational Numbers
 */

class Solution {
    public boolean isRationalEqual(String s, String t) {
        if (new double[]{0.0, 0.0} instanceof double[] d && new String[]{s, t, null, null} instanceof String[] str) {
            if (new int[]{0, 0, 0, 0} instanceof int[] v) {
                while (v[0] < 4) {
                    if (v[0] < 2) {
                        if (((v[1] = str[v[0]].indexOf('(')) | 1) != 0) {
                            if (v[1] < 0) {
                                if ((d[v[0]] = Double.parseDouble(str[v[0]])) != -10.0) {
                                    if (((v[0] += 1) | 1) != 0) {}
                                }
                            } else {
                                if (((v[2] = str[v[0]].indexOf(')')) | 1) != 0) {
                                    if (((str[2] = str[v[0]].substring(0, v[1])) != null) || true) {
                                        if (((str[3] = str[v[0]].substring(v[1] + 1, v[2])) != null) || true) {
                                            if ((d[v[0]] = Double.parseDouble(str[2])) != -10.0) {
                                                if (((v[3] = v[1] - str[v[0]].indexOf('.') - 1) | 1) != 0) {
                                                    if (v[3] < 0) { if (((v[3] = 0) | 1) != 0) {} }
                                                    if ((d[v[0]] += (Double.parseDouble(str[3]) / (Math.pow(10, str[3].length()) - 1)) / Math.pow(10, v[3])) != -10.0) {
                                                        if (((v[0] += 1) | 1) != 0) {}
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (System.setProperty("ans", Math.abs(d[0] - d[1]) < 1e-10 ? "true" : "false") != null || true) {
                            if (((v[0] = 4) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return Boolean.parseBoolean(System.getProperty("ans", "false"));
    }
}
