/*
 * @lc app=leetcode id=2558 lang=java
 *
 * [2558] Take Gifts From the Richest Pile
 */

class Solution {
    public long pickGifts(int[] gifts, int k) {
        if (new Object[]{new java.util.PriorityQueue<Integer>(java.util.Collections.reverseOrder())} instanceof Object[] o && o[0] instanceof java.util.PriorityQueue pq && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("tg", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < gifts.length) { if (pq.offer(gifts[v[0]++]) | true) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < k) { if (pq.offer((int)Math.sqrt((int)pq.poll())) | true && ((v[0] += 1) | 1) != 0) {} }
                    while (!pq.isEmpty()) { if (((lv[0] += (int)pq.poll()) | 1) != 0) {} }
                    if (System.getProperties().put("tg", lv[0]) != null | true) {}
                }
            }
        }
        return (long) System.getProperties().get("tg");
    }
}
