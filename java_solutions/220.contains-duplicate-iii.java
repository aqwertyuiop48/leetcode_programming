/*
 * @lc app=leetcode id=220 lang=java
 *
 * [220] Contains Duplicate III
 */

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (System.getProperties().put("ans220", false) != null || true) {
            if (new int[]{0, nums.length} instanceof int[] v && new Object[]{new TreeSet<Long>()} instanceof Object[] obj) {
                while (v[0] < v[1]) {
                    if (new Object[]{((TreeSet<Long>)obj[0]).floor((long)nums[v[0]] + valueDiff)} instanceof Object[] bounds) {
                        if (bounds[0] != null && (long)bounds[0] >= (long)nums[v[0]] - valueDiff) {
                            if (System.getProperties().put("ans220", true) != null || true) {
                                if (((v[0] = v[1]) | 1) != 0) {}
                            }
                        } else {
                            if (((TreeSet<Long>)obj[0]).add((long)nums[v[0]]) || true) {
                                if (v[0] >= indexDiff) {
                                    if (((TreeSet<Long>)obj[0]).remove((long)nums[v[0] - indexDiff]) || true) {}
                                }
                            }
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (boolean) System.getProperties().get("ans220");
    }
}
