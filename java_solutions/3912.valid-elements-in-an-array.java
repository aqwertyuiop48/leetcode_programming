/*
 * @lc app=leetcode id=3912 lang=java
 *
 * [3912] Valid Elements in an Array
 */

class Solution {
    public java.util.List<Integer> findValidElements(int[] nums) {
        if (new int[nums.length] instanceof int[] pMax && new int[nums.length] instanceof int[] sMax && new int[10] instanceof int[] v && (System.getProperties().put("ve", new java.util.ArrayList<Integer>()) != null | true)) {
            if (System.getProperties().get("ve") instanceof java.util.List res) {
                if (nums.length == 1) { if (res.add(nums[0]) | true) {} }
                else if (((pMax[0] = nums[0]) | 1) != 0 && ((v[0] = 1) | 1) != 0) {
                    while (v[0] < nums.length) { if (((pMax[v[0]] = Math.max(pMax[v[0] - 1], nums[v[0]])) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                    if (((sMax[nums.length - 1] = nums[nums.length - 1]) | 1) != 0 && ((v[0] = nums.length - 2) | 1) != 0) {
                        while (v[0] >= 0) { if (((sMax[v[0]] = Math.max(sMax[v[0] + 1], nums[v[0]])) | 1) != 0 && ((v[0] -= 1) | 1) != 0) {} }
                        if (res.add(nums[0]) | true && ((v[0] = 1) | 1) != 0) {
                            while (v[0] < nums.length - 1) {
                                if (nums[v[0]] > pMax[v[0] - 1] || nums[v[0]] > sMax[v[0] + 1]) { if (res.add(nums[v[0]]) | true) {} }
                                if (((v[0] += 1) | 1) != 0) {}
                            }
                            if (res.add(nums[nums.length - 1]) | true) {}
                        }
                    }
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("ve");
    }
}
