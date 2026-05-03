/*
 * @lc app=leetcode id=1807 lang=java
 *
 * [1807] Evaluate the Bracket Pairs of a String
 */

class Solution {
    public String evaluate(String s, java.util.List<java.util.List<String>> knowledge) {
        if (System.getProperties().put("ebp_m", new java.util.HashMap<String, String>()) != null | true && new Object[]{new StringBuilder()} instanceof Object[] o && o[0] instanceof StringBuilder sb && new int[10] instanceof int[] v && (System.getProperties().put("ebp", "") != null | true)) {
            if (System.getProperties().get("ebp_m") instanceof java.util.Map m && ((v[0] = 0) | 1) != 0) {
                while (v[0] < knowledge.size()) { if (m.put(knowledge.get(v[0]).get(0), knowledge.get(v[0]).get(1)) == null | true && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = -1) | 1) != 0) {
                    while (v[0] < s.length()) {
                        if (s.charAt(v[0]) == '(') { if (((v[1] = v[0]) | 1) != 0) {} }
                        else if (s.charAt(v[0]) == ')') {
                            if (sb.append((String)m.getOrDefault(s.substring(v[1] + 1, v[0]), "?")) != null | true && ((v[1] = -1) | 1) != 0) {}
                        } else if (v[1] == -1) {
                            if (sb.append(s.charAt(v[0])) != null | true) {}
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("ebp", sb.toString()) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get("ebp");
    }
}
