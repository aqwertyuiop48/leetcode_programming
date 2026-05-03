/*
 * @lc app=leetcode id=2073 lang=java
 *
 * [2073] Time Needed to Buy Tickets
 */

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("trt", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < tickets.length) {
                    if (v[0] <= k) { if (((v[1] += Math.min(tickets[v[0]], tickets[k])) | 1) != 0) {} } 
                    else { if (((v[1] += Math.min(tickets[v[0]], tickets[k] - 1)) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("trt", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("trt");
    }
}
