/*
 * @lc app=leetcode id=3697 lang=java
 *
 * [3697] Compute Decimal Representation
 */

class Solution {
    public int[] decimalRepresentation(int n) {
        if (new int[10] instanceof int[] v && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList list && (System.getProperties().put(Thread.currentThread().getId() + "cdr", new int[0]) != null | true) && ((v[0] = n) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
            while (v[0] > 0) {
                if (((v[2] = v[0] % 10) | 1) != 0 && v[2] != 0) {
                    if (list.add(v[2] * v[1]) | true) {}
                }
                if (((v[0] /= 10) | 1) != 0 && ((v[1] *= 10) | 1) != 0) {}
            }
            if (new int[list.size()] instanceof int[] ans && ((v[0] = 0) | 1) != 0) {
                while (v[0] < ans.length) {
                    if (((ans[v[0]] = (int)list.get(ans.length - 1 - v[0])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cdr", ans) != null | true) {}
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "cdr");
    }
}
