/*
 * @lc app=leetcode id=3259 lang=java
 *
 * [3259] Maximum Energy Boost From Two Drinks
 */

class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        if (new long[energyDrinkA.length + 5] instanceof long[] dpA && new long[energyDrinkB.length + 5] instanceof long[] dpB && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "meb", 0L) != null | true)) {
            if (((dpA[1] = energyDrinkA[0]) | 1) != 0 && ((dpB[1] = energyDrinkB[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < energyDrinkA.length) {
                    if (((dpA[v[0] + 1] = Math.max(dpA[v[0]] + energyDrinkA[v[0]], dpB[v[0] - 1] + energyDrinkA[v[0]])) | 1) != 0 && ((dpB[v[0] + 1] = Math.max(dpB[v[0]] + energyDrinkB[v[0]], dpA[v[0] - 1] + energyDrinkB[v[0]])) | 1) != 0) {}
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "meb", Math.max(dpA[energyDrinkA.length], dpB[energyDrinkB.length])) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "meb");
    }
}
