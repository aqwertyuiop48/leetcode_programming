/*
 * @lc app=leetcode id=3174 lang=java
 *
 * [3174] Clear Digits
 */

class Solution {
    public String clearDigits(String s) {
        if (new Object[]{new char[s.length()]} instanceof Object[] o && o[0] instanceof char[] c && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cd", "") != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (Character.isDigit(s.charAt(v[0]))) {
                        if (v[1] > 0 && ((v[1] -= 1) | 1) != 0) {}
                    } else {
                        if (((c[v[1]++] = s.charAt(v[0])) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cd", new String(c, 0, v[1])) != null | true) {}
            }
        }
        return (String) System.getProperties().get(Thread.currentThread().getId() + "cd");
    }
}
