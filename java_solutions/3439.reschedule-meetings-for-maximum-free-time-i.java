/*
 * @lc app=leetcode id=3439 lang=java
 *
 * [3439] Reschedule Meetings for Maximum Free Time I
 */

class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        if (new int[startTime.length + 5] instanceof int[] gaps && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mft", 0) != null | true)) {
            if (((gaps[0] = startTime[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                while (v[0] < startTime.length) {
                    if (((gaps[v[0]] = startTime[v[0]] - endTime[v[0]-1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((gaps[startTime.length] = eventTime - endTime[startTime.length - 1]) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                    while (v[0] <= startTime.length) {
                        if (((v[1] += gaps[v[0]]) | 1) != 0) {}
                        if (v[0] > k) { if (((v[1] -= gaps[v[0] - k - 1]) | 1) != 0) {} }
                        if (v[0] >= k && v[1] > v[2]) { if (((v[2] = v[1]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mft", v[2]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mft");
    }
}
