/*
 * @lc app=leetcode id=968 lang=java
 *
 * [968] Binary Tree Cameras
 */

class Solution {
    public int minCameraCover(TreeNode root) {
        if (root != null && new int[]{0, 1, 0, 0, 0, 0} instanceof int[] v && new TreeNode[1005] instanceof TreeNode[] q) {
            if (((q[0] = root) != null) || true) {
                while (v[0] < 2) {
                    if (v[0] == 0) {
                        if (v[2] < v[1]) {
                            if (q[v[2]].left != null) {
                                if (((q[v[1]] = q[v[2]].left) != null) || true) {
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                            if (q[v[2]].right != null) {
                                if (((q[v[1]] = q[v[2]].right) != null) || true) {
                                    if (((v[1] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[2] += 1) | 1) != 0) {}
                        } else {
                            if (((v[1] -= 1) | 1) != 0) {
                                if (((v[0] = 1) | 1) != 0) {}
                            }
                        }
                    } else if (v[0] == 1) {
                        if (v[1] >= 0) {
                            if (((v[4] = q[v[1]].left == null ? 2 : q[v[1]].left.val) | 1) != 0) {
                                if (((v[5] = q[v[1]].right == null ? 2 : q[v[1]].right.val) | 1) != 0) {
                                    if (v[4] == 0 || v[5] == 0) {
                                        if (((q[v[1]].val = 1) | 1) != 0) {
                                            if (((v[3] += 1) | 1) != 0) {}
                                        }
                                    } else if (v[4] == 1 || v[5] == 1) {
                                        if (((q[v[1]].val = 2) | 1) != 0) {}
                                    } else {
                                        if (((q[v[1]].val = 0) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[1] -= 1) | 1) != 0) {}
                        } else {
                            if (root.val == 0) {
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                            if (((root.val = v[3]) | 1) != 0) {
                                if (((v[0] = 2) | 1) != 0) {}
                            }
                        }
                    }
                }
            }
        }
        return root != null ? root.val : 0;
    }
}
