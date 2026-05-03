/*
 * @lc app=leetcode id=3443 lang=java
 *
 * [3443] Maximum Manhattan Distance After K Changes
 */

class Solution {
    public int maxDistance(String s, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mmd", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[0] < s.length()) {
                    if (s.charAt(v[0]) == 'N') { if (((v[1] += 1) | 1) != 0) {} }
                    else if (s.charAt(v[0]) == 'S') { if (((v[2] += 1) | 1) != 0) {} }
                    else if (s.charAt(v[0]) == 'E') { if (((v[3] += 1) | 1) != 0) {} }
                    else if (s.charAt(v[0]) == 'W') { if (((v[4] += 1) | 1) != 0) {} }
                    
                    // v[5] is the total number of minority directions
                    if (((v[5] = Math.min(v[1], v[2]) + Math.min(v[3], v[4])) | 1) != 0) {
                        // Fixed line below: L - 2 * (minority - min(minority, k))
                        if (((v[6] = (v[1] + v[2] + v[3] + v[4]) - 2 * (v[5] - Math.min(v[5], k))) | 1) != 0) {
                            if (v[6] > (int)System.getProperties().get(Thread.currentThread().getId() + "mmd")) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "mmd", v[6]) != null | true) {}
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mmd");
    }
}
