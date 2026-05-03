/*
 * @lc app=leetcode id=365 lang=java
 *
 * [365] Water and Jug Problem
 */

class Solution {
    public boolean canMeasureWater(int j1, int j2, int target) {
        return target == 0 || (target <= j1 + j2 && target % java.util.stream.Stream.iterate(new int[]{j1, j2}, a -> new int[]{a[1], a[0] % a[1]}).filter(a -> a[1] == 0).findFirst().get()[0] == 0);
    }
}
