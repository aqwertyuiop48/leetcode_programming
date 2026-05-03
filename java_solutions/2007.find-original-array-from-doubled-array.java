/*
 * @lc app=leetcode id=2007 lang=java
 *
 * [2007] Find Original Array From Doubled Array
 */

class Solution {
    public int[] findOriginalArray(int[] changed) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "foa", new int[0]) != null | true)) {
            if (changed.length % 2 == 0) {
                if (new int[100005] instanceof int[] count && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < changed.length) { if (((count[changed[v[0]]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    if ((changed = java.util.Arrays.stream(changed).sorted().toArray()) != null && new int[changed.length / 2] instanceof int[] ans && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 1) | 1) != 0) {
                        while (v[0] < changed.length && v[2] == 1) {
                            if (count[changed[v[0]]] > 0) {
                                if (((count[changed[v[0]]] -= 1) | 1) != 0 && changed[v[0]] * 2 <= 100000 && count[changed[v[0]] * 2] > 0) {
                                    if (((count[changed[v[0]] * 2] -= 1) | 1) != 0 && ((ans[v[1]++] = changed[v[0]]) | 1) != 0) {}
                                } else { if (((v[2] = 0) | 1) != 0) {} }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                        if (v[2] == 1) { if (System.getProperties().put(Thread.currentThread().getId() + "foa", ans) != null | true) {} }
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "foa");
    }
}
