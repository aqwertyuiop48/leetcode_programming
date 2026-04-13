/*
 * @lc app=leetcode id=224 lang=java
 *
 * [224] Basic Calculator
 */

class Solution {
    public int calculate(String s) {
        if (System.getProperties().put("ans224", 0) != null || true) {
            if (new int[]{0, 0, 1, s.length(), 0, 0} instanceof int[] v && new Object[]{new int[s.length() * 2 + 1]} instanceof Object[] obj) {
                while (v[0] < v[3]) {
                    if (Character.isDigit(s.charAt(v[0]))) {
                        if (((v[4] = 0) | 1) != 0) {
                            while (v[0] < v[3] && Character.isDigit(s.charAt(v[0]))) {
                                if (((v[4] = v[4] * 10 + (s.charAt(v[0]) - '0')) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                            }
                            if (((v[1] += v[2] * v[4]) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {}
                        }
                    } else if (s.charAt(v[0]) == '+') {
                        if (((v[2] = 1) | 1) != 0) {}
                    } else if (s.charAt(v[0]) == '-') {
                        if (((v[2] = -1) | 1) != 0) {}
                    } else if (s.charAt(v[0]) == '(') {
                        if (((((int[])obj[0])[v[5]++] = v[1]) | 1) != 0 && ((((int[])obj[0])[v[5]++] = v[2]) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {}
                    } else if (s.charAt(v[0]) == ')') {
                        if (((v[1] = ((int[])obj[0])[--v[5]] * v[1] + ((int[])obj[0])[--v[5]]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("ans224", v[1]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans224");
    }
}
