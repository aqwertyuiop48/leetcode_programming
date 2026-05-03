/*
 * @lc app=leetcode id=3184 lang=java
 *
 * [3184] Count Pairs That Form a Complete Day I
 */

class Solution {
    public int countCompleteDayPairs(int[] hours) {
        if (new int[25] instanceof int[] cnt && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "ccdp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < hours.length) {
                    if (((v[2] = hours[v[0]] % 24) | 1) != 0 && ((v[3] = (24 - v[2]) % 24) | 1) != 0) {
                        if (((v[1] += cnt[v[3]]) | 1) != 0 && ((cnt[v[2]] += 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "ccdp", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "ccdp");
    }
}
