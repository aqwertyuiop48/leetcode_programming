/*
 * @lc app=leetcode id=3668 lang=java
 *
 * [3668] Restore Finishing Order
 */

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        if (new int[10] instanceof int[] v && new int[105] instanceof int[] pos && (System.getProperties().put(Thread.currentThread().getId() + "rfo", friends) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < order.length) { if (((pos[order[v[0]]] = v[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < friends.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < friends.length - 1 - v[0]) {
                                if (pos[friends[v[1]]] > pos[friends[v[1] + 1]]) {
                                    if (((v[2] = friends[v[1]]) | 1) != 0 && ((friends[v[1]] = friends[v[1] + 1]) | 1) != 0 && ((friends[v[1] + 1] = v[2]) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "rfo");
    }
}
