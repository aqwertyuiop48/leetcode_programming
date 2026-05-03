/*
 * @lc app=leetcode id=2260 lang=java
 *
 * [2260] Minimum Consecutive Cards to Pick Up
 */

class Solution {
    public int minimumCardPickup(int[] cards) {
        if (new int[1000005] instanceof int[] last && new int[10] instanceof int[] v && (System.getProperties().put("mcp", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 999999999) | 1) != 0) {
                while (v[0] < last.length) { if (((last[v[0]++] = -1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < cards.length) {
                        if (last[cards[v[0]]] != -1) { if (v[0] - last[cards[v[0]]] + 1 < v[1]) { if (((v[1] = v[0] - last[cards[v[0]]] + 1) | 1) != 0) {} } }
                        if (((last[cards[v[0]]] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (v[1] != 999999999) { if (System.getProperties().put("mcp", v[1]) != null | true) {} }
                }
            }
        }
        return (int) System.getProperties().get("mcp");
    }
}
