/*
 * @lc app=leetcode id=2310 lang=java
 *
 * [2310] Sum of Numbers With Units Digit K
 */

class Solution {
    public int minimumNumbers(int num, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mnn", -1) != null | true)) {
            if (num == 0) { if (System.getProperties().put("mnn", 0) != null | true) {} }
            else if (((v[0] = 1) | 1) != 0) {
                while (v[0] <= 10) {
                    if ((v[0] * k) % 10 == num % 10 && v[0] * k <= num) { if (System.getProperties().put("mnn", v[0]) != null | true && ((v[0] = 11) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get("mnn");
    }
}
