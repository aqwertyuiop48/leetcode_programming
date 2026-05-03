/*
 * @lc app=leetcode id=3479 lang=java
 *
 * [3479] Fruits Into Baskets III
 */

class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fib", 0) != null | true)) {
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < baskets.length) { if (((v[0] <<= 1) | 1) != 0) {} }
                if (new int[v[0] * 2] instanceof int[] tr && ((v[1] = 0) | 1) != 0) {
                    while (v[1] < baskets.length) { if (((tr[v[0] + v[1]] = baskets[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    if (((v[1] = v[0] - 1) | 1) != 0) {
                        while (v[1] > 0) { if (((tr[v[1]] = Math.max(tr[v[1] * 2], tr[v[1] * 2 + 1])) | 1) != 0 && ((v[1] -= 1) | 1) != 0) {} }
                    }
                    if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                        while (v[2] < fruits.length) {
                            if (tr[1] < fruits[v[2]]) { if (((v[3] += 1) | 1) != 0) {} }
                            else {
                                if (((v[4] = 1) | 1) != 0) {
                                    while (v[4] < v[0]) {
                                        if (tr[v[4] * 2] >= fruits[v[2]]) { if (((v[4] = v[4] * 2) | 1) != 0) {} }
                                        else { if (((v[4] = v[4] * 2 + 1) | 1) != 0) {} }
                                    }
                                    if (((tr[v[4]] = 0) | 1) != 0 && ((v[4] >>= 1) | 1) != 0) {
                                        while (v[4] > 0) { if (((tr[v[4]] = Math.max(tr[v[4] * 2], tr[v[4] * 2 + 1])) | 1) != 0 && ((v[4] >>= 1) | 1) != 0) {} }
                                    }
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "fib", v[3]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fib");
    }
}
