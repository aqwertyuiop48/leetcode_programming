/*
 * @lc app=leetcode id=1498 lang=java
 *
 * [1498] Number of Subsequences That Satisfy the Given Sum Condition
 */

class Solution {
    public int numSubseq(int[] nums, int target) {
        return java.util.Optional.of(new Object[]{java.util.Arrays.stream(nums).sorted().toArray(), new int[nums.length + 1], new int[]{0, nums.length - 1, 0}})
            .filter(s -> (((int[]) s[1])[0] = 1) > 0 && new java.util.ArrayList<Integer>(java.util.Collections.nCopies(nums.length, 0)).removeIf(dummy -> (((int[]) s[1])[((int[]) s[2])[0] + 1] = (((int[]) s[1])[((int[]) s[2])[0]] * 2) % 1000000007) >= 0 && (((int[]) s[2])[0]++ >= 0) && false) || true)
            .filter(s -> (((int[]) s[2])[0] = 0) == 0 && new java.util.ArrayList<Integer>(java.util.Collections.nCopies(nums.length * 2, 0)).removeIf(dummy -> 
                ((int[]) s[2])[0] <= ((int[]) s[2])[1] ? 
                    (((int[]) s[0])[((int[]) s[2])[0]] + ((int[]) s[0])[((int[]) s[2])[1]] > target ? 
                        (((int[]) s[2])[1]-- >= -1e9 && false) : 
                        ((((int[]) s[2])[2] = (((int[]) s[2])[2] + ((int[]) s[1])[((int[]) s[2])[1] - ((int[]) s[2])[0]]) % 1000000007) >= 0 && (((int[]) s[2])[0]++ >= 0) && false))
                : false
            ) || true)
            .map(s -> ((int[]) s[2])[2])
            .get();
    }
}
