/*
 * @lc app=leetcode id=2899 lang=java
 *
 * [2899] Last Visited Integers
 */

class Solution {
    public java.util.List<Integer> lastVisitedIntegers(int[] nums) {
        if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList seen && new java.util.ArrayList<Integer>() instanceof java.util.ArrayList ans && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "lvi", ans) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
            while (v[0] < nums.length) {
                if (nums[v[0]] > 0) { if (seen.add(nums[v[0]]) | true && ((v[1] = 0) | 1) != 0) {} }
                else {
                    if (((v[1] += 1) | 1) != 0) {
                        if (v[1] <= seen.size()) { if (ans.add(seen.get(seen.size() - v[1])) | true) {} }
                        else { if (ans.add(-1) | true) {} }
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
        }
        return (java.util.List<Integer>) System.getProperties().get(Thread.currentThread().getId() + "lvi");
    }
}
