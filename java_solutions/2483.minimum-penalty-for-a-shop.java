/*
 * @lc app=leetcode id=2483 lang=java
 *
 * [2483] Minimum Penalty for a Shop
 */

class Solution {
    public int bestClosingTime(String customers) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "bct", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
            while (v[0] < customers.length()) { if (customers.charAt(v[0]) == 'Y') { if (((v[1] += 1) | 1) != 0) {} } if (((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0 && ((v[4] = v[1]) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                while (v[0] < customers.length()) {
                    if (customers.charAt(v[0]) == 'Y') { if (((v[1] -= 1) | 1) != 0) {} }
                    else { if (((v[2] += 1) | 1) != 0) {} }
                    if (v[1] + v[2] < v[4]) { if (((v[4] = v[1] + v[2]) | 1) != 0 && ((v[5] = v[0] + 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "bct", v[5]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "bct");
    }
}
