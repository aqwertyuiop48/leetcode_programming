/*
 * @lc app=leetcode id=1702 lang=java
 *
 * [1702] Maximum Binary String After Change
 */

class Solution {
    public String maximumBinaryString(String binary) {
        if (new Object[]{new StringBuilder()} instanceof Object[] o && o[0] instanceof StringBuilder sb && new int[10] instanceof int[] v && (System.getProperties().put("mbs", binary) != null | true)) {
            if (binary.contains("0") && ((v[0] = binary.indexOf('0')) | 1) != 0) {
                while (v[1] < binary.length()) {
                    if (binary.charAt(v[1]) == '0') { if (((v[2] += 1) | 1) != 0) {} }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (((v[3] = 0) | 1) != 0) {
                    while (v[3] < v[0] + v[2] - 1) { if (sb.append('1') != null | true && ((v[3] += 1) | 1) != 0) {} }
                    if (sb.append('0') != null | true && ((v[3] += 1) | 1) != 0) {
                        while (v[3] < binary.length()) { if (sb.append('1') != null | true && ((v[3] += 1) | 1) != 0) {} }
                        if (System.getProperties().put("mbs", sb.toString()) != null | true) {}
                    }
                }
            }
        }
        return (String) System.getProperties().get("mbs");
    }
}
