/*
 * @lc app=leetcode id=2347 lang=java
 *
 * [2347] Best Poker Hand
 */

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        if (new int[15] instanceof int[] r && new int[5] instanceof int[] s && new int[10] instanceof int[] v && (System.getProperties().put("bph", "High Card") != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < 5) {
                    if (((r[ranks[v[0]]] += 1) | 1) != 0 && ((s[suits[v[0]] - 'a'] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                    while (v[0] < 15) {
                        if (v[0] < 5 && s[v[0]] == 5) { if (System.getProperties().put("bph", "Flush") != null | true && ((v[1] = 5) | 1) != 0) {} }
                        if (r[v[0]] > v[1]) { if (((v[1] = r[v[0]]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (!System.getProperties().get("bph").equals("Flush")) {
                        if (v[1] >= 3) { if (System.getProperties().put("bph", "Three of a Kind") != null | true) {} }
                        else if (v[1] == 2) { if (System.getProperties().put("bph", "Pair") != null | true) {} }
                    }
                }
            }
        }
        return (String) System.getProperties().get("bph");
    }
}
