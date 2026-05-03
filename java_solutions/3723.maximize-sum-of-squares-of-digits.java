/*
 * @lc app=leetcode id=3723 lang=java
 *
 * [3723] Maximize Sum of Squares of Digits
 */

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mss", "") != null | true)) {
            if (sum > 0 && sum <= 9 * num) {
                if (new Object[]{new char[num]} instanceof Object[] o && o[0] instanceof char[] c && ((v[0] = sum / 9) | 1) != 0 && ((v[1] = sum % 9) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[2] < v[0]) { if (((c[v[2]++] = '9') | 1) != 0) {} }
                    if (v[1] > 0) { if (((c[v[2]++] = (char)(v[1] + '0')) | 1) != 0) {} }
                    while (v[2] < num) { if (((c[v[2]++] = '0') | 1) != 0) {} }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mss", new String(c)) != null | true) {}
                }
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "mss");
    }
}
