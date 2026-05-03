/*
 * @lc app=leetcode id=3440 lang=java
 *
 * [3440] Reschedule Meetings for Maximum Free Time II
 */

class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        if (new int[startTime.length + 1] instanceof int[] gaps && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "rmft", 0) != null | true)) {
            if (((gaps[0] = startTime[0]) | 1) != 0 && ((gaps[startTime.length] = eventTime - endTime[endTime.length - 1]) | 1) != 0 && ((v[0] = 1) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = -1) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((v[4] = -1) | 1) != 0 && ((v[5] = 0) | 1) != 0 && ((v[6] = -1) | 1) != 0) {
                while (v[0] < startTime.length) { if (((gaps[v[0]] = startTime[v[0]] - endTime[v[0] - 1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] <= startTime.length) {
                        if (gaps[v[0]] > v[1]) { if (((v[5] = v[3]) | 1) != 0 && ((v[6] = v[4]) | 1) != 0 && ((v[3] = v[1]) | 1) != 0 && ((v[4] = v[2]) | 1) != 0 && ((v[1] = gaps[v[0]]) | 1) != 0 && ((v[2] = v[0]) | 1) != 0) {} }
                        else if (gaps[v[0]] > v[3]) { if (((v[5] = v[3]) | 1) != 0 && ((v[6] = v[4]) | 1) != 0 && ((v[3] = gaps[v[0]]) | 1) != 0 && ((v[4] = v[0]) | 1) != 0) {} }
                        else if (gaps[v[0]] > v[5]) { if (((v[5] = gaps[v[0]]) | 1) != 0 && ((v[6] = v[0]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && ((v[7] = 0) | 1) != 0) {
                    while (v[0] < startTime.length) {
                        if (((v[8] = gaps[v[0]] + gaps[v[0] + 1]) | 1) != 0 && ((v[9] = 0) | 1) != 0) {
                            if (v[2] != v[0] && v[2] != v[0] + 1) { if (((v[9] = v[1]) | 1) != 0) {} }
                            else if (v[4] != v[0] && v[4] != v[0] + 1) { if (((v[9] = v[3]) | 1) != 0) {} }
                            else if (v[6] != v[0] && v[6] != v[0] + 1) { if (((v[9] = v[5]) | 1) != 0) {} }
                            if (v[9] >= endTime[v[0]] - startTime[v[0]]) { if (((v[8] += endTime[v[0]] - startTime[v[0]]) | 1) != 0) {} }
                            if (v[8] > v[7]) { if (((v[7] = v[8]) | 1) != 0) {} }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "rmft", v[7]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "rmft");
    }
}
