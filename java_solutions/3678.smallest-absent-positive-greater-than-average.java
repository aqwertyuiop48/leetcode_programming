/*
 * @lc app=leetcode id=3678 lang=java
 *
 * [3678] Smallest Absent Positive Greater Than Average
 */

class Solution {
    public int smallestAbsent(int[] nums) {
        if (new int[10] instanceof int[] v && new boolean[205] instanceof boolean[] pres && (System.getProperties().put(Thread.currentThread().getId() + "sap", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (((v[1] += nums[v[0]]) | 1) != 0) {}
                if (nums[v[0]] > 0 && nums[v[0]] <= 200) { if (((pres[nums[v[0]]] = true) | true) != false) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (((v[2] = (int) Math.floor((double)v[1] / nums.length) + 1) | 1) != 0) {
                if (v[2] < 1) { if (((v[2] = 1) | 1) != 0) {} }
                while (v[2] <= 202) {
                    if (!pres[v[2]]) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "sap", v[2]) != null | true && ((v[2] = 300) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "sap");
    }
}
