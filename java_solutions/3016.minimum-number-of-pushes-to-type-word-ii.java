/*
 * @lc app=leetcode id=3016 lang=java
 *
 * [3016] Minimum Number of Pushes to Type Word II
 */

class Solution {
    public int minimumPushes(String word) {
        if (new int[35] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mnp2", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < word.length()) {
                    if (((v[word.charAt(v[0]) - 'a' + 5] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 5) | 1) != 0) {
                    while (v[0] < 31) {
                        if (((v[1] = v[0] + 1) | 1) != 0) {
                            while (v[1] < 31) {
                                if (v[v[0]] < v[v[1]]) {
                                    if (((v[2] = v[v[0]]) | 1) != 0 && ((v[v[0]] = v[v[1]]) | 1) != 0 && ((v[v[1]] = v[2]) | 1) != 0) {}
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[0] = 5) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[0] < 31 && v[v[0]] > 0) {
                            if (((v[1] += v[v[0]] * (((v[0] - 5) / 8) + 1)) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "mnp2", v[1]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mnp2");
    }
}
