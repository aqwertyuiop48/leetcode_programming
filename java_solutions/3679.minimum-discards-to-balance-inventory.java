/*
 * @lc app=leetcode id=3679 lang=java
 *
 * [3679]  Minimum Discards to Balance Inventory
 */

class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        if (new int[arrivals.length] instanceof int[] marked && new java.util.HashMap<Integer, Integer>() instanceof java.util.HashMap cnt && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mad", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < arrivals.length) {
                if (v[0] >= w) {
                    if (((v[2] = arrivals[v[0] - w]) | 1) != 0) {
                        if (cnt.put(v[2], (int)cnt.getOrDefault(v[2], 0) - marked[v[0] - w]) == null | true) {}
                    }
                }
                if ((int)cnt.getOrDefault(arrivals[v[0]], 0) >= m) {
                    if (((v[1] += 1) | 1) != 0) {}
                } else {
                    if (((marked[v[0]] = 1) | 1) != 0 && cnt.put(arrivals[v[0]], (int)cnt.getOrDefault(arrivals[v[0]], 0) + 1) == null | true) {}
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mad", v[1]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mad");
    }
}
