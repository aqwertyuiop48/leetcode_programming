/*
 * @lc app=leetcode id=2079 lang=java
 *
 * [2079] Watering Plants
 */

class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "wp", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = capacity) | 1) != 0) {
            while (v[0] < plants.length) {
                if (v[2] < plants[v[0]]) { if (((v[1] += v[0] * 2) | 1) != 0 && ((v[2] = capacity) | 1) != 0) {} }
                if (((v[1] += 1) | 1) != 0 && ((v[2] -= plants[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "wp", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "wp");
    }
}
