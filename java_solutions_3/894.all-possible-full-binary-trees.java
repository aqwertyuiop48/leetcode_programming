/*
 * @lc app=leetcode id=894 lang=java
 *
 * [894] All Possible Full Binary Trees
 */

class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        return n % 2 == 0 ? java.util.List.of() : n == 1 ? java.util.List.of(new TreeNode(0))
            : java.util.stream.IntStream.range(0, n / 2).map(i -> 2 * i + 1).boxed().flatMap(l -> allPossibleFBT(l).stream()
                .flatMap(a -> allPossibleFBT(n - 1 - l).stream().map(b -> new TreeNode(0, a, b)))).toList();
    }
}
