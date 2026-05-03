/*
 * @lc app=leetcode id=2170 lang=java
 *
 * [2170] Minimum Operations to Make the Array Alternating
 */

class Solution {
    public int minimumOperations(int[] nums) {
        if (new int[100005] instanceof int[] e && new int[100005] instanceof int[] o && new int[15] instanceof int[] v && (System.getProperties().put("mo", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) {
                    if (v[0] % 2 == 0) { if (((e[nums[v[0]]] += 1) | 1) != 0) {} }
                    else { if (((o[nums[v[0]]] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] <= 100000) {
                        if (e[v[0]] > e[v[1]]) { if (((v[2] = v[1]) | 1) != 0 && ((v[1] = v[0]) | 1) != 0) {} } else if (e[v[0]] > e[v[2]]) { if (((v[2] = v[0]) | 1) != 0) {} }
                        if (o[v[0]] > o[v[3]]) { if (((v[4] = v[3]) | 1) != 0 && ((v[3] = v[0]) | 1) != 0) {} } else if (o[v[0]] > o[v[4]]) { if (((v[4] = v[0]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (v[1] != v[3]) { if (System.getProperties().put("mo", nums.length - e[v[1]] - o[v[3]]) != null | true) {} }
                    else { if (System.getProperties().put("mo", nums.length - Math.max(e[v[1]] + o[v[4]], e[v[2]] + o[v[3]])) != null | true) {} }
                }
            }
        }
        return (int) System.getProperties().get("mo");
    }
}
