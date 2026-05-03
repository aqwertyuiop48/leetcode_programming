/*
 * @lc app=leetcode id=2443 lang=java
 *
 * [2443] Sum of Number and Its Reverse
 */

class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("snr", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= num) {
                    if (((v[1] = v[0]) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[1] > 0) { if (((v[2] = v[2] * 10 + v[1] % 10) | 1) != 0 && ((v[1] /= 10) | 1) != 0) {} }
                        if (v[0] + v[2] == num) { if (System.getProperties().put("snr", true) != null | true && ((v[0] = num + 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get("snr");
    }
}
