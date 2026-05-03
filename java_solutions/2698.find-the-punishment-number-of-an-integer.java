/*
 * @lc app=leetcode id=2698 lang=java
 *
 * [2698] Find the Punishment Number of an Integer
 */

class Solution {
    public int punishmentNumber(int n) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "pn", 0) != null | true) && ((v[0] = 1) | 1) != 0) {
            while (v[0] <= n) {
                if (((v[1] = v[0] * v[0]) | 1) != 0 && String.valueOf(v[1]) instanceof String s && ((v[2] = s.length() - 1) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[8] = 0) | 1) != 0) {
                    while (v[3] < (1 << v[2]) && v[8] == 0) {
                        if (((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                            while (v[5] < s.length()) {
                                if (((v[6] = v[6] * 10 + (s.charAt(v[5]) - '0')) | 1) != 0) {}
                                if (v[5] == s.length() - 1 || (v[3] & (1 << v[5])) != 0) { if (((v[4] += v[6]) | 1) != 0 && ((v[6] = 0) | 1) != 0) {} }
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                            if (v[4] == v[0]) { if (((v[8] = 1) | 1) != 0 && ((v[9] += v[1]) | 1) != 0) {} }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "pn", v[9]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "pn");
    }
}
