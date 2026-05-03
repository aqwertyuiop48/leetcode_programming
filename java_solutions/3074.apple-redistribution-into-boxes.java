/*
 * @lc app=leetcode id=3074 lang=java
 *
 * [3074] Apple Redistribution into Boxes
 */

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        if (new int[55] instanceof int[] cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mb", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < apple.length) {
                    if (((v[1] += apple[v[0]++]) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < capacity.length) {
                        if (((cnt[capacity[v[0]++]] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 50) | 1) != 0) {
                        while (v[0] > 0 && v[1] > 0) {
                            while (cnt[v[0]] > 0 && v[1] > 0) {
                                if (((v[1] -= v[0]) | 1) != 0 && ((v[2] += 1) | 1) != 0 && ((cnt[v[0]] -= 1) | 1) != 0) {}
                            }
                            if (((v[0] -= 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "mb", v[2]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mb");
    }
}
