/*
 * @lc app=leetcode id=2232 lang=java
 *
 * [2232] Minimize Result by Adding Parentheses to Expression
 */

class Solution {
    public String minimizeResult(String expression) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mr", "") != null | true) && expression.split("\\+") instanceof String[] p && ((v[0] = p[0].length()) | 1) != 0 && ((v[1] = p[1].length()) | 1) != 0 && ((v[2] = Integer.MAX_VALUE) | 1) != 0) {
            if (new String[1] instanceof String[] ans && ((v[3] = 0) | 1) != 0) {
                while (v[3] < v[0]) {
                    if (((v[4] = 1) | 1) != 0) {
                        while (v[4] <= v[1]) {
                            if (((v[5] = v[3] == 0 ? 1 : Integer.parseInt(p[0].substring(0, v[3]))) | 1) != 0 && ((v[6] = Integer.parseInt(p[0].substring(v[3]))) | 1) != 0 && ((v[7] = Integer.parseInt(p[1].substring(0, v[4]))) | 1) != 0 && ((v[8] = v[4] == v[1] ? 1 : Integer.parseInt(p[1].substring(v[4]))) | 1) != 0) {
                                if (v[5] * (v[6] + v[7]) * v[8] < v[2]) {
                                    if (((v[2] = v[5] * (v[6] + v[7]) * v[8]) | 1) != 0 && ((ans[0] = p[0].substring(0, v[3]) + "(" + p[0].substring(v[3]) + "+" + p[1].substring(0, v[4]) + ")" + p[1].substring(v[4])) != null | true)) {}
                                }
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[3] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mr", ans[0]) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "mr");
    }
}
