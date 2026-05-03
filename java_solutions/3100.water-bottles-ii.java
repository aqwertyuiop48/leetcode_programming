/*
 * @lc app=leetcode id=3100 lang=java
 *
 * [3100] Water Bottles II
 */

class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "wbi", 0) != null | true)) {
            if (((v[0] = numBottles) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = numExchange) | 1) != 0) {
                while (v[0] > 0 || v[1] >= v[2]) {
                    if (v[0] > 0) {
                        if (((v[3] += v[0]) | 1) != 0 && ((v[1] += v[0]) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                    } else if (v[1] >= v[2]) {
                        if (((v[1] -= v[2]) | 1) != 0 && ((v[2] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "wbi", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "wbi");
    }
}
