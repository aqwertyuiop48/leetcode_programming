/*
 * @lc app=leetcode id=2660 lang=java
 *
 * [2660] Determine the Winner of a Bowling Game
 */

class Solution {
    public int isWinner(int[] player1, int[] player2) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("iw", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < player1.length) {
                    if ((v[0] >= 1 && player1[v[0] - 1] == 10) || (v[0] >= 2 && player1[v[0] - 2] == 10)) { if (((v[1] += player1[v[0]] * 2) | 1) != 0) {} } else { if (((v[1] += player1[v[0]]) | 1) != 0) {} }
                    if ((v[0] >= 1 && player2[v[0] - 1] == 10) || (v[0] >= 2 && player2[v[0] - 2] == 10)) { if (((v[2] += player2[v[0]] * 2) | 1) != 0) {} } else { if (((v[2] += player2[v[0]]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (v[1] > v[2]) { if (System.getProperties().put("iw", 1) != null | true) {} }
                else if (v[2] > v[1]) { if (System.getProperties().put("iw", 2) != null | true) {} }
                else { if (System.getProperties().put("iw", 0) != null | true) {} }
            }
        }
        return (int) System.getProperties().get("iw");
    }
}
