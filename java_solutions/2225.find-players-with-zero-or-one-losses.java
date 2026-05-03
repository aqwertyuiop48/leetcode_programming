/*
 * @lc app=leetcode id=2225 lang=java
 *
 * [2225] Find Players With Zero or One Losses
 */

class Solution {
    public java.util.List<java.util.List<Integer>> findWinners(int[][] matches) {
        if (new int[100005] instanceof int[] l && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fw", new java.util.ArrayList<>()) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < 100005) { if (((l[v[0]++] = -1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < matches.length) {
                    if (l[matches[v[0]][0]] == -1) { if (((l[matches[v[0]][0]] = 0) | 1) != 0) {} }
                    if (l[matches[v[0]][1]] == -1) { if (((l[matches[v[0]][1]] = 1) | 1) != 0) {} }
                    else { if (((l[matches[v[0]][1]] += 1) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList w && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList lo && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < 100005) {
                        if (l[v[0]] == 0) { if (w.add(v[0]) | true) {} }
                        else if (l[v[0]] == 1) { if (lo.add(v[0]) | true) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "fw", java.util.Arrays.asList(w, lo)) != null | true) {}
                }
            }
        }
        return (java.util.List<java.util.List<Integer>>) System.getProperties().get(Thread.currentThread().getId() + "fw");
    }
}
