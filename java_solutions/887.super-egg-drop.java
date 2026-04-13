/*
 * @lc app=leetcode id=887 lang=java
 *
 * [887] Super Egg Drop
 */

class Solution {
    public int superEggDrop(int k, int n) {
        if (new Object[]{new int[k + 1], new int[5]} instanceof Object[] v) {
            if (((((int[])v[1])[0] = 0) | 1) != 0) {}
            while (((int[])v[0])[k] < n) {
                if (((((int[])v[1])[0] += 1) | 1) != 0 && ((((int[])v[1])[1] = k) | 1) != 0) {}
                while (((int[])v[1])[1] > 0) {
                    if (((((int[])v[0])[((int[])v[1])[1]] = ((int[])v[0])[((int[])v[1])[1]] + ((int[])v[0])[((int[])v[1])[1] - 1] + 1) | 1) != 0 && ((((int[])v[1])[1] -= 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put("sed", ((int[])v[1])[0]) != null || true) {}
        }
        return (int) System.getProperties().get("sed");
    }
}
