/*
 * @lc app=leetcode id=3207 lang=java
 *
 * [3207] Maximum Points After Enemy Battles
 */

class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        if (new long[5] instanceof long[] v &&
            (enemyEnergies = java.util.Arrays.stream(enemyEnergies).sorted().toArray()) != null &&
            (System.getProperties().put(Thread.currentThread().getId() + "mp", 0L) != null | true)) {

            if (currentEnergy >= enemyEnergies[0]) {
                if (((v[0] = currentEnergy) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                    while (v[1] < enemyEnergies.length) {
                        if (((v[0] += enemyEnergies[(int)v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mp", v[0] / enemyEnergies[0]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mp");
    }
}
