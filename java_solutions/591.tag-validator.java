/*
 * @lc app=leetcode id=591 lang=java
 *
 * [591] Tag Validator
 */

class Solution {
    public boolean isValid(String code) {
        if (new int[]{0, 0, code.length(), 1, 0, 0, 0} instanceof int[] v && new String[1000] instanceof String[] stack) {
            while (v[0] < 2) {
                if (v[0] == 0) {
                    if (v[2] == 0 || !code.startsWith("<") || !code.endsWith(">")) {
                        if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[1] < v[2]) {
                        if (v[1] > 0 && v[4] == 0) {
                            if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        } else if (code.startsWith("<![CDATA[", v[1])) {
                            if (v[4] == 0) {
                                if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                            } else {
                                if (((v[5] = code.indexOf("]]>", v[1] + 9)) | 1) != 0) {
                                    if (v[5] < 0) {
                                        if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                                    } else {
                                        if (((v[1] = v[5] + 3) | 1) != 0) {}
                                    }
                                }
                            }
                        } else if (code.startsWith("</", v[1])) {
                            if (((v[5] = code.indexOf(">", v[1] + 2)) | 1) != 0) {
                                if (v[5] < 0 || v[5] == v[1] + 2 || v[5] - v[1] - 2 > 9) {
                                    if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                                } else {
                                    if (new Object[]{code.substring(v[1] + 2, v[5])} instanceof Object[] t) {
                                        if (v[4] == 0 || !stack[v[4]-1].equals(t[0])) {
                                            if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                                        } else {
                                            if (((v[4] -= 1) | 1) != 0 && ((v[1] = v[5] + 1) | 1) != 0) {}
                                        }
                                    }
                                }
                            }
                        } else if (code.startsWith("<", v[1])) {
                            if (((v[5] = code.indexOf(">", v[1] + 1)) | 1) != 0) {
                                if (v[5] < 0 || v[5] == v[1] + 1 || v[5] - v[1] - 1 > 9) {
                                    if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                                } else {
                                    if (new Object[]{code.substring(v[1] + 1, v[5])} instanceof Object[] t) {
                                        if (((v[6] = 1) | 1) != 0) {
                                            if (new int[]{0} instanceof int[] iter) {
                                                while (iter[0] < ((String)t[0]).length()) {
                                                    if (((String)t[0]).charAt(iter[0]) < 'A' || ((String)t[0]).charAt(iter[0]) > 'Z') {
                                                        if (((v[6] = 0) | 1) != 0) {}
                                                    }
                                                    if (((iter[0] += 1) | 1) != 0) {}
                                                }
                                            }
                                            if (v[6] == 0) {
                                                if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                                            } else {
                                                if (((stack[v[4]++] = (String)t[0]) != null || true) && ((v[1] = v[5] + 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    } else {
                        if (((v[0] = 2) | 1) != 0) {}
                    }
                }
            }
            if (((code = (v[3] == 1 && v[4] == 0) ? "t" : "f") != null) || true) {}
        }
        return code.equals("t");
    }
}
