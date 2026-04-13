/*
 * @lc app=leetcode id=1460 lang=java
 *
 * [1460] Make Two Arrays Equal by Reversing Subarrays
 */

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        return Arrays.equals(Arrays.stream(target).sorted().toArray(), 
                             Arrays.stream(arr).sorted().toArray());
    }
}
