/*
 * @lc app=leetcode id=2522 lang=java
 *
 * [2522] Partition String Into Substrings With Values at Most K
 */

class Solution {
    public int minimumPartition(String s, int k) {
        if (new long[10] instanceof long[] v && (System.getProperties().put(Thread.currentThread().getId() + "mp", 1) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
            while (v[0] < s.length() && v[2] == 1) {
                if (s.charAt((int)v[0]) - '0' > k) { if (System.getProperties().put(Thread.currentThread().getId() + "mp", -1) != null | true && ((v[2] = 0) | 1) != 0) {} }
                else if (v[1] * 10 + (s.charAt((int)v[0]) - '0') > k) { if (((v[1] = s.charAt((int)v[0]) - '0') | 1) != 0 && ((v[3] += 1) | 1) != 0) {} } 
                else { if (((v[1] = v[1] * 10 + (s.charAt((int)v[0]) - '0')) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (v[2] == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "mp", (int)(v[3] + 1)) != null | true) {} }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mp");
    }
}
