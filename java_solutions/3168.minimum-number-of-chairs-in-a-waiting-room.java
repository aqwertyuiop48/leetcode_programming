/*
 * @lc app=leetcode id=3168 lang=java
 *
 * [3168] Minimum Number of Chairs in a Waiting Room
 */

class Solution {
    public int minimumChairs(String s) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mnc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt(v[0]) == 'E') {
                        if (((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((v[1] -= 1) | 1) != 0) {}
                    }
                    if (v[1] > v[2]) {
                        if (((v[2] = v[1]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mnc", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mnc");
    }
}
