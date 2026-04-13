/*
 * @lc app=leetcode id=1096 lang=java
 *
 * [1096] Brace Expansion II
 */

class Solution {
    public List<String> braceExpansionII(String expression) {
        if (new int[]{0, 0, 0, 0} instanceof int[] v && new Object[]{new ArrayDeque<String>(), new TreeSet<String>()} instanceof Object[] obj) {
            if ((((ArrayDeque<String>)obj[0]).add(expression)) || true) {
                while (!((ArrayDeque<String>)obj[0]).isEmpty()) {
                    if (((ArrayDeque<String>)obj[0]).poll() instanceof String exp) {
                        if (((v[1] = exp.indexOf('}')) | 1) != 0) {
                            if (v[1] == -1) {
                                if ((((TreeSet<String>)obj[1]).add(exp)) || true) {}
                            } else {
                                if (((v[2] = v[1]) | 1) != 0) {
                                    while (exp.charAt(v[2]) != '{') {
                                        if (((v[2] -= 1) | 1) != 0) {}
                                    }
                                    if (exp.substring(v[2] + 1, v[1]).split(",") instanceof String[] arr) {
                                        if (((v[3] = 0) | 1) != 0) {
                                            while (v[3] < arr.length) {
                                                if ((((ArrayDeque<String>)obj[0]).add(exp.substring(0, v[2]) + arr[v[3]] + exp.substring(v[1] + 1))) || true) {
                                                    if (((v[3] += 1) | 1) != 0) {}
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (System.getProperties().put("brace", new ArrayList<String>((TreeSet<String>)obj[1])) != null || true) {}
            }
        }
        return (List<String>) System.getProperties().get("brace");
    }
}
