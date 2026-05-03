/*
 * @lc app=leetcode id=2766 lang=java
 *
 * [2766] Relocate Marbles
 */

class Solution {
    public java.util.List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        if (System.getProperties().put("rm_s", new java.util.HashSet<Integer>()) != null | true && new int[10] instanceof int[] v) {
            if (System.getProperties().get("rm_s") instanceof java.util.Set s && ((v[0] = 0) | 1) != 0) {
                while (v[0] < nums.length) { if (s.add(nums[v[0]++]) | true) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < moveFrom.length) {
                        if (s.remove(moveFrom[v[0]]) | true && s.add(moveTo[v[0]]) | true && ((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put("rm_ans", ((java.util.Set<Integer>)s).stream().sorted().collect(java.util.stream.Collectors.toList())) != null | true) {}
                }
            }
        }
        return (java.util.List<Integer>) System.getProperties().get("rm_ans");
    }
}
