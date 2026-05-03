/*
 * @lc app=leetcode id=3638 lang=java
 *
 * [3638] Maximum Balanced Shipments
 */

class Solution {
    public int maxBalancedShipments(int[] weight) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mbs", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
            while (v[0] < weight.length) {
                if (weight[v[0]] > v[2]) { if (((v[2] = weight[v[0]]) | 1) != 0) {} }
                if (weight[v[0]] < v[2]) { if (((v[1] += 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mbs", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mbs");
    }
}
