/*
 * @lc app=leetcode id=2960 lang=java
 *
 * [2960] Count Tested Devices After Test Operations
 */

class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ct", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < batteryPercentages.length) {
                if (batteryPercentages[v[0]] - v[1] > 0) { if (((v[1] += 1) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ct", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ct");
    }
}
