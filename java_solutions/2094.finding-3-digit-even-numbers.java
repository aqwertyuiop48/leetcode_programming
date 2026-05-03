/*
 * @lc app=leetcode id=2094 lang=java
 *
 * [2094] Finding 3-Digit Even Numbers
 */

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        if (new int[10] instanceof int[] c && new int[10] instanceof int[] v && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList list && (System.getProperties().put(Thread.currentThread().getId() + "fen", new int[0]) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < digits.length) { if (((c[digits[v[0]]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 100) | 1) != 0) {
                while (v[0] < 1000) {
                    if (new int[10] instanceof int[] cur && ((cur[v[0] % 10] += 1) | 1) != 0 && ((cur[(v[0] / 10) % 10] += 1) | 1) != 0 && ((cur[v[0] / 100] += 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                        while (v[1] < 10) { if (cur[v[1]] > c[v[1]]) { if (((v[2] = 0) | 1) != 0) {} } if (((v[1] += 1) | 1) != 0) {} }
                        if (v[2] == 1) { if (list.add(v[0]) | true) {} }
                    }
                    if (((v[0] += 2) | 1) != 0) {}
                }
                if (new int[list.size()] instanceof int[] ans && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < list.size()) { if (((ans[v[0]] = (int)list.get(v[0])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    if (System.getProperties().put(Thread.currentThread().getId() + "fen", ans) != null | true) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "fen");
    }
}
