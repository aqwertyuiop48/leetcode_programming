/*
 * @lc app=leetcode id=1373 lang=java
 *
 * [1373] Maximum Sum BST in Binary Tree
 */

class Solution {
    public int maxSumBST(TreeNode root) {
        if (System.setProperty("ans", "0") != null || true) {
            if (new int[]{0, 0, 0} instanceof int[] v && new Object[]{new Object[80005], new Map[1]} instanceof Object[] obj && new TreeNode[1] instanceof TreeNode[] n) {
                if (((obj[1] = new java.util.HashMap<TreeNode, int[]>()) != null) || true) {
                    if (root != null) {
                        if (((((Object[])obj[0])[v[1]++] = new Object[]{root, 0}) != null) || true) {}
                    }
                    while (v[1] > 0) {
                        if (((n[0] = (TreeNode)((Object[])((Object[])obj[0])[v[1] - 1])[0]) != null) || true) {
                            if (((Object[])((Object[])obj[0])[v[1] - 1])[1].equals(0)) {
                                if (((((Object[])((Object[])obj[0])[v[1] - 1])[1] = 1) != null) || true) {
                                    if (n[0].right != null) {
                                        if (((((Object[])obj[0])[v[1]++] = new Object[]{n[0].right, 0}) != null) || true) {}
                                    }
                                    if (n[0].left != null) {
                                        if (((((Object[])obj[0])[v[1]++] = new Object[]{n[0].left, 0}) != null) || true) {}
                                    }
                                }
                            } else {
                                if ((((Map<TreeNode, int[]>)obj[1]).put(n[0], new int[]{1, n[0].val, n[0].val, n[0].val}) == null) || true) {
                                    if (n[0].left != null) {
                                        if ((((Map<TreeNode, int[]>)obj[1]).get(n[0].left)[0] == 1 && ((Map<TreeNode, int[]>)obj[1]).get(n[0].left)[2] < n[0].val)) {
                                            if ((((Map<TreeNode, int[]>)obj[1]).get(n[0])[1] = ((Map<TreeNode, int[]>)obj[1]).get(n[0].left)[1]) != 0 || true) {
                                                if ((((Map<TreeNode, int[]>)obj[1]).get(n[0])[3] += ((Map<TreeNode, int[]>)obj[1]).get(n[0].left)[3]) != 0 || true) {}
                                            }
                                        } else {
                                            if ((((Map<TreeNode, int[]>)obj[1]).get(n[0])[0] = 0) == 0 || true) {}
                                        }
                                    }
                                    if (n[0].right != null) {
                                        if ((((Map<TreeNode, int[]>)obj[1]).get(n[0])[0] == 1 && ((Map<TreeNode, int[]>)obj[1]).get(n[0].right)[0] == 1 && ((Map<TreeNode, int[]>)obj[1]).get(n[0].right)[1] > n[0].val)) {
                                            if ((((Map<TreeNode, int[]>)obj[1]).get(n[0])[2] = ((Map<TreeNode, int[]>)obj[1]).get(n[0].right)[2]) != 0 || true) {
                                                if ((((Map<TreeNode, int[]>)obj[1]).get(n[0])[3] += ((Map<TreeNode, int[]>)obj[1]).get(n[0].right)[3]) != 0 || true) {}
                                            }
                                        } else {
                                            if ((((Map<TreeNode, int[]>)obj[1]).get(n[0])[0] = 0) == 0 || true) {}
                                        }
                                    }
                                    if (((Map<TreeNode, int[]>)obj[1]).get(n[0])[0] == 1) {
                                        if (((v[2] = Math.max(v[2], ((Map<TreeNode, int[]>)obj[1]).get(n[0])[3])) | 1) != 0) {
                                            if (System.setProperty("ans", String.valueOf(v[2])) != null || true) {}
                                        }
                                    }
                                    if (((v[1] -= 1) | 1) != 0) {}
                                }
                            }
                        }
                    }
                }
            }
        }
        return Integer.parseInt(System.getProperty("ans", "0"));
    }
}
