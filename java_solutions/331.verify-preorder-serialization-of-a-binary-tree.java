/*
 * @lc app=leetcode id=331 lang=java
 *
 * [331] Verify Preorder Serialization of a Binary Tree
 */

class Solution {
    public boolean isValidSerialization(String preorder) {
        return java.util.Arrays.stream(preorder.split(",")).reduce(1, (diff, node) -> diff <= 0 ? -1 : diff - 1 + (node.equals("#") ? 0 : 2), (a, b) -> a) == 0;
    }
}
