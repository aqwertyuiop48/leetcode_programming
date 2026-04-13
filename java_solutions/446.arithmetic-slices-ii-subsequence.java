/*
 * @lc app=leetcode id=446 lang=java
 *
 * [446] Arithmetic Slices II - Subsequence
 */

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if (System.getProperties().put("ans446", 0) != null || true) {
            if (new int[]{0, 0, 0} instanceof int[] v && new Object[]{new HashMap[nums.length]} instanceof Object[] obj) {
                while (v[0] < nums.length) {
                    if ((((HashMap<Long, Integer>[])obj[0])[v[0]] = new HashMap<>()) != null || true) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < v[0]) {
                                if (new long[]{(long)nums[v[0]] - nums[v[1]], ((HashMap<Long, Integer>[])obj[0])[v[1]].getOrDefault((long)nums[v[0]] - nums[v[1]], 0)} instanceof long[] l) {
                                    if ((((HashMap<Long, Integer>[])obj[0])[v[0]].put(l[0], ((HashMap<Long, Integer>[])obj[0])[v[0]].getOrDefault(l[0], 0) + (int)l[1] + 1)) == null || true) {
                                        if (((v[2] += (int)l[1]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[0] += 1) | 1) != 0) {}
                        }
                    }
                }
                if (System.getProperties().put("ans446", v[2]) != null || true) {}
            }
        }
        return (int) System.getProperties().get("ans446");
    }
}
