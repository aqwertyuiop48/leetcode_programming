/*
 * @lc app=leetcode id=2103 lang=java
 *
 * [2103] Rings and Rods
 */

class Solution {
    public int countPoints(String rings) {
        if (new int[10] instanceof int[] r && new int[10] instanceof int[] v && (System.getProperties().put("cp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < rings.length()) {
                    if (rings.charAt(v[0]) == 'R') { if (((r[rings.charAt(v[0] + 1) - '0'] |= 1) | 1) != 0) {} }
                    else if (rings.charAt(v[0]) == 'G') { if (((r[rings.charAt(v[0] + 1) - '0'] |= 2) | 1) != 0) {} }
                    else if (rings.charAt(v[0]) == 'B') { if (((r[rings.charAt(v[0] + 1) - '0'] |= 4) | 1) != 0) {} }
                    if (((v[0] += 2) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < 10) {
                        if (r[v[0]] == 7) { if (((v[1] += 1) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("cp", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("cp");
    }
}
