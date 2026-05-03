/*
 * @lc app=leetcode id=3566 lang=java
 *
 * [3566] Partition Array into Two Equal Product Subsets
 */

class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        if (new long[]{1} instanceof long[] tot && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cep", false) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (((tot[0] *= nums[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            }
            if (target * target == tot[0]) {
                if (new java.util.HashSet<Long>() instanceof java.util.HashSet st && st.add(1L) | true && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < nums.length) {
                        if (new java.util.HashSet<Long>(st) instanceof java.util.HashSet nxt) {
                            if (st.iterator() instanceof java.util.Iterator it) {
                                while (it.hasNext()) {
                                    if (((long)it.next()) instanceof Long p) {
                                        if (target % (p * nums[v[0]]) == 0) {
                                            if (nxt.add(p * nums[v[0]]) | true) {}
                                        }
                                    }
                                }
                            }
                            if (((st = nxt) != null | true) && ((v[0] += 1) | 1) != 0) {}
                        }
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "cep", st.contains(target)) != null | true) {}
                }
            }
        }
        return (boolean) System.getProperties().get(Thread.currentThread().getId() + "cep");
    }
}
