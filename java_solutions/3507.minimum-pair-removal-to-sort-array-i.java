/*
 * @lc app=leetcode id=3507 lang=java
 *
 * [3507] Minimum Pair Removal to Sort Array I
 */

class Solution {
    public int minimumPairRemoval(int[] nums) {
        if (new java.util.ArrayList<Integer>() instanceof java.util.ArrayList list && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpr", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (list.add(nums[v[0]]) | true && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 0) | 1) != 0 && ((v[6] = 1) | 1) != 0) {
                while (v[6] == 1) {
                    if (((v[1] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0 && ((v[7] = 1) | 1) != 0) {
                        while (v[1] < list.size() - 1 && v[7] == 1) {
                            if ((int)list.get(v[1]) > (int)list.get(v[1] + 1)) { if (((v[2] = 1) | 1) != 0 && ((v[7] = 0) | 1) != 0) {} }
                            else { if (((v[1] += 1) | 1) != 0) {} }
                        }
                    }
                    if (v[2] == 0) { if (((v[6] = 0) | 1) != 0) {} }
                    else {
                        if (((v[3] = 0) | 1) != 0 && ((v[4] = (int)list.get(0) + (int)list.get(1)) | 1) != 0 && ((v[1] = 1) | 1) != 0) {
                            while (v[1] < list.size() - 1) {
                                if (((v[5] = (int)list.get(v[1]) + (int)list.get(v[1] + 1)) | 1) != 0) {
                                    if (v[5] < v[4]) { if (((v[4] = v[5]) | 1) != 0 && ((v[3] = v[1]) | 1) != 0) {} }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (list.set(v[3], v[4]) != null | true && list.remove(v[3] + 1) != null | true && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mpr", v[0]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mpr");
    }
}
