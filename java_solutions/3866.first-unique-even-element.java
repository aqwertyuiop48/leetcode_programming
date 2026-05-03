/*
 * @lc app=leetcode id=3866 lang=java
 *
 * [3866] First Unique Even Element
 */

class Solution {
    public int firstUniqueEven(int[] nums) {
        if (new int[100005] instanceof int[] freq && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "fue", -1) != null | true) && ((v[0] = 0) | 1) != 0) {
            while (v[0] < nums.length) { if (((freq[nums[v[0]]] += 1) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < nums.length && v[1] == 0) {
                    if (nums[v[0]] % 2 == 0 && freq[nums[v[0]]] == 1) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "fue", nums[v[0]]) != null | true && ((v[1] = 1) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "fue");
    }
}
