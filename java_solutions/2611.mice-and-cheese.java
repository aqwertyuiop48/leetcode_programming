/*
 * @lc app=leetcode id=2611 lang=java
 *
 * [2611] Mice and Cheese
 */

class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        if (new int[reward1.length] instanceof int[] diff && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mac", 0) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < reward1.length) { if (((diff[v[0]] = reward1[v[0]] - reward2[v[0]]) | 1) != 0 && ((v[1] += reward2[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if ((diff = java.util.Arrays.stream(diff).sorted().toArray()) != null && ((v[0] = reward1.length - 1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[2] < k) { if (((v[1] += diff[v[0]--]) | 1) != 0 && ((v[2] += 1) | 1) != 0) {} }
                if (System.getProperties().put(Thread.currentThread().getId() + "mac", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mac");
    }
}
