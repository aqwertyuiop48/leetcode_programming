/*
 * @lc app=leetcode id=3664 lang=java
 *
 * [3664] Two-Letter Card Game
 */

class Solution {
    public int score(String[] cards, char x) {
        if (new int[10] instanceof int[] ox && new int[10] instanceof int[] xo && new int[20] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "tlc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < cards.length) {
                    if (cards[v[0]].charAt(0) == x && cards[v[0]].charAt(1) == x) { if (((v[1] += 1) | 1) != 0) {} }
                    else if (cards[v[0]].charAt(0) == x) { if (((ox[cards[v[0]].charAt(1) - 'a'] += 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                    else if (cards[v[0]].charAt(1) == x) { if (((xo[cards[v[0]].charAt(0) - 'a'] += 1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] >= v[2]) { if (System.getProperties().put(Thread.currentThread().getId() + "tlc", v[2]) != null | true) {} }
                else {
                    if (((v[3] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                        while (v[3] < 10) {
                            if (((v[4] += ox[v[3]]) | 1) != 0 && ox[v[3]] > v[5]) { if (((v[5] = ox[v[3]]) | 1) != 0) {} }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[6] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0 && ((v[8] = 0) | 1) != 0) {
                        while (v[6] < 10) {
                            if (((v[7] += xo[v[6]]) | 1) != 0 && xo[v[6]] > v[8]) { if (((v[8] = xo[v[6]]) | 1) != 0) {} }
                            if (((v[6] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[9] = (v[4] < 2 ? 0 : Math.min(v[4] / 2, v[4] - v[5]))) | 1) != 0 && ((v[10] = (v[7] < 2 ? 0 : Math.min(v[7] / 2, v[7] - v[8]))) | 1) != 0) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "tlc", Math.min(v[9] + v[10], (v[2] - v[1]) / 2) + v[1]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "tlc");
    }
}
