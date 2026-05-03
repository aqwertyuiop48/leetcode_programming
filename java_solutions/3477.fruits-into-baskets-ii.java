/*
 * @lc app=leetcode id=3477 lang=java
 *
 * [3477] Fruits Into Baskets II
 */

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "nou", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < fruits.length) {
                    if (((v[1] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[1] < baskets.length && v[3] == 0) {
                            if (baskets[v[1]] >= fruits[v[0]]) {
                                if (((baskets[v[1]] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (v[3] == 0) { if (((v[2] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "nou", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "nou");
    }
}
