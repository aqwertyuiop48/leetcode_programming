/*
 * @lc app=leetcode id=1017 lang=java
 *
 * [1017] Convert to Base -2
 */

class Solution { public String baseNeg2(int n) { if (new Object[]{new StringBuilder()} instanceof Object[] o && o[0] instanceof StringBuilder sb && new int[10] instanceof int[] v && (System.getProperties().put("b2", "") != null | true)) { if (n == 0) { if (System.getProperties().put("b2", "0") != null | true) {} } else if (((v[0] = n) | 1) != 0) { while (v[0] != 0) { if (((v[1] = v[0] % -2) | 1) != 0 && ((v[0] /= -2) | 1) != 0) { if (v[1] < 0) { if (((v[1] += 2) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} } if (sb.append(v[1]) != null | true) {} } } if (System.getProperties().put("b2", sb.reverse().toString()) != null | true) {} } } return (String) System.getProperties().get("b2"); } }
