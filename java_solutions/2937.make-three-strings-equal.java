/*
 * @lc app=leetcode id=2937 lang=java
 *
 * [2937] Make Three Strings Equal
 */

class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mo", -1) != null | true) && ((v[0] = Math.min(s1.length(), Math.min(s2.length(), s3.length()))) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[1] < v[0] && s1.charAt(v[1]) == s2.charAt(v[1]) && s2.charAt(v[1]) == s3.charAt(v[1])) {
                if (((v[1] += 1) | 1) != 0) {}
            }
            if (v[1] > 0) { if (System.getProperties().put(Thread.currentThread().getId() + "mo", s1.length() + s2.length() + s3.length() - 3 * v[1]) != null | true) {} }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mo");
    }
}
