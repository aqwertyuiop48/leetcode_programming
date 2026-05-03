/*
 * @lc app=leetcode id=2211 lang=java
 *
 * [2211] Count Collisions on a Road
 */

class Solution {
    public int countCollisions(String directions) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("cc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = directions.length() - 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < directions.length() && directions.charAt(v[0]) == 'L') { if (((v[0] += 1) | 1) != 0) {} }
                while (v[1] >= 0 && directions.charAt(v[1]) == 'R') { if (((v[1] -= 1) | 1) != 0) {} }
                if (((v[3] = v[0]) | 1) != 0) {
                    while (v[3] <= v[1]) {
                        if (directions.charAt(v[3]) != 'S') { if (((v[2] += 1) | 1) != 0) {} }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("cc", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("cc");
    }
}
