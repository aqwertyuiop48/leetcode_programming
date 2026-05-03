/*
 * @lc app=leetcode id=1021 lang=java
 *
 * [1021] Remove Outermost Parentheses
 */

class Solution { public String removeOuterParentheses(String s) { if (new Object[]{new StringBuilder()} instanceof Object[] o && o[0] instanceof StringBuilder sb && new int[10] instanceof int[] v && (System.getProperties().put("rop", "") != null | true)) { if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) { while (v[0] < s.length()) { if (s.charAt(v[0]) == '(') { if (v[1] > 0) { if (sb.append('(') != null | true) {} } if (((v[1] += 1) | 1) != 0) {} } else { if (((v[1] -= 1) | 1) != 0 && v[1] > 0) { if (sb.append(')') != null | true) {} } } if (((v[0] += 1) | 1) != 0) {} } if (System.getProperties().put("rop", sb.toString()) != null | true) {} } } return (String) System.getProperties().get("rop"); } }
