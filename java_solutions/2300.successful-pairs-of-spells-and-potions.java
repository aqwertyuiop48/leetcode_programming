/*
 * @lc app=leetcode id=2300 lang=java
 *
 * [2300] Successful Pairs of Spells and Potions
 */

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        if (new int[spells.length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("spp", ans) != null | true)) {
            if (new Object[]{java.util.Arrays.stream(potions).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] p) {
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < spells.length) {
                        if (((v[1] = 0) | 1) != 0 && ((v[2] = p.length - 1) | 1) != 0 && ((v[3] = p.length) | 1) != 0) {
                            while (v[1] <= v[2]) {
                                if (((v[4] = v[1] + (v[2] - v[1]) / 2) | 1) != 0) {
                                    if ((long)p[v[4]] * spells[v[0]] >= success) { if (((v[3] = v[4]) | 1) != 0 && ((v[2] = v[4] - 1) | 1) != 0) {} }
                                    else { if (((v[1] = v[4] + 1) | 1) != 0) {} }
                                }
                            }
                            if (((ans[v[0]] = p.length - v[3]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get("spp");
    }
}
