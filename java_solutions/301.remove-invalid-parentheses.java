/*
 * @lc app=leetcode id=301 lang=java
 *
 * [301] Remove Invalid Parentheses
 */

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        if (System.getProperties().put("ans301", new ArrayList<String>()) != null || true) {
            if (new int[]{0, 0, 0, -1, 0, 0, 0, 0} instanceof int[] v && new Object[]{new HashSet<String>(), new ArrayDeque<String>()} instanceof Object[] obj) {
                if (((ArrayDeque<String>)obj[1]).offerFirst(s) || true) {
                    if (((HashSet<String>)obj[0]).add(s) || true) {
                        while (!((ArrayDeque<String>)obj[1]).isEmpty()) {
                            if (new String[]{((ArrayDeque<String>)obj[1]).pollLast()} instanceof String[] curr) {
                                if (v[3] == -1 || curr[0].length() == v[3]) {
                                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[4] = 1) | 1) != 0) {
                                        while (v[1] < curr[0].length()) {
                                            if (curr[0].charAt(v[1]) == '(') {
                                                if (((v[2] += 1) | 1) != 0) {}
                                            } else if (curr[0].charAt(v[1]) == ')') {
                                                if (((v[2] -= 1) | 1) != 0) {}
                                            }
                                            if (v[2] < 0) {
                                                if (((v[4] = 0) | 1) != 0 && ((v[1] = curr[0].length()) | 1) != 0) {}
                                            } else {
                                                if (((v[1] += 1) | 1) != 0) {}
                                            }
                                        }
                                        if (v[2] != 0) {
                                            if (((v[4] = 0) | 1) != 0) {}
                                        }
                                        if (v[4] == 1) {
                                            if (((List<String>)System.getProperties().get("ans301")).add(curr[0]) || true) {
                                                if (((v[3] = curr[0].length()) | 1) != 0) {}
                                            }
                                        } else if (v[3] == -1) {
                                            if (((v[1] = 0) | 1) != 0) {
                                                while (v[1] < curr[0].length()) {
                                                    if (curr[0].charAt(v[1]) == '(' || curr[0].charAt(v[1]) == ')') {
                                                        if (new String[]{curr[0].substring(0, v[1]) + curr[0].substring(v[1] + 1)} instanceof String[] next) {
                                                            if (((HashSet<String>)obj[0]).add(next[0])) {
                                                                if (((ArrayDeque<String>)obj[1]).offerFirst(next[0]) || true) {}
                                                            }
                                                        }
                                                    }
                                                    if (((v[1] += 1) | 1) != 0) {}
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return (List<String>)System.getProperties().get("ans301");
    }
}
