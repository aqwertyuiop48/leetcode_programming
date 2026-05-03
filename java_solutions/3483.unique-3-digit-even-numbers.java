/*
 * @lc app=leetcode id=3483 lang=java
 *
 * [3483] Unique 3-Digit Even Numbers
 */

class Solution {
    public int totalNumbers(int[] digits) {
        if (new int[10] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "tn", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < digits.length) { if (((cnt[digits[v[0]]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 100) | 1) != 0) {
                while (v[0] < 1000) {
                    if (v[0] % 2 == 0 && cnt[v[0] % 10] > 0 && ((cnt[v[0] % 10] -= 1) | 1) != 0) {
                        if (cnt[(v[0] / 10) % 10] > 0 && ((cnt[(v[0] / 10) % 10] -= 1) | 1) != 0) {
                            if (cnt[v[0] / 100] > 0) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "tn", (int)System.getProperties().get(Thread.currentThread().getId() + "tn") + 1) != null | true) {}
                            }
                            if (((cnt[(v[0] / 10) % 10] += 1) | 1) != 0) {}
                        }
                        if (((cnt[v[0] % 10] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 2) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "tn");
    }
}
