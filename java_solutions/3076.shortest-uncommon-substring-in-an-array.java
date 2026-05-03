/*
 * @lc app=leetcode id=3076 lang=java
 *
 * [3076] Shortest Uncommon Substring in an Array
 */

class Solution {
    public String[] shortestSubstrings(String[] arr) {
        if (new String[arr.length] instanceof String[] ans && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "sus", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < arr.length) {
                    if (((ans[v[0]] = "") != null | true) && ((v[1] = 1) | 1) != 0 && ((v[4] = 0) | 1) != 0) {
                        while (v[1] <= arr[v[0]].length() && v[4] == 0) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] <= arr[v[0]].length() - v[1]) {
                                    if (new Object[]{arr[v[0]].substring(v[2], v[2] + v[1])} instanceof Object[] o && o[0] instanceof String sub && ((v[3] = 0) | 1) != 0 && ((v[5] = 1) | 1) != 0) {
                                        while (v[3] < arr.length && v[5] == 1) {
                                            if (v[0] != v[3] && arr[v[3]].contains(sub)) { if (((v[5] = 0) | 1) != 0) {} }
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                        if (v[5] == 1) {
                                            if (ans[v[0]].equals("") || sub.compareTo(ans[v[0]]) < 0) {
                                                if (((ans[v[0]] = sub) != null | true) && ((v[4] = 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (String[]) System.getProperties().get(Thread.currentThread().getId() + "sus");
    }
}
