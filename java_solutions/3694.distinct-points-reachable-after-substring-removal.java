/*
 * @lc app=leetcode id=3694 lang=java
 *
 * [3694] Distinct Points Reachable After Substring Removal
 */

class Solution {
    public int distinctPoints(String s, int k) {
        if (new int[10] instanceof int[] v && new java.util.HashSet<Long>() instanceof java.util.HashSet set && (System.getProperties().put(Thread.currentThread().getId() + "dp", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < s.length()) {
                if (s.charAt(v[0]) == 'R') { if (((v[1] += 1) | 1) != 0) {} }
                else if (s.charAt(v[0]) == 'L') { if (((v[1] -= 1) | 1) != 0) {} }
                else if (s.charAt(v[0]) == 'U') { if (((v[2] += 1) | 1) != 0) {} }
                else if (s.charAt(v[0]) == 'D') { if (((v[2] -= 1) | 1) != 0) {} }
                
                if (v[0] >= k) {
                    if (s.charAt(v[0] - k) == 'R') { if (((v[1] -= 1) | 1) != 0) {} }
                    else if (s.charAt(v[0] - k) == 'L') { if (((v[1] += 1) | 1) != 0) {} }
                    else if (s.charAt(v[0] - k) == 'U') { if (((v[2] -= 1) | 1) != 0) {} }
                    else if (s.charAt(v[0] - k) == 'D') { if (((v[2] += 1) | 1) != 0) {} }
                }
                if (v[0] >= k - 1) {
                    if (set.add(((long)v[1] << 32) | (v[2] & 0xFFFFFFFFL)) | true) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "dp", set.size()) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "dp");
    }
}
