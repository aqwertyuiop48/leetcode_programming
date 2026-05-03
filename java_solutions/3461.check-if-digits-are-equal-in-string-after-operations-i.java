/*
 * @lc app=leetcode id=3461 lang=java
 *
 * [3461] Check If Digits Are Equal in String After Operations I
 */

class Solution {
    public boolean hasSameDigits(String s) {
        if (new Object[]{s.toCharArray()} instanceof Object[] o && o[0] instanceof char[] c && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "hsd", false) != null | true)) {
            if (((v[0] = s.length()) | 1) != 0) {
                while (v[0] > 2) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < v[0] - 1) {
                            if (((c[v[1]] = (char)(((c[v[1]] - '0' + c[v[1] + 1] - '0') % 10) + '0')) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (c[0] == c[1]) {
                    if (System.getProperties().put(Thread.currentThread().getId() + "hsd", true) != null | true) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "hsd");
    }
}
