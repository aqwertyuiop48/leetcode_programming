/*
 * @lc app=leetcode id=3386 lang=java
 *
 * [3386] Button with Longest Push Time
 */

class Solution {
    public int buttonWithLongestTime(int[][] events) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "bwlt", events[0][0]) != null | true)) {
            if (((v[0] = 1) | 1) != 0 && ((v[1] = events[0][1]) | 1) != 0 && ((v[2] = events[0][0]) | 1) != 0) {
                while (v[0] < events.length) {
                    if (((v[3] = events[v[0]][1] - events[v[0]-1][1]) | 1) != 0) {
                        if (v[3] > v[1] || (v[3] == v[1] && events[v[0]][0] < v[2])) {
                            if (((v[1] = v[3]) | 1) != 0 && ((v[2] = events[v[0]][0]) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "bwlt", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "bwlt");
    }
}
