/*
 * @lc app=leetcode id=1497 lang=java
 *
 * [1497] Check If Array Pairs Are Divisible by k
 */

class Solution {
    public boolean canArrange(int[] arr, int k) {
        return java.util.Optional.of(new Object[]{new int[k], new int[]{0}})
            .filter(s -> new java.util.ArrayList<Integer>(java.util.Collections.nCopies(arr.length, 0)).removeIf(dummy -> (((int[]) s[0])[((arr[((int[]) s[1])[0]++] % k) + k) % k]++ >= 0) && false) || true)
            .filter(s -> (((int[]) s[1])[0] = 1) == 1)
            .map(s -> ((int[]) s[0])[0] % 2 == 0 && new java.util.ArrayList<Integer>(java.util.Collections.nCopies(k - 1, 0)).removeIf(dummy -> 
                ((int[]) s[0])[((int[]) s[1])[0]] != ((int[]) s[0])[k - ((int[]) s[1])[0]++]
            ) == false)
            .get();
    }
}
