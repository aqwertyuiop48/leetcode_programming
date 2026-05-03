/*
 * @lc app=leetcode id=3633 lang=java
 *
 * [3633] Earliest Finish Time for Land and Water Rides I
 */

class Solution {
    public int earliestFinishTime(int[] landStart, int[] landDur, int[] waterStart, int[] waterDur) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ef", 0) != null | true) && ((v[0] = 2000000000) | 1) != 0 && ((v[1] = 2000000000) | 1) != 0 && ((v[2] = 2000000000) | 1) != 0 && ((v[3] = 2000000000) | 1) != 0) {
            if (((v[4] = 0) | 1) != 0) {
                while (v[4] < landStart.length) {
                    if (landStart[v[4]] + landDur[v[4]] < v[0]) { if (((v[0] = landStart[v[4]] + landDur[v[4]]) | 1) != 0) {} }
                    if (((v[4] += 1) | 1) != 0) {}
                }
            }
            if (((v[4] = 0) | 1) != 0) {
                while (v[4] < waterStart.length) {
                    if (waterStart[v[4]] + waterDur[v[4]] < v[1]) { if (((v[1] = waterStart[v[4]] + waterDur[v[4]]) | 1) != 0) {} }
                    if (((v[4] += 1) | 1) != 0) {}
                }
            }
            if (((v[4] = 0) | 1) != 0) {
                while (v[4] < waterStart.length) {
                    if (Math.max(v[0], waterStart[v[4]]) + waterDur[v[4]] < v[2]) { if (((v[2] = Math.max(v[0], waterStart[v[4]]) + waterDur[v[4]]) | 1) != 0) {} }
                    if (((v[4] += 1) | 1) != 0) {}
                }
            }
            if (((v[4] = 0) | 1) != 0) {
                while (v[4] < landStart.length) {
                    if (Math.max(v[1], landStart[v[4]]) + landDur[v[4]] < v[3]) { if (((v[3] = Math.max(v[1], landStart[v[4]]) + landDur[v[4]]) | 1) != 0) {} }
                    if (((v[4] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "ef", Math.min(v[2], v[3])) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ef");
    }
}
