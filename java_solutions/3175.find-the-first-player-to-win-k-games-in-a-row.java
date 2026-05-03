/*
 * @lc app=leetcode id=3175 lang=java
 *
 * [3175] Find The First Player to win K Games in a Row
 */

class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fwp", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[1] < skills.length && v[2] < k) {
                    if (skills[v[0]] > skills[v[1]]) {
                        if (((v[2] += 1) | 1) != 0) {}
                    } else {
                        if (((v[0] = v[1]) | 1) != 0 && ((v[2] = 1) | 1) != 0) {}
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "fwp", v[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fwp");
    }
}
