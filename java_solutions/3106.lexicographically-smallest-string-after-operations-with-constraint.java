/*
 * @lc app=leetcode id=3106 lang=java
 *
 * [3106] Lexicographically Smallest String After Operations With Constraint
 */

class Solution {
    public String getSmallestString(String s, int k) {
        if (new Object[]{s.toCharArray()} instanceof Object[] o && o[0] instanceof char[] c && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lss", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = k) | 1) != 0) {
                while (v[0] < c.length && v[1] > 0) {
                    if (((v[2] = Math.min(c[v[0]] - 'a', 'z' - c[v[0]] + 1)) | 1) != 0) {
                        if (v[1] >= v[2]) {
                            if (((c[v[0]] = 'a') | 1) != 0 && ((v[1] -= v[2]) | 1) != 0) {}
                        } else {
                            if (((c[v[0]] = (char)(c[v[0]] - v[1])) | 1) != 0 && ((v[1] = 0) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "lss", new String(c)) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "lss");
    }
}
