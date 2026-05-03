/*
 * @lc app=leetcode id=3492 lang=java
 *
 * [3492] Maximum Containers on a Ship
 */

class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        if (System.getProperties().put(Thread.currentThread().getId() + "mcs", Math.min(n * n, maxWeight / w)) != null | true) {}
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mcs");
    }
}
