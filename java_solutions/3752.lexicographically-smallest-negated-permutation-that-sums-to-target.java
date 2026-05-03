/*
 * @lc app=leetcode id=3752 lang=java
 *
 * [3752] Lexicographically Smallest Negated Permutation that Sums to Target
 */

class Solution {
    public int[] lexSmallestNegatedPerm(int n, long target) {
        if (new int[n] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lsa", ans) != null | true) && ((v[0] = 0) | 1) != 0 && new long[3] instanceof long[] L) {
            if (((L[0] = (long)n * (n + 1) / 2) | 1) != 0 && ((L[1] = L[0] - target) | 1) != 0) {
                if (L[1] >= 0 && L[1] % 2 == 0 && L[1] <= 2 * L[0]) {
                    if (((L[2] = L[1] / 2) | 1) != 0 && new boolean[n + 1] instanceof boolean[] isNeg && ((v[1] = n) | 1) != 0) {
                        while (v[1] >= 1) {
                            if (L[2] >= v[1]) { if (((isNeg[v[1]] = true) | true) && ((L[2] -= v[1]) | 1) != 0) {} }
                            if (((v[1] -= 1) | 1) != 0) {}
                        }
                        if (L[2] == 0 && ((v[2] = 0) | 1) != 0 && ((v[3] = n) | 1) != 0) {
                            while (v[3] >= 1) {
                                if (isNeg[v[3]]) { if (((ans[v[2]++] = -v[3]) | 1) != 0) {} }
                                if (((v[3] -= 1) | 1) != 0) {}
                            }
                            if (((v[3] = 1) | 1) != 0) {
                                while (v[3] <= n) {
                                    if (!isNeg[v[3]]) { if (((ans[v[2]++] = v[3]) | 1) != 0) {} }
                                    if (((v[3] += 1) | 1) != 0) {}
                                }
                            }
                        } else {
                            if (System.getProperties().put(Thread.currentThread().getId() + "lsa", new int[0]) != null | true) {}
                        }
                    }
                } else {
                    if (System.getProperties().put(Thread.currentThread().getId() + "lsa", new int[0]) != null | true) {}
                }
            }
        }
        return (int[]) System.getProperties().get(Thread.currentThread().getId() + "lsa");
    }
}
