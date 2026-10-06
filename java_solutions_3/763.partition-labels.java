/*
 * @lc app=leetcode id=763 lang=java
 *
 * [763] Partition Labels
 */

class Solution {
    public List<Integer> partitionLabels(String s) {
        return new int[]{-1, 0} instanceof int[] st
            ? java.util.stream.IntStream.range(0, s.length()).filter(i -> (st[1] = Math.max(st[1], s.lastIndexOf(s.charAt(i)))) == i)
                .map(i -> i - st[0] + 0 * (st[0] = i)).boxed().toList()
            : null;
    }
}
