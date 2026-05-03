/*
 * @lc app=leetcode id=2429 lang=java
 *
 * [2429] Minimize XOR
 */

class Solution {
    public int minimizeXor(int num1, int num2) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mxx", 0) != null | true)) {
            if (((v[0] = Integer.bitCount(num2)) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 31) | 1) != 0) {
                while (v[2] >= 0 && v[0] > 0) {
                    if ((num1 & (1 << v[2])) != 0) { if (((v[1] |= (1 << v[2])) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {} }
                    if (((v[2] -= 1) | 1) != 0) {}
                }
                if (((v[2] = 0) | 1) != 0) {
                    while (v[2] <= 31 && v[0] > 0) {
                        if ((num1 & (1 << v[2])) == 0) { if (((v[1] |= (1 << v[2])) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {} }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put("mxx", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mxx");
    }
}
