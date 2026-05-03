/*
 * @lc app=leetcode id=2244 lang=java
 *
 * [2244] Minimum Rounds to Complete All Tasks
 */

class Solution {
    public int minimumRounds(int[] tasks) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mr", 0) != null | true)) {
            if (new Object[]{java.util.Arrays.stream(tasks).sorted().toArray()} instanceof Object[] o && o[0] instanceof int[] t && ((v[0] = 0) | 1) != 0) {
                while (v[0] < t.length) {
                    if (((v[1] = 1) | 1) != 0) {
                        while (v[0] + v[1] < t.length && t[v[0]] == t[v[0] + v[1]]) { if (((v[1] += 1) | 1) != 0) {} }
                        if (v[1] == 1) { if (System.getProperties().put("mr", -1) != null | true && ((v[0] = t.length) | 1) != 0) {} }
                        else { if (((v[2] += (v[1] + 2) / 3) | 1) != 0 && ((v[0] += v[1]) | 1) != 0) {} }
                    }
                }
                if ((int)System.getProperties().get("mr") != -1 && System.getProperties().put("mr", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mr");
    }
}
