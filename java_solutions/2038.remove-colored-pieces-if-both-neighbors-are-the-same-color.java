/*
 * @lc app=leetcode id=2038 lang=java
 *
 * [2038] Remove Colored Pieces if Both Neighbors are the Same Color
 */

class Solution {
    public boolean winnerOfGame(String colors) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("wog", false) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < colors.length() - 1) {
                    if (colors.charAt(v[0]) == 'A' && colors.charAt(v[0] - 1) == 'A' && colors.charAt(v[0] + 1) == 'A') { if (((v[1] += 1) | 1) != 0) {} }
                    if (colors.charAt(v[0]) == 'B' && colors.charAt(v[0] - 1) == 'B' && colors.charAt(v[0] + 1) == 'B') { if (((v[2] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("wog", v[1] > v[2]) != null | true) {}
            }
        }
        return (boolean) System.getProperties().get("wog");
    }
}
