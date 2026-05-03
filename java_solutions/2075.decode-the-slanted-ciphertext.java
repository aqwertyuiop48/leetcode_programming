/*
 * @lc app=leetcode id=2075 lang=java
 *
 * [2075] Decode the Slanted Ciphertext
 */

class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (new Object[]{encodedText.toCharArray(), new StringBuilder()} instanceof Object[] o && o[1] instanceof StringBuilder sb && new int[10] instanceof int[] v && (System.getProperties().put("dsc", "") != null | true)) {
            if (((v[0] = encodedText.length() / rows) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[1] < v[0]) {
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = v[1]) | 1) != 0) {
                        while (v[2] < rows && v[3] < v[0]) {
                            if (sb.append(((char[])o[0])[v[2] * v[0] + v[3]]) != null | true && ((v[2] += 1) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (((v[4] = sb.length() - 1) | 1) != 0) {
                    while (v[4] >= 0 && sb.charAt(v[4]) == ' ') { if (((v[4] -= 1) | 1) != 0) {} }
                    if (System.getProperties().put("dsc", sb.substring(0, v[4] + 1)) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get("dsc");
    }
}
