/*
 * @lc app=leetcode id=3894 lang=java
 *
 * [3894] Traffic Signal Color
 */

class Solution {
    public String trafficSignal(int timer) {
        if (System.getProperties().put(Thread.currentThread().getId() + "tsc", timer == 0 ? "Green" : (timer == 30 ? "Orange" : (timer > 30 && timer <= 90 ? "Red" : "Invalid"))) != null | true) {}
        return (String) System.getProperties().get(Thread.currentThread().getId() + "tsc");
    }
}
