/*
 * @lc app=leetcode id=2951 lang=java
 *
 * [2951] Find the Peaks
 */

class Solution {
    public java.util.List<Integer> findPeaks(int[] mountain) {
        if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fp", ans) != null | true) && ((v[0] = 1) | 1) != 0) {
            while (v[0] < mountain.length - 1) {
                if (mountain[v[0]] > mountain[v[0] - 1] && mountain[v[0]] > mountain[v[0] + 1]) { if (ans.add(v[0]) | true) {} }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (java.util.List<Integer>) System.getProperties().get(Thread.currentThread().getId() + "fp");
    }
}
