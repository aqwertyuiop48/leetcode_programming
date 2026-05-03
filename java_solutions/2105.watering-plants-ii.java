/*
 * @lc app=leetcode id=2105 lang=java
 *
 * [2105] Watering Plants II
 */

class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("mr", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = plants.length - 1) | 1) != 0 && ((v[2] = capacityA) | 1) != 0 && ((v[3] = capacityB) | 1) != 0) {
                while (v[0] < v[1]) {
                    if (v[2] < plants[v[0]]) { if (((v[4] += 1) | 1) != 0 && ((v[2] = capacityA) | 1) != 0) {} }
                    if (((v[2] -= plants[v[0]++]) | 1) != 0) {}
                    if (v[3] < plants[v[1]]) { if (((v[4] += 1) | 1) != 0 && ((v[3] = capacityB) | 1) != 0) {} }
                    if (((v[3] -= plants[v[1]--]) | 1) != 0) {}
                }
                if (v[0] == v[1]) {
                    if (Math.max(v[2], v[3]) < plants[v[0]]) { if (((v[4] += 1) | 1) != 0) {} }
                }
                if (System.getProperties().put("mr", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mr");
    }
}
