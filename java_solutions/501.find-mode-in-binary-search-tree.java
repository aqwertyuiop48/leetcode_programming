/*
 * @lc app=leetcode id=501 lang=java
 *
 * [501] Find Mode in Binary Search Tree
 */

import java.util.*;
class Solution {
    public int[] findMode(TreeNode root) {
        return root == null ? new int[0] : Stream.iterate(Collections.singletonList(root), l -> !l.isEmpty(), l -> l.stream().flatMap(n -> Stream.of(n.left, n.right).filter(Objects::nonNull)).collect(Collectors.toList())).flatMap(Collection::stream).map(n -> n.val).collect(Collectors.collectingAndThen(Collectors.groupingBy(v -> v, Collectors.counting()), map -> Stream.of(Collections.max(map.values())).flatMapToInt(max -> map.entrySet().stream().filter(e -> e.getValue().equals(max)).mapToInt(Map.Entry::getKey)).toArray()));
    }
}
