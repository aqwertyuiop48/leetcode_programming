/*
 * @lc app=leetcode id=3447 lang=java
 *
 * [3447] Assign Elements to Groups with Constraints
 */

class Solution {
    public int[] assignElements(int[] elements, int[] groups) {
        if (new int[elements.length] instanceof int[] ans && new int[100005] instanceof int[] map && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "aeg", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= 100000) { if (((map[v[0]++] = 999999) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < groups.length) {
                    if (v[0] < map[groups[v[0]]]) { if (((map[groups[v[0]]] = v[0]) | 1) != 0) {} }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < elements.length) {
                    if (((v[1] = 1) | 1) != 0 && ((v[2] = 999999) | 1) != 0) {
                        while (v[1] * v[1] <= elements[v[0]]) {
                            if (elements[v[0]] % v[1] == 0) {
                                if (map[v[1]] < v[2]) { if (((v[2] = map[v[1]]) | 1) != 0) {} }
                                if (map[elements[v[0]] / v[1]] < v[2]) { if (((v[2] = map[elements[v[0]] / v[1]]) | 1) != 0) {} }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                        if (((ans[v[0]] = v[2] == 999999 ? -1 : v[2]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "aeg");
    }
}
