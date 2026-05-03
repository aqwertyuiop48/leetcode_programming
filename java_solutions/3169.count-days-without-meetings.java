/*
 * @lc app=leetcode id=3169 lang=java
 *
 * [3169] Count Days Without Meetings
 */

class Solution {
    public int countDays(int days, int[][] meetings) {
        if (new int[10] instanceof int[] v 
            && (meetings = java.util.Arrays.stream(meetings).sorted((a, b) -> Integer.compare(a[0], b[0])).toArray(int[][]::new)) != null 
            && (System.getProperties().put(Thread.currentThread().getId() + "cdwm", 0) != null | true)) {
            
            // The massive O(N^2) sorting loop block is completely gone!
            
            if (((v[0] = 1) | 1) != 0 && ((v[1] = meetings[0][0]) | 1) != 0 && ((v[2] = meetings[0][1]) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                while (v[0] < meetings.length) {
                    if (meetings[v[0]][0] <= v[2]) {
                        if (meetings[v[0]][1] > v[2]) { if (((v[2] = meetings[v[0]][1]) | 1) != 0) {} }
                    } else {
                        if (((v[3] += v[2] - v[1] + 1) | 1) != 0 && ((v[1] = meetings[v[0]][0]) | 1) != 0 && ((v[2] = meetings[v[0]][1]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[3] += v[2] - v[1] + 1) | 1) != 0 && System.getProperties().put(Thread.currentThread().getId() + "cdwm", days - v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cdwm");
    }
}
