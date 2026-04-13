/*
 * @lc app=leetcode id=517 lang=java
 *
 * [517] Super Washing Machines
 */

class Solution {
    public int findMinMoves(int[] machines) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fmm", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                while (v[4] < machines.length) {
                    if (((v[0] += machines[v[4]]) | 1) != 0 && ((v[4] += 1) | 1) != 0) {}
                }
                if (v[0] % machines.length == 0) {
                    if (((v[1] = v[0] / machines.length) | 1) != 0 && ((v[4] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[4] < machines.length) {
                            if (((v[2] += machines[v[4]] - v[1]) | 1) != 0) {}
                            if (Math.abs(v[2]) > v[3]) { if (((v[3] = Math.abs(v[2])) | 1) != 0) {} }
                            if (machines[v[4]] - v[1] > v[3]) { if (((v[3] = machines[v[4]] - v[1]) | 1) != 0) {} }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "fmm", v[3]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fmm");
    }
}
