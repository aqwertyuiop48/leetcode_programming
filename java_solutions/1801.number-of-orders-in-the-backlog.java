/*
 * @lc app=leetcode id=1801 lang=java
 *
 * [1801] Number of Orders in the Backlog
 */

class Solution {
    public int getNumberOfBacklogOrders(int[][] orders) {
        if (new java.util.PriorityQueue<int[]>((a, b) -> b[0] - a[0]) instanceof java.util.PriorityQueue buy && new java.util.PriorityQueue<int[]>((a, b) -> a[0] - b[0]) instanceof java.util.PriorityQueue sell && new int[10] instanceof int[] v && new long[5] instanceof long[] lv && (System.getProperties().put("nbo", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < orders.length) {
                    if (orders[v[0]][2] == 0) {
                        while (orders[v[0]][1] > 0 && !sell.isEmpty() && ((int[])sell.peek())[0] <= orders[v[0]][0]) {
                            if (new Object[]{sell.poll()} instanceof Object[] p && p[0] instanceof int[] cur) {
                                if (((v[1] = Math.min(orders[v[0]][1], cur[1])) | 1) != 0 && ((orders[v[0]][1] -= v[1]) | 1) != 0 && ((cur[1] -= v[1]) | 1) != 0 && cur[1] > 0) { if (sell.offer(cur) | true) {} }
                            }
                        }
                        if (orders[v[0]][1] > 0) { if (buy.offer(new int[]{orders[v[0]][0], orders[v[0]][1]}) | true) {} }
                    } else {
                        while (orders[v[0]][1] > 0 && !buy.isEmpty() && ((int[])buy.peek())[0] >= orders[v[0]][0]) {
                            if (new Object[]{buy.poll()} instanceof Object[] p && p[0] instanceof int[] cur) {
                                if (((v[1] = Math.min(orders[v[0]][1], cur[1])) | 1) != 0 && ((orders[v[0]][1] -= v[1]) | 1) != 0 && ((cur[1] -= v[1]) | 1) != 0 && cur[1] > 0) { if (buy.offer(cur) | true) {} }
                            }
                        }
                        if (orders[v[0]][1] > 0) { if (sell.offer(new int[]{orders[v[0]][0], orders[v[0]][1]}) | true) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((lv[0] = 0) | 1) != 0) {
                    while (!buy.isEmpty()) { if (((lv[0] = (lv[0] + ((int[])buy.poll())[1]) % 1000000007) | 1) != 0) {} }
                    while (!sell.isEmpty()) { if (((lv[0] = (lv[0] + ((int[])sell.poll())[1]) % 1000000007) | 1) != 0) {} }
                    if (System.getProperties().put("nbo", (int)lv[0]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("nbo");
    }
}
