/*
 * @lc app=leetcode id=3271 lang=java
 *
 * [3271] Hash Divided String
 */

class Solution {
    public String stringHash(String s, int k) {
        if (new Object[]{new char[s.length() / k]} instanceof Object[] o && o[0] instanceof char[] c && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sh", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < s.length() / k) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[2] < k) {
                            if (((v[1] += s.charAt(v[0] * k + v[2]) - 'a') | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                        }
                        if (((c[v[0]] = (char)('a' + (v[1] % 26))) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "sh", new String(c)) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "sh");
    }
}
