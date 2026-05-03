/*
 * @lc app=leetcode id=3771 lang=java
 *
 * [3771] Total Score of Dungeon Runs
 */

class Solution {
    public long totalScore(int hp, int[] damage, int[] req) {
        if (new long[damage.length + 1] instanceof long[] pref && new int[10] instanceof int[] v && new long[2] instanceof long[] L && (System.getProperties().put(Thread.currentThread().getId() + "ts", 0L) != null | true) && ((v[0] = 1) | 1) != 0) {
            while (v[0] <= damage.length) { if (((pref[v[0]] = pref[v[0] - 1] + damage[v[0] - 1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = damage.length - 1) | 1) != 0) {
                while (v[0] >= 0) {
                    if (hp - damage[v[0]] >= req[v[0]]) {
                        if (((L[0] = hp - damage[v[0]] - req[v[0]]) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = v[0] - 1) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {
                            while (v[1] <= v[2]) {
                                if (((v[4] = (v[1] + v[2]) >>> 1) | 1) != 0) {
                                    if (pref[v[0]] - pref[v[4]] <= L[0]) { if (((v[3] = v[4]) | 1) != 0 && ((v[2] = v[4] - 1) | 1) != 0) {} }
                                    else { if (((v[1] = v[4] + 1) | 1) != 0) {} }
                                }
                            }
                            if (((L[1] += 1 + v[0] - v[3]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ts", L[1]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "ts");
    }
}
