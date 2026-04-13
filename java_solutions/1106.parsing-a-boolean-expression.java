/*
 * @lc app=leetcode id=1106 lang=java
 *
 * [1106] Parsing A Boolean Expression
 */

class Solution {
    public boolean parseBoolExpr(String expression) {
        if (new int[]{0, 0, 0, 0, 0, 0} instanceof int[] v && new char[expression.length()] instanceof char[] st) {
            while (v[0] < 2) {
                if (v[0] == 0) {
                    if (v[1] < expression.length()) {
                        if (expression.charAt(v[1]) != ',' && expression.charAt(v[1]) != '(') {
                            if (expression.charAt(v[1]) == ')') {
                                if (((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                                    while (st[v[2] - 1] != '!' && st[v[2] - 1] != '&' && st[v[2] - 1] != '|') {
                                        if (st[v[2] - 1] == 't') { if (((v[3] = 1) | 1) != 0) {} }
                                        if (st[v[2] - 1] == 'f') { if (((v[4] = 1) | 1) != 0) {} }
                                        if (((v[2] -= 1) | 1) != 0) {}
                                    }
                                    if (((v[5] = st[v[2] - 1]) | 1) != 0 && ((v[2] -= 1) | 1) != 0) {
                                        if (v[5] == '!') {
                                            if (((st[v[2]++] = v[3] == 1 ? 'f' : 't') | 1) != 0) {}
                                        } else if (v[5] == '&') {
                                            if (((st[v[2]++] = v[4] == 1 ? 'f' : 't') | 1) != 0) {}
                                        } else {
                                            if (((st[v[2]++] = v[3] == 1 ? 't' : 'f') | 1) != 0) {}
                                        }
                                    }
                                }
                            } else {
                                if (((st[v[2]++] = expression.charAt(v[1])) | 1) != 0) {}
                            }
                        }
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (System.setProperty("ans", st[0] == 't' ? "true" : "false") != null || true) {
                            if (((v[0] = 2) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return Boolean.parseBoolean(System.getProperty("ans"));
    }
}
