/*
 * @lc app=leetcode id=3494 lang=java
 *
 * [3494] Find the Minimum Amount of Time to Brew Potions
 */

class Solution {
    public long minTime(int[] skill, int[] mana) {
        if (new long[skill.length] instanceof long[] pref && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put(Thread.currentThread().getId() + "mtbp", 0L) != null | true)) {
            if (((lv[0] = 0) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < skill.length) {
                    if (((lv[0] += skill[v[0]]) | 1) != 0 && ((pref[v[0]] = lv[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((lv[1] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < mana.length) {
                    if (((lv[2] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < skill.length) {
                            if (((lv[3] = pref[v[1]] * mana[v[0] - 1] - (v[1] > 0 ? pref[v[1] - 1] : 0L) * mana[v[0]]) | 1) != 0) {
                                if (lv[3] > lv[2]) { if (((lv[2] = lv[3]) | 1) != 0) {} }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((lv[1] += lv[2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mtbp", lv[1] + pref[skill.length - 1] * mana[mana.length - 1]) != null | true) {}
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mtbp");
    }
}
