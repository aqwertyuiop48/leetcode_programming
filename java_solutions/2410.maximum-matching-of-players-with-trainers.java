/*
 * @lc app=leetcode id=2410 lang=java
 *
 * [2410] Maximum Matching of Players With Trainers
 */

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mm", 0) != null | true) && (System.getProperties().put("p1", java.util.Arrays.stream(players).sorted().toArray()) != null | true) && (System.getProperties().put("t1", java.util.Arrays.stream(trainers).sorted().toArray()) != null | true)) {
            if (System.getProperties().get("p1") instanceof int[] pSorted && System.getProperties().get("t1") instanceof int[] tSorted && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < pSorted.length && v[1] < tSorted.length) {
                    if (pSorted[v[0]] <= tSorted[v[1]]) { if (((v[2] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    if (((v[1] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mm", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mm");
    }
}
