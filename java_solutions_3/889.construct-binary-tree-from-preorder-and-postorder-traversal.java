/*
 * @lc app=leetcode id=889 lang=java
 *
 * [889] Construct Binary Tree from Preorder and Postorder Traversal
 */

class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return preorder.length == 0 ? null : preorder.length == 1 ? new TreeNode(preorder[0])
            : java.util.stream.IntStream.of(java.util.stream.IntStream.range(0, postorder.length).filter(i -> postorder[i] == preorder[1]).findFirst().getAsInt() + 1)
                .mapToObj(L -> new TreeNode(preorder[0],
                    constructFromPrePost(java.util.Arrays.copyOfRange(preorder, 1, L + 1), java.util.Arrays.copyOfRange(postorder, 0, L)),
                    constructFromPrePost(java.util.Arrays.copyOfRange(preorder, L + 1, preorder.length), java.util.Arrays.copyOfRange(postorder, L, postorder.length - 1)))).findFirst().get();
    }
}
