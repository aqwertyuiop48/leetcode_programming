/*
 * @lc app=leetcode id=2383 lang=java
 *
 * [2383] Minimum Hours of Training to Win a Competition
 */

class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mht", 0) != null | true) && ((v[0] = initialEnergy) | 1) != 0 && ((v[1] = initialExperience) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
            while (v[3] < energy.length) {
                if (v[0] <= energy[v[3]]) { if (((v[2] += energy[v[3]] - v[0] + 1) | 1) != 0 && ((v[0] = energy[v[3]] + 1) | 1) != 0) {} }
                if (v[1] <= experience[v[3]]) { if (((v[2] += experience[v[3]] - v[1] + 1) | 1) != 0 && ((v[1] = experience[v[3]] + 1) | 1) != 0) {} }
                if (((v[0] -= energy[v[3]]) | 1) != 0 && ((v[1] += experience[v[3]]) | 1) != 0 && ((v[3] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mht", v[2]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mht");
    }
}
