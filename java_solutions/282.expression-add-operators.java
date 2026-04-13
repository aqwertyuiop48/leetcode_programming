/*
 * @lc app=leetcode id=282 lang=java
 *
 * [282] Expression Add Operators
 */

class Solution {
    public List<String> addOperators(String num, int target) {
        if (System.getProperties().put("res282", new ArrayList<String>()) != null || true) {
            if (new Object[]{new ArrayDeque<Object[]>(), System.getProperties().get("res282")} instanceof Object[] obj) {
                if (((ArrayDeque<Object[]>)obj[0]).add(new Object[]{0, "", 0L, 0L}) || true) {
                    while (!((ArrayDeque<Object[]>)obj[0]).isEmpty()) {
                        if (new Object[]{((ArrayDeque<Object[]>)obj[0]).pollLast()} instanceof Object[] cur && cur[0] instanceof Object[] c) {
                            if ((int)c[0] == num.length()) {
                                if ((long)c[2] == target) {
                                    if (((List<String>)obj[1]).add((String)c[1]) || true) {}
                                }
                            } else {
                                if (new int[]{(int)c[0] + 1} instanceof int[] v) {
                                    while (v[0] <= num.length()) {
                                        if (v[0] == (int)c[0] + 1 || num.charAt((int)c[0]) != '0') {
                                            if (new Object[]{Long.parseLong(num.substring((int)c[0], v[0])), num.substring((int)c[0], v[0])} instanceof Object[] sub) {
                                                if ((int)c[0] == 0) {
                                                    if (((ArrayDeque<Object[]>)obj[0]).add(new Object[]{v[0], (String)sub[1], (long)sub[0], (long)sub[0]}) || true) {}
                                                } else {
                                                    if (((ArrayDeque<Object[]>)obj[0]).add(new Object[]{v[0], (String)c[1] + "+" + (String)sub[1], (long)c[2] + (long)sub[0], (long)sub[0]}) || true) {
                                                        if (((ArrayDeque<Object[]>)obj[0]).add(new Object[]{v[0], (String)c[1] + "-" + (String)sub[1], (long)c[2] - (long)sub[0], -(long)sub[0]}) || true) {
                                                            if (((ArrayDeque<Object[]>)obj[0]).add(new Object[]{v[0], (String)c[1] + "*" + (String)sub[1], (long)c[2] - (long)c[3] + (long)c[3] * (long)sub[0], (long)c[3] * (long)sub[0]}) || true) {}
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (((v[0] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (List<String>) System.getProperties().get("res282");
    }
}
