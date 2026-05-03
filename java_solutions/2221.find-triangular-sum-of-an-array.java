/*
 * @lc app=leetcode id=2221 lang=java
 *
 * [2221] Find Triangular Sum of an Array
 */

class Solution {
    public int triangularSum(int[] nums) {
        if (new int[nums.length] instanceof int[] arr && new int[10] instanceof int[] v && (System.getProperties().put("tsa", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((arr[v[0]] = nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[1] = nums.length) | 1) != 0) {
                    while (v[1] > 1) {
                        if (((v[0] = 0) | 1) != 0) {
                            while (v[0] < v[1] - 1) {
                                if (((arr[v[0]] = (arr[v[0]] + arr[v[0] + 1]) % 10) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] -= 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("tsa", arr[0]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get("tsa");
    }
}
