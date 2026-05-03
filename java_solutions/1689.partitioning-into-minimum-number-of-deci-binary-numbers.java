/*
 * @lc app=leetcode id=1689 lang=java
 *
 * [1689] Partitioning Into Minimum Number Of Deci-Binary Numbers
 */

class Solution {
    public int minPartitions(String n) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mpb", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < n.length()) {
                    if (n.charAt(v[0]) - '0' > v[1]) { if (((v[1] = n.charAt(v[0]) - '0') | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("mpb", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mpb");
    }
}
